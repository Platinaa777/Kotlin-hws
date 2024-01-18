import DataContext.Interfaces.IShopDatabase
import DataContext.ShopDatabase
import DataContext.ShopProxy
import Entities.Good
import Entities.UserSession

val accessCode = "HSE"

fun main() {
    val shop: IShopDatabase = ShopProxy(ShopDatabase(), accessCode)

    // configure sessions
    UserSession.name = "Vova"
    UserSession.accessCode = "Something"
    shop.add(Good("Banana"))
    shop.remove(Good("Banana"))
    shop.remove(Good("Bread"))

    println("Catalog:")
    shop.getAllCatalog()
    println()

    // set right session options
    UserSession.name = "Alex"
    UserSession.accessCode = "HSE"
    shop.add(Good("Apple"))
    shop.remove(Good("Milk"))

    println("Catalog:")
    shop.getAllCatalog()
    println()
}