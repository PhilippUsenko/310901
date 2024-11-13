
import AbstractSubject

val cup : Cup = Cup();
class Cup: AbstractSubject()
{
    private val volumeMil : Int = 250;
    public var component : String = "";
    public fun accept(something: String, count: Int)
    {
        if(something  == "Сахар")
        {
            component += something + " " + count + " ч.л.;";
        }
    }
    public fun accept (something: String, sort: String, countG: Int)
    {
        if (something == "Кофе") {
            component += " " + something + ": Bкус - "+ sort + ", Kол-во ложек - " + countG + ";";
        }
    }
    public fun accept(something: String, sort : String) {
        if (something == "Чай") {
            component += " " + something + ": Cорт - "+ sort+ ";";
        }
    }
    public fun accept (something: String, isend : Boolean)
    {
        if (something == "Вода") {
            println("Вы налили горячую воду в чашку");
            Thread.sleep(500)
            if (isend == true) {
                println("Состав напитка: " + component)
                component = ""
            }
        }
        if (something == "Молоко") {
            println("Вы налили горячую молоко в чашку");
            component += " Молоко;"
            println("Состав напитка: " + component)
            component = ""
        }
    }
}