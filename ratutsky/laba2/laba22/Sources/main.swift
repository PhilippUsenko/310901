// The Swift Programming Language
// https://docs.swift.org/swift-book

import Foundation

// а) Количество четных элементов в последовательности целых чисел
func countEvenNumbers(in numbers: [Int]) -> Int {
    return numbers.filter { $0 % 2 == 0 }.count
}

// Пример использования:
let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let evenCount = countEvenNumbers(in: numbers)
print("Количество четных чисел: \(evenCount)")


// б) Количество слов, начинающихся на букву "а" в строке
func countWordsStartingWithA(in text: String) -> Int {
    return text.split(separator: " ").filter { $0.lowercased().hasPrefix("а") }.count
}

// Пример использования:
let text = "Апельсин арбуз банан Ананас яблоко арбуз"
let wordCount = countWordsStartingWithA(in: text)
print("Количество слов, начинающихся на букву 'а': \(wordCount)")
