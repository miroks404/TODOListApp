package ru.miroks404.todolistapp.domain

class GetShopItemById(private val shopListRepository: ShopListRepository) {

    fun getShopItemById(shopItemId: Int) : ShopItem {
        return shopListRepository.getShopItemById(shopItemId)
    }

}