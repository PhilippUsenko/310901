package housing

data class Address( private val street: String,
               private val house: Int,
               private val apartment: Int){

    fun getFullAddress() = "ул.${street}, д.${house}, кв.${apartment}"
}