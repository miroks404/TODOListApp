package ru.miroks404.todolistapp.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemById(shopItemId: Int) : ShopItem

    fun getShopList(): List<ShopItem>

}