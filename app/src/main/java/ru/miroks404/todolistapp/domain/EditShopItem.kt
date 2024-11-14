package ru.miroks404.todolistapp.domain

class EditShopItem(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }

}