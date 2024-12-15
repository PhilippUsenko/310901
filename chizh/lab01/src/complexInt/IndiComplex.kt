package complexInt

import kotlin.math.cos
import kotlin.math.sin

class IndiComplex(mod: Double = 0.0, phase: Double = 0.0): Complex() {

    private var mod: Double;
    private var phase: Double;

    init {
        this.mod = mod;
        this.phase = phase;
    }

    public fun getMod(): Double {
        return this.mod;
    }

    public fun setMod(mod: Double) {
        this.mod = mod;
    }

    public fun getPhase(): Double {
        return this.phase;
    }

    public fun setPhase(phase: Double) {
        this.phase = phase;
    }

    internal fun toAlgo(): AlgoComplex {
        val real: Double = this.mod * cos(this.phase);
        val imaginary: Double = this.mod * sin(this.phase);
        return AlgoComplex(real, imaginary);
    }

    public override fun add(num: Complex) {
        val algo: AlgoComplex = this.toAlgo();
        algo.add(num);
        val indi: IndiComplex = algo.toIndi();
        this.mod = indi.getMod();
        this.phase = indi.getPhase();
    }

    public override fun subtract(num: Complex) {
        val algo: AlgoComplex = this.toAlgo();
        algo.subtract(algo);
        val indi: IndiComplex = algo.toIndi();
        this.mod = indi.getMod();
        this.phase = indi.getPhase();
    }

    public override fun multiply(num: Complex) {
        if (num is IndiComplex) {
            this.mod *= num.getMod();
            this.phase += num.getPhase();
        } else if (num is AlgoComplex) {
            val indi: IndiComplex = num.toIndi();
            this.mod *= indi.getMod();
            this.phase += indi.getPhase();
        }
    }

    public override fun divide(num: Complex) {
        if (num is IndiComplex) {
            this.mod /= num.getMod();
            this.phase -= num.getPhase();
        } else if (num is AlgoComplex) {
            val indi: IndiComplex = num.toIndi();
            this.mod /= indi.getMod();
            this.phase -= indi.getPhase();
        }
    }

    public override fun toString(): String {
        if (this.phase >= 0) {
            return "|${this.mod}|^i${this.phase}";
        } else {
            return "|${this.mod}|^i(${this.phase})";
        }
    }
}