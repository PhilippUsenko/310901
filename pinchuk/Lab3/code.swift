import Foundation

// Определение класса Car
class Car {
    // Атрибуты класса
    var color: String
    var type: String
    var year: Int

    // Конструктор
    init(color: String, type: String, year: Int) {
        self.color = color
        self.type = type
        self.year = year
    }

    // Метод для запуска автомобиля
    func start() {
        print("Автомобиль заведен")
    }

    // Метод для отключения автомобиля
    func stop() {
        print("Автомобиль заглушен")
    }

    // Метод для присвоения года выпуска автомобилю
    func setYear(_ year: Int) {
        self.year = year
        print("Год выпуска автомобиля: \(year)")
    }

    // Метод для присвоения типа автомобилю
    func setType(_ type: String) {
        self.type = type
        print("Тип автомобиля: \(type)")
    }

    // Метод для присвоения цвета автомобилю
    func setColor(_ color: String) {
        self.color = color
        print("Цвет автомобиля: \(color)")
    }
}

// Пример использования класса Car
let myCar = Car(color: "Красный", type: "Седан", year: 2020)

// Вызов методов
myCar.start()
myCar.stop()
myCar.setYear(2022)
myCar.setType("Кроссовер")
myCar.setColor("Черный")
