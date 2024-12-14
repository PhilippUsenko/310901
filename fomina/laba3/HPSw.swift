import Foundation

// Класс Car, представляющий автомобиль

class Car {
    var x: Double
    var y: Double
    var direction: Double // Угол направления движения в градусах

    init(x: Double, y: Double, direction: Double) {
        self.x = x
        self.y = y
        self.direction = direction
    }

    func move(distance: Double) {
        // Переводим угол в радианы для расчетов
        let radians = direction * .pi / 180
        x += distance * cos(radians)
        y += distance * sin(radians)
    }

    func turn(newDirection: Double) {
        direction = newDirection
    }

    func description() -> String {
        return "Машина в координатах (\(x), \(y)) под углом  \(direction) градусов"
    }
}





