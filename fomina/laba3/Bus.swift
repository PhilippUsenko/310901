import Foundation

// Класс Bus, представляющий автобус
class Bus: Car {
    var passengers: Int
    var money: Double

    init(x: Double, y: Double, direction: Double, passengers: Int = 0, money: Double = 0) {
        self.passengers = passengers
        self.money = money
       super.init(x:x, y:y, direction:direction)
    }

    func enter(passengersEntering: Int) {
        passengers += passengersEntering
        print("\(passengersEntering) пассажиров село на автобус")
    }

    func exit(passengersExiting: Int) {
        if passengersExiting <= passengers {
            passengers -= passengersExiting
            print("\(passengersExiting) пассажиров покинуло автобус")
        } else {
            print("Введено пассажиров больше, чем находится в автобусе")
        }
    }

    override func move(distance: Double) {
    // Копируем реализацию метода move из класса Car
    let radians = direction * .pi / 180
    x += distance * cos(radians)
    y += distance * sin(radians)
    // Дополнительные действия подкласса Bus
    money += Double(passengers) * distance
}


    override func description() -> String {
        return "Автобус в координатах (\(x), \(y)) под углом  \(direction) градусов с \(passengers) пассажирами на сумму \(money) рублей"
    }
}