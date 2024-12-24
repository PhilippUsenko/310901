import Foundation
class ComplexChecker: ComplexCheckable {
    func isComplex(real: Double, imaginary: Double) -> Bool {
        // Комплексное число, если мнимая часть не равна нулю
        return imaginary != 0
    }
}