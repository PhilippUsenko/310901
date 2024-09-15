
import Cup.*
abstract class GranularSubject : AbstractSubject()
{
    abstract public fun pour(countG: Int);
}
class Coffee : GranularSubject()
{
    private var taste : String = "";
    override fun pour(countG: Int)
    {
        Thread.sleep(1000);
        println("Выберите сорт кофе:")
        println("1. Арабика")
        println("2. Робуста")
        var time2 : Boolean = true;
        while(time2) {
            try {
                var choice2: Int = readln().toInt();
                if (choice2 == 1) {
                    println("Вы выбрали сорт: Арабика")
                    taste = "Арабика";
                    time2 = false;
                }
                else if (choice2 == 2) {
                    println("Вы выбрали сорт: Робуста")
                    taste = "Робуста"
                    time2 = false;
                }
                else
                {
                    println("Некорректный ввод");
                }

            } catch (e: Exception) {
                println("Некорректный ввод");
            }
        }
        cup.accept("Кофе", taste, countG)
    }
}
class Tea : GranularSubject()
{
    private var sort : String = "";
    override fun pour(countG: Int)
    {
        Thread.sleep(1000);
        println("Выберите сорт кофе:")
        println("1. Черный")
        println("2. Зеленый")
        var time2 : Boolean = true;
        while(time2) {
            try {
                var choice2: Int = readln().toInt();
                if (choice2 == 1) {
                    sort = "Черный";
                    time2 = false;
                }
                else if (choice2 == 2) {
                    sort = "Зеленый"
                    time2 = false;
                }
                else
                {
                    println("Некорректный ввод");
                }

            } catch (e: Exception) {
                println("Некорректный ввод");
            }
        }
        cup.accept("Чай", sort)
    }
}
class Sugar : GranularSubject()
{
    override fun pour(countG: Int)
    {
        cup.accept("Сахар", countG);
    }
}