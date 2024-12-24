import Foundation
class FloatChecker: FloatCheckable {
    func isFloat(_ number: Double) -> Bool {
        // Вещественное число — это число с дробной частью
        return number != floor(number)
    }
}