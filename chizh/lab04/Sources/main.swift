import Foundation

class numberCheck: simpleProtocol, fibonacciProtocol, complexProtocol, intProtocol, realProtocol {
    var number: Double

    init (number: Double) {
        self.number = number
    }
}

let number = numberCheck(number: validate.getNumber())

print("Is simple: \(number.isSimple())")
print("Is fibonacci: \(number.isFib())")
print("Is complex: \(number.isComplex())")
print("Is integer: \(number.isInt())")
print("Is real: \(number.isReal())")  