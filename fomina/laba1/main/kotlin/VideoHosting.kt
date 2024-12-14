class VideoHosting {
    val videos = mutableListOf<AbstractVideo>()
    private val playlists = mutableListOf<Playlist>()


    fun addVideo(video: AbstractVideo) {
        videos.add(video)
    }

    fun playVideo(name: String) {
        val video = videos.find { it.videoName == name }
        if (video != null) {
            println("Воспроизведение видео: ${video.videoName}, длина: ${video.videoLength}")
        } else {
            println("Видео не найдено!")
        }
    }

    fun showAllVideo() {
        println("Список видео:")
        for (video in videos) {
            println("- ${video.videoName}, длина: ${video.videoLength}")
        }
    }
    fun deleteVideo(name: String) {
        val video = videos.find { it.videoName == name }
        if (video != null) {
            videos.remove(video)
            println("Видео '${name}' удалено.")
            playlists.forEach { it.deleteFromPlaylist(name) }
        } else {
            println("Видео не найдено!")
        }
    }


}