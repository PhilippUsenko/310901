let multiplyIntegers: (Int, Int) -> Int = { (a, b) in
    return a * b
}

let result = multiplyIntegers(3, 4)
print("Result of multiplying integers: \(result)")

struct Complex {
    var real: Double
    var imaginary: Double
}

let multiplyComplex: (Complex, Complex) -> Complex = { (a, b) in
    let realPart = a.real * b.real - a.imaginary * b.imaginary
    let imaginaryPart = a.real * b.imaginary + a.imaginary * b.real
    return Complex(real: realPart, imaginary: imaginaryPart)
}

let complex1 = Complex(real: 2, imaginary: 3)
let complex2 = Complex(real: 4, imaginary: 5)
let resultComplex = multiplyComplex(complex1, complex2)
print("Result of multiplying complex numbers: \(resultComplex.real) + \(resultComplex.imaginary)i")
