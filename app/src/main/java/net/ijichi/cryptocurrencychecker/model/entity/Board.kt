package net.ijichi.cryptocurrencychecker.model.entity

/**
 * GET /api/ticker
 * Created by ijichiyoshihito on 2018/01/09.
 */
data class Board(
    val midPrice: Int,
    val bids: List<Detail>,
    val asks: List<Detail>
){
    data class Detail(
        val price: Int,
        val size: Double
    )
}