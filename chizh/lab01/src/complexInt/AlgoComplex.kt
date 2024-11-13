package complexInt

import kotlin.math.atan
import kotlin.math.pow
import kotlin.math.sqrt

class AlgoComplex(real: Double = 0.0, imaginary: Double = 0.0): Complex() {

    private var real: Double;
    private var imaginary: Double;

    init {
        this.real = real;
        this.imaginary = imaginary;
    }

    public fun getReal(): Double {
        return this.real;
    }

    public fun setReal(real: Double) {
        this.real = real;
    }

    public fun getImaginary(): Double {
        return this.imaginary;
    }

    public fun setImaginary(imaginary: Double) {
        this.imaginary = imaginary;
    }

    internal fun toIndi(): IndiComplex {
        val mod: Double = sqrt(this.real.pow(2) + this.imaginary.pow(2));
        val phase: Double = atan(this.imaginary/this.real);
        return IndiComplex(mod, phase);
    }

    public override fun add(num: Complex) {
        if (num is AlgoComplex) {
            this.real += num.getReal();
            this.imaginary += num.getImaginary();
        } else if (num is IndiComplex) {
            add(num.toAlgo());
        }
    }

    public override fun subtract(num: Complex) {
        if (num is AlgoComplex) {
            this.real -= num.getReal();
            this.imaginary -= num.getImaginary();
        } else if (num is IndiComplex) {
            add(num.toAlgo());
        }
    }

    public override fun multiply(num: Complex) {
        if (num is AlgoComplex) {
            val r: Double = num.getReal();
            val i: Double = num.getImaginary();
            this.real = (this.real * r - this.imaginary * i);
            this.imaginary = (this.real * i + this.imaginary * r);
        } else if (num is IndiComplex) {
            multiply(num.toAlgo());
        }
    }

    public override fun divide(num: Complex) {
        if (num is AlgoComplex) {
            val r: Double = num.getReal();
            val i: Double = num.getImaginary();
            if (r == 0.0 && i == 0.0) {
                throw IllegalArgumentException();
            }
            this.real = (this.real * r + this.imaginary * i) / (r.pow(2) + i.pow(2));
            this.imaginary = (r * this.imaginary - this.real * i) / (r.pow(2) + i.pow(2));
        } else if (num is IndiComplex) {
            divide(num.toAlgo());
        }
    }

    public override fun toString(): String {
        if (this.imaginary >= 0) {
            return "${this.real} + ${this.imaginary}i";
        } else {
            return  "${this.real} + (${this.imaginary})i";
        }
    }
}