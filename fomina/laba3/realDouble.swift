import Foundation


// Функция для считывания числового значения с клавиатуры
func readDouble(prompt: String) -> Double {
    print(prompt)
    if let input = readLine(), let value = Double(input) {
        return value
    } else {
        print("Неккоректное значение, введите повторно")
        return readDouble(prompt: prompt)
    }
}

func readInt(prompt: String) -> Int {
    print(prompt)
    if let input = readLine(), let value = Int(input) {
        return value
    } else {
        print("Неккоректное значение, введите повторно")
        return readInt(prompt: prompt)
    }
}