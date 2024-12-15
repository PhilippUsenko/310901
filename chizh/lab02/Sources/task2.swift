class task2 {

    struct Number {
        var real: Int = 0
        var imaginary: Int = 0
    }

    var a: Number = Number()
    var b: Number = Number()

    init (input: (real1: Int, imaginary1: Int, real2: Int, imaginary2: Int)) {
        self.a.real = input.real1
        self.a.imaginary = input.imaginary1
        self.b.real = input.real2
        self.b.imaginary = input.imaginary2
    }

    public func result() -> Number {
        return sum(rule: chooseSum(real: (self.a.imaginary == 0 && self.b.imaginary == 0)), a: self.a, b: self.b)
    }

    private func sum(rule: (Number, Number) -> Number, a: Number, b: Number) -> Number {
        return rule(a, b);
    }

    private func chooseSum(real: Bool) -> (Number, Number) -> Number {
        return real ? sumReal : sumComplex
    }

    private func sumReal(a: Number, b: Number) -> Number {
        var number: Number = Number()
        number.real = a.real + b.real
        number.imaginary = 0
        return number
    }

    private func sumComplex(a: Number, b: Number) -> Number {
        var number: Number = sumReal(a: a, b: b)
        number.imaginary = a.imaginary + b.imaginary
        return number
    }
}