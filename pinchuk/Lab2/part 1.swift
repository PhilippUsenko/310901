import Foundation

// Просим пользователя ввести число
print("Введите натуральное число P: ", terminator: "")

// Считываем введённую строку
if let input = readLine(), let P = Int(input) {
    // Фильтруем цифры, удаляя '0', и объединяем результат обратно в строку
    let result = String(String(P).filter { $0 != "0" })

    // Преобразуем строку обратно в число (если необходимо) и выводим результат
    if let finalNumber = Int(result) {
        print("Результат: \(finalNumber)")
    } else {
        print("Ошибка преобразования")
    }
} else {
    print("Некорректный ввод")
}
