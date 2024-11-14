package ru.miroks404.todolistapp.domain

class GetShopList(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }

}