import Foundation
class FibonacciChecker: FibonacciCheckable {
    func isFibonacci(_ number: Int) -> Bool {
        func isPerfectSquare(_ x: Int) -> Bool {
            let s = Int(sqrt(Double(x)))
            return s * s == x
        }
        // Число Фибоначчи, если 5 * n^2 + 4 или 5 * n^2 - 4 — полные квадраты
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4)
    }
}