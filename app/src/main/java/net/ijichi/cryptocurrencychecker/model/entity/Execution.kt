package net.ijichi.cryptocurrencychecker.model.entity

/**
 * Created by ijichiyoshihito on 2018/01/19.
 */
data class Execution(
    val id: Int,
    val side: String,
    val price: Int,
    val size: Double,
    val execDate: String,
    val buyChildOrderAcceptanceId: String,
    val sellChildOrderAcceptanceId: String
)