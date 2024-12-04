import Foundation


class Train: TrainMovement {
    let destination: String
    let trainNumber: Int
    let departureTime: Date
    var seats: (general: Int, reservedSeat: Int, coupe: Int)

    // Конструктор с валидацией
    init?(destination: String, trainNumber: Int, departureTime: Date, seats: (general: Int, reservedSeat: Int, coupe: Int)) {
        guard !destination.isEmpty, trainNumber > 0, seats.general >= 0, seats.reservedSeat >= 0, seats.coupe >= 0 else {
            return nil // Валидация не пройдена
        }
        self.destination = destination
        self.trainNumber = trainNumber
        self.departureTime = departureTime
        self.seats = seats
    }

    // Метод из протокола
    func moveTrain() -> String {
        return "Поезд №\(trainNumber) направляется в \(destination)"
    }
}
