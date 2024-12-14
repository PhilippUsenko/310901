class Kitten {
    let name: String
    private var answerToggle = true // Переменная для переключения ответов "да" и "нет"
    private var yesCount = 0
    private var noCount = 0

    init(name: String) {
        self.name = name
    }

    func toAnswer() -> String {
        if answerToggle {
            yesCount += 1
            answerToggle = false
            return "moore-moore"
        } else {
            noCount += 1
            answerToggle = true
            return "meow-meow"
        }
    }

    func numberYes() -> Int {
        return yesCount
    }

    func numberNo() -> Int {
        return noCount
    }
}

// Пример использования
let kitten = Kitten(name: "Сёма")


print(kitten.toAnswer())
print(kitten.toAnswer())
print(kitten.toAnswer())

print("Количество ответов ДА: \(kitten.numberYes())")
print("Количество ответов НЕТ: \(kitten.numberNo())")
