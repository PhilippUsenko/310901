class Copier: Printer() {
    private var buferScan: String = ""
    fun scanOfficePaper(OfficePaper: Paper){
        buferScan = "${OfficePaper.height} мм, ${OfficePaper.width} мм"
        println("Бумага отсканирована")
        println("Размер бумаги: $buferScan")
    }
    fun scanDrawingPaper(drawingPaper: DrawingPaper){
        buferScan = "${drawingPaper.height} мм, ${drawingPaper.width} мм"
        println("Бумага отсканирована")
        println("Размер бумаги: $buferScan")
    }
    fun scanPhotoPaper(photoPaper: PhotoPaper){
        buferScan = "${photoPaper.height} мм, ${photoPaper.width} мм"
        println("Бумага отсканирована")
        println("Размер бумаги: $buferScan")
    }
}