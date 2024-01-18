package DataContext.Interfaces

import Entities.Good

interface IShopDatabase {
    fun add(good: Good)
    fun remove(good: Good)
    fun getAllCatalog() : MutableList<Good>
}