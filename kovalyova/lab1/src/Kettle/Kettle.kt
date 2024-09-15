
import Cup.*

class Kettle: AbstractSubject()
{
    private var temperature: Int = 25;
    private var volumeM : Int = 1000;
    public fun pourCup(isend : Boolean)
    {
        cup.accept("Вода",isend );
    }
    public fun fillWater()
    {
        volumeM = 0;
        println("Вы наполняете чайник водой..");
        while (volumeM <= 1000)
        {
            Thread.sleep(1000)
            println("...")
            volumeM+=300;
        }
        println("Вы наполнили чайник водой")
        Thread.sleep(1000)
        heat()
    }
    public fun heat()
    {
        println("Чайник нагревается");
        changeTemperature();
        println("Вода в чайнике закипела.")
        Thread.sleep(500)
    }
    private fun changeTemperature()
    {
        while (temperature <= 100)
        {
            Thread.sleep(1000)
            println("...")
            temperature+=30;
        }
    }
}