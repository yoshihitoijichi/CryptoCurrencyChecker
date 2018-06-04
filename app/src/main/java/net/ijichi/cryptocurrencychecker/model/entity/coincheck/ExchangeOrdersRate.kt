package net.ijichi.cryptocurrencychecker.model.entity.coincheck

/**
 * GET /api/ticker
 * Created by ijichiyoshihito on 2018/01/09.
 */
data class ExchangeOrdersRate(
    val success: Boolean,
    val rate: Int,
    val price: Int,
    val amount: Double)
