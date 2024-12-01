import Foundation

// Меню взаимодействия с транспортным средством
func interactionMenu(vehicle: Car) {
    while true {
        print("\nВыберите действие")
        print("1. Двигаться дальше")
        print("2. Повернуться")
        print("3. Сесть на автобус (только для автобуса)")
        print("4. Покинуть автобус (только для автобуса)")
        print("5. К предыдущему выбору")

        switch readInt(prompt: "Введите ваш выбор") {
        case 1:
            let distance = readDouble(prompt: "Введите расстояние для передвижения")
            vehicle.move(distance: distance)
            print(vehicle.description())
            continueMenu(vehicle: vehicle)
        case 2:
            let newDirection = readDouble(prompt: "Введите новое направление (угол)")
            vehicle.turn(newDirection: newDirection)
            print(vehicle.description())
            continueMenu(vehicle: vehicle)
        case 3:
            if let bus = vehicle as? Bus {
                let passengersEntering = readInt(prompt: "Введите количество пассажиров, которые сели на автобус")
                bus.enter(passengersEntering: passengersEntering)
            } else {
                print("Это действие недоступно для машины")
            }
        case 4:
            if let bus = vehicle as? Bus {
                let passengersExiting = readInt(prompt: "Введите количество пассажиров, которые покинули автобус")
                bus.exit(passengersExiting: passengersExiting)
            } else {
                print("Это действие недоступно для машины")
            }
        case 5:
            return
        default:
            print("Неккоректное значение, введите повторно")
        }
    }
}