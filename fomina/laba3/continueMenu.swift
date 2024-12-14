import Foundation

// Меню продолжения движения или выбора другого транспортного средства
func continueMenu(vehicle: Car) {
    while true {
        print("\nВыбирете действие")
        print("1. Продолжить движение")
        print("2. Вернуться к предыдущему выбору")

        switch readInt(prompt: "Введите ваш выбор") {
        case 1:
            print("Хотите повернуться (изменить угол)?")
            print("1. Да")
            print("2. Нет")

            let changeDirection = readInt(prompt: "Введите ваш выбор")
            if changeDirection == 1 {
                let newDirection = readDouble(prompt: "Введите новое напрвление (угол) ")
                vehicle.turn(newDirection: newDirection)
            }

            let distance = readDouble(prompt: "Введите расстояние, которое должно быть преодолено ")
            vehicle.move(distance: distance)
            print(vehicle.description())
        case 2:
            return
        default:
            print("Неккоректное значение, введите повторно")
        }
    }
}