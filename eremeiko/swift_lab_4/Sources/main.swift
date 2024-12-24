import Foundation

print("\n")
// Создание экземпляров через протоколы
let primeChecker: PrimeCheckable = PrimeChecker()
let fibonacciChecker: FibonacciCheckable = FibonacciChecker()
let complexChecker: ComplexCheckable = ComplexChecker()
let integerChecker: IntegerCheckable = IntegerChecker()
let floatChecker: FloatCheckable = FloatChecker()

// Примеры использования
let number1 = 7
print("Число \(number1) простое? \(primeChecker.isPrime(number1))") // true
print("Число \(number1) является числом Фибоначчи? \(fibonacciChecker.isFibonacci(number1))") // true

let real = 3.0
let imaginary = 4.0
print("Число (\(real), \(imaginary)) комплексное? \(complexChecker.isComplex(real: real, imaginary: imaginary))") // true

let number2: Double = 5.0
print("Число \(number2) целое? \(integerChecker.isInteger(number2))") // true
print("Число \(number2) вещественное? \(floatChecker.isFloat(number2))") // false

let number3: Double = 5.5
print("Число \(number3) целое? \(integerChecker.isInteger(number3))") // false
print("Число \(number3) вещественное? \(floatChecker.isFloat(number3))") // true