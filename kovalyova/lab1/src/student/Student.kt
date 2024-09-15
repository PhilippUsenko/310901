
import Cup.*

abstract class AbstractSubject
{
    protected var massG: Int = 0;
}
class Student : AbstractSubject()
{
    public var name : String = "";
    public fun makeCoffee()
    {
        if(toAddSugar())
        {
            println("Вы выбрали сделать кофе с добавлением сахара");
            val sugar: String = "Сахар";
            fillCup(sugar, 0);
        }
        else
        {
            println("Вы выбрали сделать кофе без сахара");
        }
        val cof = Coffee();
        println("Укажите количество ложек кофе (максимально - 3)");
        var countofCoffee: Int = 1;
        try {
            var choicecoffee : Int = readln().toInt();
            if(choicecoffee >=3)
            {
                countofCoffee = 3;
            }
            else
                countofCoffee = choicecoffee;
        }
        catch (e: Exception)
        {
            println("Некорректный ввод")
            countofCoffee = 1;
        }
        cof.pour(countofCoffee);
        val kett  = Kettle();
        kett.fillWater();
        kett.pourCup(true)
    }
    public fun makeTea()
    {
        if(toAddSugar())
        {
            println("Вы выбрали сделать чай с добавлением сахара");
            val sugar: String = "Сахар";
            fillCup(sugar, 0);
        }
        else
        {
            println("Вы выбрали сделать чай без сахара");
        }
        fillCup("Чай", 0)
        val kett  = Kettle();
        kett.fillWater();
        kett.pourCup(true)
    }
    public fun makeCoffeeMilk()
    {
        if(toAddSugar())
        {
            println("Вы выбрали сделать кофе с добавлением сахара");
            fillCup("Сахар", 0);
        }
        else
        {
            println("Вы выбрали сделать кофе без сахара");
        }
        println("Укажите количество ложек кофе (максимально - 3)");
        var countofCoffee: Int = 1;
        try {
            var choicecoffee : Int = readln().toInt();
            if(choicecoffee >=3)
            {
                countofCoffee = 3;
            }
            else
                countofCoffee = choicecoffee;
        }
        catch (e: Exception)
        {
            println("Некорректный ввод")
            countofCoffee = 1;
        }
        fillCup("Кофе", countofCoffee);
        val kett  = Kettle();
        kett.fillWater();
        kett.pourCup(false)
        val milk = Milk()
        milk.addmilk()
    }
    private fun fillCup(something : String, countG: Int)
    {
        when(something)
        {
            "Сахар"->
            {
                val sugar: Sugar = Sugar();
                println("Укажите количество ложек сахара (максимально - 3)");
                var countofSugar: Int = 1;
                try {
                    var choicesugar : Int = readln().toInt();
                    if(choicesugar >=3)
                    {
                        countofSugar = 3;
                    }
                    else
                        countofSugar = choicesugar;
                }
                catch (e: Exception)
                {
                    println("Некорректный ввод")
                    countofSugar = 1;
                }
                sugar.pour(countofSugar);
            }
            "Чай"->
            {
                val tea = Tea();
                tea.pour(countG)
            }
            "Кофе"->
            {
                val cof = Coffee();
                cof.pour(countG)
            }
        }

    }
}


class Milk: AbstractSubject()
{
    public fun addmilk()
    {
        cup.accept("Молоко", true )
    }
}
