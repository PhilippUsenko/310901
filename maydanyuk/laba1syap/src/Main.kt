// Абстрактный класс AbstractFile
abstract class AbstractFile(val path: String, private val creationDate: String) {
    //детали файла
    abstract fun getDetails(): String//детали файла
}

// Класс Program, наследующий AbstractFile
class Program(val name: String, private val author: String, path: String, creationDate: String) : AbstractFile(path, creationDate) {
    override fun getDetails(): String {
        return "Program: $name, Author: $author"
    }
}

// Класс VideoFile, наследующий AbstractFile
class VideoFile(private val length: Int, private val format: String, path: String, creationDate: String) : AbstractFile(path, creationDate) {
    override fun getDetails(): String {
        return "Video File: Format: $format, Length: $length seconds"
    }
    //формат видео
    fun getFormat(): String {
        return format
    }
}

// Класс Player
class Player(private val supportedFormats: List<String>) {
    //воспроизведение программы
    fun playProgram(program: Program) {
        println("Playing program: ${program.getDetails()}")
    }
    //воспроизведение видео
    fun playVideo(video: VideoFile) {
        if (checkFormat(video)) {
            println("Playing video: ${video.getDetails()}")
        } else {
            println("Unsupported video format: ${video.getFormat()}")
        }
    }
    //проверка поддержки формата
    private fun checkFormat(video: VideoFile): Boolean {
        return supportedFormats.contains(video.getFormat())
    }
}

// Класс Browser
class Browser {
    fun downloadFile(file: AbstractFile) {
        println("Downloading file: ${file.getDetails()}")
    }

    private fun openWebPage(url: String) {
        println("Opening web page: $url")
    }
}

// Класс Computer
class Computer {
    private val programs = mutableListOf<Program>()
    private val files = mutableListOf<AbstractFile>()

    fun addProgram(program: Program) {
        programs.add(program)
        files.add(program)
        println("Added program: ${program.getDetails()}")
    }

    fun removeProgram(program: Program) {
        programs.remove(program)
        files.remove(program)
        println("Removed program: ${program.getDetails()}")
    }

    fun addFile(file: AbstractFile) {
        files.add(file)
        println("Added file: ${file.getDetails()}")
    }
}

// Класс User
class User(private val name: String) { // Имя приватное
    fun downloadProgram(browser: Browser, program: Program) {
        browser.downloadFile(program)
    }

    fun installProgram(computer: Computer, program: Program) {
        computer.addProgram(program)
    }

    fun useProgram(program: Program) {
        println("$name is using ${program.getDetails()}")
    }

    fun useComputer(computer: Computer) {
        println("$name is using the computer.")
    }
}

// Пример использования
fun main() {
    val user = User("Angelina")
    val browser = Browser()
    val computer = Computer()

    val program = Program("Photo Editor", "Tom Noll", "/apps/photo_editor", "2023-09-20")
    val videoFile = VideoFile(120, "mp4", "/videos/my_video.mp4", "2023-09-21")

    // Пользователь скачивает и устанавливает программу
    user.downloadProgram(browser, program)
    user.installProgram(computer, program)
    user.useProgram(program)

    // Пользователь использует компьютер
    user.useComputer(computer)

    // Добавляем видеофайл в компьютер
    computer.addFile(videoFile)

    // Создаем плеер и воспроизводим видео и программу
    val player = Player(listOf("mp4", "avi"))
    player.playProgram(program)
    player.playVideo(videoFile)
}