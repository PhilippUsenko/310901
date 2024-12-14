

fun main() {
    val user = User()
    val videoHosting = VideoHosting()
    val playlist = user.createPlaylist()



    while (true) {
        println("1. Создать видео")
        println("2. Посмотреть видео")
        println("3. Создать плейлист")
        println("4. Добавить видео в плейлист")
        println("5. Воспроизвести плейлист")
        println("6. Вывести список видео")
        println("7. Удалить видео")
        println("8. Выйти")
        print("Выберите опцию: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("1. Видео с котиками")
                println("2. Видео с собаками")
                println("3. Музыкальное видео")
                print("Выберите тип видео: ")
                when (readLine()?.toIntOrNull()) {
                    1 -> {
                        println("Введите название видео: ")
                        val name = readLine() ?: ""
                        println("Введите длину видео: ")
                        val length = readLine()?.toIntOrNull() ?: 0
                        println("Введите описание котиков: ")
                        val cats = readLine() ?: ""
                        val catVideo = CatVideo(name, length, cats)
                        user.createVideo(videoHosting, catVideo)

                    }
                    2 -> {
                        println("Введите название видео: ")
                        val name = readLine() ?: ""
                        println("Введите длину видео: ")
                        val length = readLine()?.toIntOrNull() ?: 0
                        val dogVideo = DogVideo(name, length)
                        user.createVideo(videoHosting, dogVideo)
                    }
                    3 -> {
                        println("Введите название видео: ")
                        val name = readLine() ?: ""
                        println("Введите длину видео: ")
                        val length = readLine()?.toIntOrNull() ?: 0
                        val musicVideo = MusicVideo(name, length)
                        user.createVideo(videoHosting, musicVideo)
                    }
                }
            }
            2 -> {
                println("Введите название видео для просмотра: ")
                val name = readLine() ?: ""
                user.watchVideo(videoHosting, name)

            }
            3 -> {


                println("Плейлист создан.")
            }
            4 -> {
                println("Введите название видео для добавления в плейлист: ")
                val name = readLine() ?: ""
                val video = videoHosting.videos.find { it.videoName == name }
                if (video != null) {
                    user.addToPlaylist(playlist, video)

                } else {
                    println("Видео не найдено!")
                }
            }
            5 -> {
                println("Воспроизведение плейлиста...")
                playlist.playPlaylist()

            }
            6 -> {
                videoHosting.showAllVideo()

            }
            7 -> {
                println("Введите название видео для удаления: ")
                val name = readLine() ?: ""
                user.deleteVideo(videoHosting, name)

                playlist.deleteFromPlaylist(name)

            }
            8 -> {

                break
            }
            else -> println("Неверный выбор. Пожалуйста, выберите снова.")
        }
    }
}
