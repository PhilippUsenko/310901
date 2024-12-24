import Foundation
class IntegerChecker: IntegerCheckable {
    func isInteger(_ number: Double) -> Bool {
        // Целое число — это число, не имеющее дробной части
        return number == floor(number)
    }
}