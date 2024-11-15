package ru.miroks404.todolistapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.miroks404.todolistapp.data.ShopListRepositoryImpl
import ru.miroks404.todolistapp.domain.DeleteShopItem
import ru.miroks404.todolistapp.domain.EditShopItem
import ru.miroks404.todolistapp.domain.GetShopList
import ru.miroks404.todolistapp.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopList(repository)
    private val deleteShopItemUseCase = DeleteShopItem(repository)
    private val editShopItemUseCase = EditShopItem(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
        getShopList()
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(isBuy = !shopItem.isBuy)
        editShopItemUseCase.editShopItem(newItem)
        getShopList()
    }
}