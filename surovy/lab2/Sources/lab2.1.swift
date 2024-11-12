import Foundation
class Task1{
    func sumOfSquaresOfDigits(_ number: Int) -> Int {
        var sum = 0
        var num = number
        
        while num > 0 {
            let digit = num % 10
            sum += digit * digit
            num /= 10
        }
        
        return sum
    }

    func replaceWithSumOfSquares(_ number: Int, k: Int) {
        var result = number
        for _ in 1...k {
            result = sumOfSquaresOfDigits(result)
        }
        print("Результат после \(k) замен: \(result)") 
    }
}

