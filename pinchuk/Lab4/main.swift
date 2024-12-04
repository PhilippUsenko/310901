import Foundation

let trainService = TrainService()

// Пример создания поездов
if let train1 = Train(destination: "Москва", trainNumber: 101, departureTime: Date(), seats: (general: 50, reservedSeat: 40, coupe: 20)) {
    trainService.addTrain(train: train1)
}

if let train2 = Train(destination: "Санкт-Петербург", trainNumber: 102, departureTime: Date().addingTimeInterval(3600), seats: (general: 60, reservedSeat: 50, coupe: 30)) {
    trainService.addTrain(train: train2)
}

// Фильтрация поездов по пункту назначения
let filteredTrains = trainService.filterTrains(destination: "Москва")
for train in filteredTrains {
    print(train.moveTrain()) // Выводим информацию о поезде
}
