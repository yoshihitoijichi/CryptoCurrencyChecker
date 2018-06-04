package net.ijichi.cryptocurrencychecker.model.entity

/**
 * GET /api/ticker
 * Created by ijichiyoshihito on 2018/01/09.
 */
data class Market(
    val productCode: String,
    val alias: String?
)