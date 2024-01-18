package DataContext

import DataContext.Interfaces.IShopDatabase
import Entities.Good
import Entities.UserSession

class ShopProxy(private val database: ShopDatabase, private val accessCode: String) : IShopDatabase {
    override fun add(good: Good) {
        var output = "Operation: Add good from Database; "
        if (UserSession.accessCode == accessCode) {
            database.add(good)
            output += "UserType: Owner"
        } else {
            output += "UserType: SimpleUser"
        }

        println(output)
    }

    override fun remove(good: Good) {
        var output = "Operation: Remove good from Database; "
        if (UserSession.accessCode == accessCode) {
            database.remove(good)
            output += "UserType: Owner"
        } else {
            output += "UserType: SimpleUser"
        }

        println(output)
    }

    override fun getAllCatalog() : MutableList<Good> {
        val goods = database.getAllCatalog()
        for (good in goods) {
            println("good title: ${good.title}")
        }

        return goods
    }
}