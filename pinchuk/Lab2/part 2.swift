import Foundation

// Функция для нахождения минимального элемента в последовательности целых чисел
func findMinElement(in sequence: [Int]) -> Int? {
    return sequence.min()
}

// Функция для нахождения длины самого короткого слова в строке
func findLengthOfShortestWord(in sentence: String) -> Int? {
    let words = sentence.split(separator: " ")
    return words.map { $0.count }.min()
}

// Пример использования первой функции
let sequence = [10, -3, 5, 7, -9, 2]
if let minElement = findMinElement(in: sequence) {
    print("Минимальный элемент в последовательности \(sequence): \(minElement)")
} else {
    print("Последовательность пуста")
}

// Пример использования второй функции
let sentence = "Это тестовая строка для поиска самого короткого слова"
if let shortestWordLength = findLengthOfShortestWord(in: sentence) {
    print("Длина самого короткого слова в строке '\(sentence)': \(shortestWordLength)")
} else {
    print("Строка пуста или нет слов")
}
