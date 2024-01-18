package DataContext

import DataContext.Interfaces.IShopDatabase
import Entities.Good

class ShopDatabase : IShopDatabase {
    private val goods : MutableList<Good> = mutableListOf()

    constructor() {
        // seeding data
        goods.add(Good("Milk"))
        goods.add(Good("Bread"))
        goods.add(Good("Coconut"))
    }

    operator fun get(index: Int): Good?{
        if(index in goods.indices)
            return goods[index]
        return null
    }

    override fun add(good: Good) {
        for (storedGood in goods) {
            if (good.title == storedGood.title) {
                return
            }
        }

        goods.add(good)
    }

    override fun remove(good: Good) {
        goods.removeIf { storedGood -> good.title == storedGood.title }
    }

    override fun getAllCatalog() : MutableList<Good> {
        return goods
    }
}