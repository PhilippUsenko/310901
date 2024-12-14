class Playlist {
    private val videos = mutableListOf<AbstractVideo>()
    private var currentIndex = 0

    fun addVideo(video: AbstractVideo) {
        videos.add(video)
    }

    fun deleteFromPlaylist(name: String) {
        val videoToRemove = videos.find { it.videoName == name }
        if (videoToRemove != null) {
            videos.remove(videoToRemove)

        }
    }

    private fun showNextVideo(video: AbstractVideo){
        println("Воспроизведение видео: ${video.videoName}, длина: ${video.videoLength}")
    }


    fun playPlaylist() {
        while (currentIndex < videos.size) {
            val video = videos[currentIndex]
            showNextVideo(videos[currentIndex])
            println("1. Следующее видео")
            println("2. Предыдущее видео")
            println("3. Выйти из плейлиста")
            when (readLine()?.toIntOrNull()) {
                1 -> {
                    currentIndex++
                    if (currentIndex >= videos.size) {
                        println("Вы достигли конца плейлиста.")
                        currentIndex = videos.size - 1
                    }
                }
                2 -> {
                    if (currentIndex > 0) {
                        currentIndex--
                    } else {
                        println("Вы находитесь в начале плейлиста.")
                    }
                }
                3 -> {

                    return
                }
                else -> println("Неверный выбор. Пожалуйста, выберите снова.")
            }
        }
        currentIndex = 0 // Сброс индекса при достижении конца плейлиста
    }


}