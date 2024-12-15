import Foundation

protocol simpleProtocol {
    var number: Double { get set }
}

extension simpleProtocol {
    func isSimple() -> Bool {
        guard number >= 2 && number == floor(number) else { return false }
        let intNumber = Int(number)
        for i in 2..<Int(sqrt(Double(intNumber))) + 1 {
            if intNumber % i == 0 {
                return false
            }
        }
        return true
    }
}

protocol fibonacciProtocol {
    var number: Double { get set }
}

extension fibonacciProtocol {
    func isFib() -> Bool {
        var n: Int
        if (number == floor(number)) {
            n = Int.init(number)
        } else {
            return false
        }
        func isPerfectSquare(_ x: Int) -> Bool {
            let s = Int(sqrt(Double(x)))
            return s * s == x
        }
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4)
    }
}

protocol complexProtocol {
    var number: Double { get set }
}

extension complexProtocol {
    func isComplex() -> Bool {
        return number.isNaN
    }
}

protocol intProtocol {
    var number: Double { get set }
}

extension intProtocol {
    func isInt() -> Bool {
        return number == floor(number)
    }
}

protocol realProtocol {
    var number: Double { get set }
}

extension realProtocol {
    func isReal() -> Bool {
        if (number == floor(number)) {
            return false
        }
        return !number.isNaN && !number.isInfinite
    }
}
