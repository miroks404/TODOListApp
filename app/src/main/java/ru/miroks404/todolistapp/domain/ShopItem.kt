package ru.miroks404.todolistapp.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val isBuy: Boolean,
    var id: Int = UNDEFINED_ID,
) {

    companion object {

        const val UNDEFINED_ID = -1

    }

}
