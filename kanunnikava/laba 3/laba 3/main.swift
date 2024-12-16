// main.swift
import Foundation
// функция для чтения ввода и создания вектора
func readVectorInput() -> Vector3D? {
    print("Введите координаты вектора (x, y, z) через пробел:")
    guard let input = readLine(), // чтение строки ввода с консоли и присваивание её переменной
    //если ввод неудачный, выполнение функции прерывается.
          let x = Double(input.components(separatedBy: " ")[0]),
          let y = Double(input.components(separatedBy: " ")[1]),
          let z = Double(input.components(separatedBy: " ")[2]),
          Validator.validate(x: x, y: y, z: z) else { // проверка корректности значений x, y и z
        print("Неверный ввод. Попробуйте еще раз.")
        return nil
    }
    return Vector3D(x: x, y: y, z: z) // создание и возвращение экземпляра класса Vector3D с указанными координатами x, y и z
}

// считываем первый вектор
print("Введите первый вектор:")
guard let vector1 = readVectorInput() else { // проверка, удалось ли функции создать объект
    fatalError("Ошибка ввода первого вектора.")
}

// считываем второй вектор
print("Введите второй вектор:")
guard let vector2 = readVectorInput() else { // проверка, удалось ли функции создать объект
    fatalError("Ошибка ввода второго вектора.")
}

// считываем скаляр
print("Введите скаляр:")
guard let scalarInput = readLine(), // считывает строку, введенную пользователем с клавиатуры
let scalar = Double(scalarInput), // преобразует введенную строку в число типа Double
scalar.isFinite else { // проверяет, является ли значение конечным числом
    fatalError("Ошибка ввода скаляра.")
}

print("Вектор 1: \(vector1.toString())")
print("Вектор 2: \(vector2.toString())")
print("Добавление: \(vector1.add(vector2).toString())")
print("Вычитание: \(vector1.subtract(vector2).toString())")
print("Скалярное произведение: \(vector1.dotProduct(vector2))")
print("Векторное произведение: \(vector1.crossProduct(vector2).toString())")
print("Длина вектора 1: \(vector1.length())")
print("Длина вектора 2: \(vector2.length())")
print("Вектор 1, умноженный на скаляр: \(vector1.multiplyByScalar(scalar).toString())")
print("Вектор 1, разделенный на скалярный: \(vector1.divideByScalar(scalar).toString())")
print("Вектор 2, умноженный на скаляр: \(vector2.multiplyByScalar(scalar).toString())")
print("Вектор 2, разделенный на скалярный: \(vector2.divideByScalar(scalar).toString())")
