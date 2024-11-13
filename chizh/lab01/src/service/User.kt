package service

import entity.Expression;
import entity.Number

class User() {
    private var name: String;

    init {
        print("Ваше имя: ");
        this.name = readLine()!!;
    }

    fun doOp(): Number? {
        val exp: Expression = Expression();
        exp.addNum();
        exp.addNum();
        val result: Number? = exp.operate();
        return result;
    }
}