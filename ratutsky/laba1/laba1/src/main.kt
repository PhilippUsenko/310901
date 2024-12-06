fun main() {
    var printer = Printer()
    var human = Human()
    var copier = Copier()

    println("1. Печатать\n2. Сканировать бумагу\n3. Заправить бумагу")
    var m = readLine()?.toInt()
    if(m == 1) {
        human.print(printer)
    } else if(m == 2){
        println("Вы хотите распечатать текст, изображение или чертеж?")
        var a = readlnOrNull()
        if (a == "Текст" || a == "текст"){
            var textPaper = OfficePaper(210,297)
            copier.scanOfficePaper(textPaper)
        } else if (a == "Изображение" || a == "изображение"){
            var photoPaper = PhotoPaper(210,297)
            println("Размер бумаги: ${photoPaper.height} мм, ${photoPaper.width} мм")
        } else if (a == "Чертеж" || a == "чертеж" || a == "Чертёж" || a == "чертёж"){
            var drawingPaper = DrawingPaper(210,297)
            println("Размер бумаги: ${drawingPaper.height} мм, ${drawingPaper.width} мм")
        } else {
            println("Нет такого варианта ответа. Выключение принтера...")
            return
        }
        human.print(printer)
    } else if(m == 3){
        human.loadPaper()
        println("1. Печатать\n2. Сканировать бумагу")
        var m = readLine()?.toInt()
        if(m == 1) {
            human.print(printer)
        } else if(m == 2){
            println("Вы хотите распечатать текст, изображение или чертеж?")
            var a = readlnOrNull()
            if (a == "Текст" || a == "текст"){
                var textPaper = OfficePaper(210,297)
                copier.scanOfficePaper(textPaper)
            } else if (a == "Изображение" || a == "изображение"){
                var photoPaper = PhotoPaper(210,297)
                println("Размер бумаги: ${photoPaper.height} мм, ${photoPaper.width} мм")
            } else if (a == "Чертеж" || a == "чертеж" || a == "Чертёж" || a == "чертёж"){
                var drawingPaper = DrawingPaper(210,297)
                println("Размер бумаги: ${drawingPaper.height} мм, ${drawingPaper.width} мм")
            } else {
                println("Нет такого варианта ответа. Выключение принтера...")
                return
            }
            human.print(printer)
        }
    }
}
