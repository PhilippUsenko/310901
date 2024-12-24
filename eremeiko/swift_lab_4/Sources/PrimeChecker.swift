import Foundation
class PrimeChecker: PrimeCheckable {
    func isPrime(_ number: Int) -> Bool {
        if number <= 1 {
            return false
        }
        for i in 2..<Int(sqrt(Double(number)) + 1) {
            if number % i == 0 {
                return false
            }
        }
        return true
    }
}