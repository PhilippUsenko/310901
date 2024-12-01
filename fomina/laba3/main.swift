import Foundation

// Главное меню
func mainMenu() {
    var car: Car?
    var bus: Bus?

    while true {
        print("\nВыберите транспорт")
        print("1. Машина")
        print("2. Автобус")
        print("3. Выход")

        switch readInt(prompt: "Введите ваш выбор: ") {
        case 1:
            if car == nil {
                let carX = readDouble(prompt: "Введите начальную координату x для машины: ")
                let carY = readDouble(prompt: "Введите начальную координату y для машины: ")
                let carDirection = readDouble(prompt: "Введите начальное направление (угол) для машины: ")
                car = Car(x: carX, y: carY, direction: carDirection)
            }
            interactionMenu(vehicle: car!)
        case 2:
            if bus == nil {
                let busX = readDouble(prompt: "Введите начальную координату x для автобуса: ")
                let busY = readDouble(prompt: "Введите начальную координату y для автобуса: ")
                let busDirection = readDouble(prompt: "Введите начальное направление (угол) для автобуса: ")
                bus = Bus(x: busX, y: busY, direction: busDirection)
            }
            interactionMenu(vehicle: bus!)
        case 3:
            print("Вы закрыли приложение")
            return
        default:
            print("Неккоректное значение, введите повторно")
        }
    }
}