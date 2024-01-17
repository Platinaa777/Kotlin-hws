import Builders.IHumanBuilder
import Builders.implementations.AdminBuilder
import Builders.implementations.CustomerBuilder
import Builders.implementations.SellerBuilder


fun main() {
    var humanBuilder : IHumanBuilder = CustomerBuilder()
    var director = Director(humanBuilder)

    print("Input type of Entities.Human (Admin, Seller, Customer): ")
    val typeOfRole = readln()

    when (typeOfRole) {
        "Admin" -> {
            director.setBuilder(AdminBuilder())
            println(director.build().toString())
        }
        "Seller" -> {
            director.setBuilder(SellerBuilder())
            println(director.build().toString())
        }
        "Customer" -> {
            director.setBuilder(CustomerBuilder())
            println(director.build().toString())
        }
        else -> {
            println("Wrong input")
        }
    }
}