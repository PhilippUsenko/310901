package entity

import complexInt.AlgoComplex
import complexInt.Complex
import complexInt.IndiComplex

class Number(type: Type, value1: Double, value2: Double) {
    var value: Complex;

    companion object {
        enum class Type {
            Algo,
            Indi
        }
    }

    init {
        if (type.equals(Type.Algo)) {
            value = AlgoComplex(value1, value2);
        } else {
            value = IndiComplex(value1, value2);
        }
    }

    public override fun toString(): String {
        return value.toString();
    }
}