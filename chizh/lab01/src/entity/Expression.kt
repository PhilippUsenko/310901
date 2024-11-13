package entity

class Expression {
    var list: ArrayList<Number> = arrayListOf();

    companion object {
        enum class Operation {
            Add,
            Subtract,
            Multiply,
            Divide,
        }
    }

    fun addNum() {
        println("Выберите тип комплесного числа:\n1. В алгебраическом виде\n2. В показательном виде");
        val i: Int = readLine()!!.toInt();
        val type: Number.Companion.Type = Number.Companion.Type.entries[i - 1];
        val num: Number;
        if (type.equals(Number.Companion.Type.Algo)) {
            print("Введите действительную часть: ");
            val real: Double = readLine()!!.toDouble();
            print("Введите мнимую часть: ");
            val imaginary: Double = readLine()!!.toDouble();
            num = Number(type, real, imaginary);
        } else {
            print("Введите модуль: ");
            val mod: Double = readLine()!!.toDouble();
            print("Введтье фазу: ");
            val phase: Double = readLine()!!.toDouble();
            num = Number(type, mod, phase);
        }
        list.add(num);
    }

    fun operate(): Number? {
        println("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление");
        val i: Int = readLine()!!.toInt();
        val op: Operation = Operation.entries[i - 1];
        val result: Number = list[0];
        try {
            for (i in 1..(list.size - 1)) {
                when (op) {
                    Operation.Add -> result.value.add(list[i].value)
                    Operation.Subtract -> result.value.subtract(list[i].value)
                    Operation.Multiply -> result.value.multiply(list[i].value)
                    Operation.Divide -> result.value.divide(list[i].value)
                }
            }
        } catch (e: IllegalArgumentException) {
            println("Divide by zero!");
            return null;
        }
        return result;
    }
}