package net.ijichi.cryptocurrencychecker.model.entity.coincheck

/**
 * GET /api/ticker
 * Created by ijichiyoshihito on 2018/01/09.
 */
data class Ticker(
    val id: Long,
    val bid: Long,
    val ask: Long,
    val high: Long,
    val low: Long,
    val volume: Double,
    val timestamp: Long
)