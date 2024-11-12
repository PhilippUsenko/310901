package actions

import models.Character
import models.Quest

object QuestActions {
    fun startQuest(character: Character, quest: Quest) {
        character.takeQuest(quest)
        println("Квест: ${quest.introText}")
    }

    fun completeQuest(quest: Quest): String {
        return quest.complete()
    }
}
