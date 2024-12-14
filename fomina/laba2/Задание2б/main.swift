 import Foundation
func removeOddWords(from input: String) -> String {
    let words = input.split(separator: " ")
    let evenWords = words.enumerated().filter { (index, element) in
        index % 2 == 1
    }.map { (index, element) in
        element
    }
    return evenWords.joined(separator: " ")
}

print("Введите строку:")
if let sentence = readLine() {
    let filteredSentence = removeOddWords(from: sentence)
    print("Строка после удаления нечетных слов: \(filteredSentence)")
} else {
    print("Ошибка при вводе строки.")
}
