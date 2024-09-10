import Foundation

// Перечисление для обработки ошибок, связанных с некорректными символами
enum NumberSystemError: Error
{ case invalidCharacter }

// Функция для перевода числа из восьмеричной системы счисления в двоичную
func octalToBinary(octal: String) throws -> String {
    // Словарь для сопоставления восьмеричных цифр с двоичными строками
    let octalToBinaryMap: [Character: String] = [
        "0": "000", "1": "001", "2": "010", "3": "011",
        "4": "100", "5": "101", "6": "110", "7": "111"
    ]
    
    var binaryString = ""
    // Проходим по каждой цифре восьмеричного числа
    for char in octal {
        // Проверяем, есть ли соответствие в словаре
        guard let binaryValue = octalToBinaryMap[char] else {
            throw NumberSystemError.invalidCharacter // Если нет, выбрасываем ошибку
        }
        binaryString += binaryValue // Добавляем двоичное значение к результату
    }
    
    // Удаляем ведущие нули для корректного отображения результата
    while binaryString.first == "0" && binaryString.count > 1 {
        binaryString.removeFirst()
    }
    
    return binaryString // Возвращаем двоичное представление числа
}

// Основная часть программы
print("Введите число: ", terminator: "")
if let input = readLine() {
    do {
        let binaryNumber = try octalToBinary(octal: input) // Переводим в двоичную систему
        print("Octal: \(input) -> Binary: \(binaryNumber)") // Выводим результат
    } catch {
        print("Ошибка: \(error)") // Обрабатываем возможные ошибки
    }
} else {
    print("Ошибка ввода")
}

