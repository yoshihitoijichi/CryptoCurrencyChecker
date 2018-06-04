package net.ijichi.cryptocurrencychecker.model.entity.coincheck

/**
 * GET /api/ticker
 * Created by ijichiyoshihito on 2018/01/09.
 */
data class Trades(
    val success: Boolean,
    val pagination: Pagination,
    val data: List<Data>){

    data class Data(
        val id: Int,
        val amount: Double,
        val rate: Int,
        val pair: String,
        val orderType: String,
        val createdAt: String
    )
}