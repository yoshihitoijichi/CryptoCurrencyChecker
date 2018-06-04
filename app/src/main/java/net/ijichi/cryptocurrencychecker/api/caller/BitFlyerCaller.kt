package net.ijichi.cryptocurrencychecker.api.caller

import io.reactivex.Single
import net.ijichi.cryptocurrencychecker.model.entity.*
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.ExchangeOrdersRate
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.OrderBooks
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.Rate
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.Trades
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * CoinCheck caller
 * Created by ijichiyoshihito on 2018/01/09.
 */

interface BitFlyerCaller {

    // マーケットの一覧
    @GET("/v1/markets")
    fun getMarkets(): Single<List<Market>>

    // 板情報
    @GET("/v1/board")
    fun getBoard(
        @Query("product_code") productCode: String?,
        @Query("alias") alias: String?
    ): Single<Board>

    // ティッカー
    @GET("/v1/ticker")
    fun getTicker(
        @Query("product_code") productCode: String?,
        @Query("alias") alias: String?
    ): Single<BFTiker>

    // 約定履歴
    @GET("/v1/executions")
    fun getExecutions(
        @Query("product_code") productCode: String?,
        @Query("alias") alias: String?
    ): Single<List<Execution>>

    // 板の状態
    @GET("/v1/getboardstate")
    fun getBoardState(
        @Query("product_code") productCode: String?,
        @Query("alias") alias: String?
    ): Single<BoardState>

    // 取引所の状態
    @GET("/v1/gethealth")
    fun getHealth(
        @Query("product_code") productCode: String?,
        @Query("alias") alias: String?
    ): Single<Health>

    // チャット
    @GET("/v1/getchats")
    fun getChat(
        @Query("from_date") fromDate: String?
    ): Single<List<Chat>>

}