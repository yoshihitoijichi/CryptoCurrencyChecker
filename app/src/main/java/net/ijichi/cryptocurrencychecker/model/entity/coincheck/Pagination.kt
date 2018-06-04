package net.ijichi.cryptocurrencychecker.model.entity.coincheck

/**
 * ページネーション
 * Created by ijichiyoshihito on 2018/01/19.
 */
data class Pagination(
    val limit: Int,
    val order: String,
    val starting_after: String?,
    val ending_before: String?
)
