class Human {
    var paperAmount: Int = 0
    fun  loadPaper() {
        paperAmount += 1
        println("Количество бумаги: " + paperAmount)

    }
    fun print(printer: Printer){
        if (paperAmount == 0){
            println("В принтере нет бумаги")
            println("1. Заправить бумагу\n2. Выключить принтер")
            var b = readLine()?.toInt()
            if (b == 1){
                loadPaper()
            } else if (b == 2){
                return
            } else {
                println("Нет такого варианта ответа")
                return
            }
        }
        println("Вы хотите распечатать текст, изображение или чертеж?")
        var a = readlnOrNull()
        if (a == "Текст" || a == "текст"){
            var textPaper = OfficePaper(210,297)
            println("Размер бумаги: ${textPaper.height} мм, ${textPaper.width} мм")
            paperAmount--
            printer.printText(textPaper)
        } else if (a == "Изображение" || a == "изображение"){
            var photoPaper = PhotoPaper(210,297)
            println("Размер бумаги: ${photoPaper.height} мм, ${photoPaper.width} мм")
            paperAmount--
            printer.printImage(photoPaper)
        } else if (a == "Чертеж" || a == "чертеж" || a == "Чертёж" || a == "чертёж"){
            var drawingPaper = DrawingPaper(210,297)
            println("Размер бумаги: ${drawingPaper.height} мм, ${drawingPaper.width} мм")
            paperAmount--
            printer.printDrawing(drawingPaper)
        } else {
            println("Нет такого варианта ответа. Выключение принтера...")
            return
        }
    }

//    fun printAfterScan(printer: Printer){
//        if (paperAmount == 0){
//            println("В принтере нет бумаги")
//            println("1. Заправить бумагу\n2. Выключить принтер")
//            var b = readLine()?.toInt()
//            if (b == 1){
//                loadPaper()
//            } else if (b == 2){
//                return
//            } else {
//                println("Нет такого варианта ответа")
//                return
//            }
//        }
//        println("Вы хотите распечатать текст, изображение или чертеж?")
//        var a = readlnOrNull()
//        if (a == "Текст" || a == "текст"){
//            var textPaper = OfficePaper(210,297)
//            println("Размер бумаги: ${textPaper.height} мм, ${textPaper.width} мм")
//            paperAmount--
//            printer.printText(textPaper)
//        } else if (a == "Изображение" || a == "изображение"){
//            var photoPaper = PhotoPaper(210,297)
//            println("Размер бумаги: ${photoPaper.height} мм, ${photoPaper.width} мм")
//            paperAmount--
//            printer.printImage(photoPaper)
//        } else if (a == "Чертеж" || a == "чертеж" || a == "Чертёж" || a == "чертёж"){
//            var drawingPaper = DrawingPaper(210,297)
//            println("Размер бумаги: ${drawingPaper.height} мм, ${drawingPaper.width} мм")
//            paperAmount--
//            printer.printDrawing(drawingPaper)
//        } else {
//            println("Нет такого варианта ответа. Выключение принтера...")
//            return
//        }
//    }
}