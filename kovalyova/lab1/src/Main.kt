
import Student.*
import Kettle.*
import Products.*

fun toAddSugar(): Boolean
{
    println("Добавить сахар?")
    println("1. Да")
    println("2. Нет")
    var addsugar : Int = 0
    addsugar = readln().toInt();
    var time : Boolean = true;
    while(time)
    {
        if (addsugar == 1)
        {
            time = false;
            return true;
        }
        else if (addsugar == 2)
        {
            time = false;
            return false;
        }
        else
        {
            println("Некорректный ввод")
        }
    }
    return false;
}

fun main(args: Array<String>){
    val student = Student()
    println("Введите ваше имя")
    student.name = readln()
    while (true){
        println()
        println("========================")
        println(student.name + " выберите из списка:")
        println("1. Сделать кофе")
        println("2. Сделать чай")
        println("3. Сделать кофе с молоком")
        println("4. Выход");

        var choice:Number;
        try{
            choice = readln().toInt()
        }catch (e:Exception){
            println("Некорректный ввод")
            continue;
        }
        when(choice){
            1->{
                student.makeCoffee();
                Thread.sleep(500)
                println("Вы сделали кофе!")
                Thread.sleep(1500)
            }
            2->{
                student.makeTea()
                Thread.sleep(500)
                println("Вы сделали чай!")
                Thread.sleep(1500)
            }
            3->{
                student.makeCoffeeMilk();
                Thread.sleep(500)
                println("Вы сделали кофе с молоком!")
                Thread.sleep(1500)
            }
            4 -> {
                break
            };
        }

    }


}