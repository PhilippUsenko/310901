class User() {
    fun createVideo(videoHosting: VideoHosting, video: AbstractVideo) {
        videoHosting.addVideo(video)
        println("Создал видео ${video.videoName}")
    }

    fun watchVideo(videoHosting: VideoHosting, videoName: String) {
        videoHosting.playVideo(videoName)

    }


    fun deleteVideo(videoHosting: VideoHosting, videoName: String) {
        videoHosting.deleteVideo(videoName)

    }

    fun createPlaylist(): Playlist {
        return Playlist()
    }

    fun addToPlaylist(playlist: Playlist, video: AbstractVideo) {
        playlist.addVideo(video)
        println("Добавлено видео ${video.videoName} в плейлист")
    }
}