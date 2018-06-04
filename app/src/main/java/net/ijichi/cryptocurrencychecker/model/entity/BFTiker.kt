package net.ijichi.cryptocurrencychecker.model.entity

/**
 * Created by ijichiyoshihito on 2018/01/19.
 */
data class BFTiker(
    val productCode: String,
    val timestamp: String,
    val tickId: Int,
    val bestBid: Double,
    val bestAsk: Double,
    val bestBidSize: Double,
    val bestAskSize: Double,
    val totalBidDepth: Double,
    val totalAskDepth: Double,
    val ltp: Double,
    val volume: Double,
    val volumeByProduct: Double
)