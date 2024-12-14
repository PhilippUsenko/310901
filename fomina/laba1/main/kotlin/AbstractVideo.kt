open class AbstractVideo(
    protected val name: String,
    protected val length: Int
) {
    val videoName: String
        get() = name

    val videoLength: Int
        get() = length
}
