package ru.miroks404.todolistapp.domain

class AddShopItem(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }

}