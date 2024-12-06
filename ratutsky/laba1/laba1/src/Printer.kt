open class Printer {
    public fun printText(textPaper: OfficePaper){
        textPaper.writeContent()
        print("Печать бумаги...")
        Thread.sleep(1000)
        println(" ...")
        Thread.sleep(1000)
        println("Можете забирать лист!")
    }
    fun printDrawing(drawingPaper: DrawingPaper){
        drawingPaper.writeContent()
        print("Печать бумаги...")
        Thread.sleep(1000)
        println(" ...")
        Thread.sleep(1000)
        println("Можете забирать лист!")
    }
    fun printImage(photoPaper: PhotoPaper){
        photoPaper.writeContent()
        print("Печать бумаги...")
        Thread.sleep(1000)
        println(" ...")
        Thread.sleep(1000)
        println("Можете забирать лист!")
    }
}