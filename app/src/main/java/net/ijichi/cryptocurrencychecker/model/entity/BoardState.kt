package net.ijichi.cryptocurrencychecker.model.entity

/**
 * Created by ijichiyoshihito on 2018/01/19.
 */
data class BoardState(
    val health: String,
    val state: String,
    val data: Data?
){
    data class Data(
        val specialQuotation: Int
    )
}

