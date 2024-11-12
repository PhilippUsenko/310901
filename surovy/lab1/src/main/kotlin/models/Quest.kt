package models

abstract class Quest(
    val introText: String,
    val completionText: String
) {
    abstract fun complete(): String
}
