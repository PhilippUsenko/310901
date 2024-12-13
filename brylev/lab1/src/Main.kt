abstract class Product(protected val name: String)


class Car(name: String) : Product(name) {
    fun drive() {
        println("$name едет")
    }
}


class Pot(name: String, val volume: Double) : Product(name)


class Match(name: String, val length: Double, val canBeLighted: Boolean) : Product(name) {
    fun light() {
        if (canBeLighted) {
            println("$name зажжена")
        }
        else {
            println("$name не загорелась")
        }
    }
}


abstract class Employee(val name: String, private var money: Double)


class Worker(name: String, money: Double) : Employee(name, money) {
    fun work() {
        println("$name работает")
    }

    fun smoke() {
        println("$name курит")
    }

    fun lightAMatch(match: Match) {
        if (match.canBeLighted) {
            println("$name зажигает спичку")
        }
        else{
            println("спичка не горит")
        }
    }
}


class Factory {
    private val workers = mutableListOf<Worker>()
    private val products = mutableListOf<Product>()
    private var productType: String = ""

    fun hireWorker(worker: Worker) {
        workers.add(worker)
    }

    fun releaseProduct(product: Product) {
        products.add(product)
    }

    fun changeProductType(type: String) {
        productType = type
        println("тип продукции фабрики сменён на $productType")
    }

    fun sendToStore(products: List<Product>, store: Store)
    {
        store.addProducts(products)
    }
}


class Director(val factory: Factory) {
    fun changeProductionType(type: String) {
        factory.changeProductType(type)
    }
}


class Store(val products: List<Product>)
{
    val inventory = mutableListOf<Product>()
    fun addProducts(products: List<Product>) {
        inventory.addAll(products)
    }
}

fun main() {
    val factory = Factory()
    val director = Director(factory)
    val worker = Worker("Кирюха", 100.0)
    val match = Match("первая спичка", 12.0, false)

    factory.hireWorker(worker)

    worker.work()
    worker.smoke()
    worker.lightAMatch(match)
    val car = Car("Porsche")
    factory.releaseProduct(car)
    match.light()

    director.changeProductionType("электронику")
}
