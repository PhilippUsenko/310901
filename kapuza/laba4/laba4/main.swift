import Foundation

// Функция для валидации вводимых значений
func validateEngineType(engineType: String) -> Bool {
    return ["Petrol", "Diesel", "Electric"].contains(engineType)
}

// Создание списка автомобилей и запуск их двигателей
let engines: [Engine] = [PetrolEngine(), DieselEngine(), ElectricEngine()]
let cars: [Car] = engines.map { Vehicle(engine: $0) }

cars.forEach { $0.startEngine() }
