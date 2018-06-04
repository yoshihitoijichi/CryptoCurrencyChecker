package net.ijichi.cryptocurrencychecker.api.caller

import io.reactivex.Single
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * CoinCheck caller
 * Created by ijichiyoshihito on 2018/01/09.
 */

interface CoinCheckCaller {

    // ティッカー
    @GET("/api/ticker")
    fun getTicker(): Single<Ticker>

    // 全取引履歴
    @GET("/api/trades")
    fun getTrades(
        @Query("pair") pair: String
    ): Single<Trades>

    // 板情報
    @GET("/api/order_books")
    fun getOrderBooks(): Single<OrderBooks>

    // レート情報
    @GET("/api/exchange/orders/rate")
    fun getExchangeOrdersRate(
        @Query("order_type") orderType: String,
        @Query("pair") pair: String,
        @Query("amount") amount: Double?,
        @Query("price") price: Int?
    ): Single<ExchangeOrdersRate>

    // 販売レート取得
    @GET("/api/rate/{pair}")
    fun getRate(
        @Path("pair") pair: String
    ): Single<Rate>

}
