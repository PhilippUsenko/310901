import Foundation

class TrainService {
    // Список поездов
    var trains: [TrainMovement] = []

    // Добавляем поезд (с валидацией)
    func addTrain(train: TrainMovement) {
        trains.append(train)
    }

    // Вывод списка поездов по пункту назначения и времени отправления
    func filterTrains(destination: String, afterTime: Date? = nil) -> [Train] {
        return trains.compactMap { $0 as? Train }.filter { train in
            train.destination == destination && (afterTime == nil || train.departureTime > afterTime!)
        }
    }
}
