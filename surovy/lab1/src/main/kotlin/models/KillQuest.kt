package models

class KillQuest(
    introText: String,
    completionText: String,
    val monsterType: String,
    val monsterCount: Int
) : Quest(introText, completionText) {

    private var killedCount = 0

    fun killMonster() {
        if (killedCount < monsterCount) {
            killedCount++
            println("Убито монстров: $killedCount из $monsterCount")
        }
    }

    override fun complete(): String {
        return if (killedCount == monsterCount) {
            completionText
        } else {
            "Квест не выполнен, нужно убить еще ${monsterCount - killedCount} монстров."
        }
    }
}
