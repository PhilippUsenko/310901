open class Paper( var height: Int, var width: Int) {
    open fun writeContent(){
    }
}
class OfficePaper(height: Int, width: Int): Paper(height, width){
    override fun writeContent() {
        println("Содержание текста загружено")
    }
}
class DrawingPaper(height: Int, width: Int): Paper(height, width){
    override fun writeContent(){
        println("Содержание чертежа загружено")
    }
}
class PhotoPaper(height: Int, width: Int): Paper(height, width){
    override fun writeContent(){
        println("Содержание изображения загружено")
    }
}