package net.ijichi.cryptocurrencychecker.api.service

import io.reactivex.Single
import net.ijichi.cryptocurrencychecker.api.ApiUtil
import net.ijichi.cryptocurrencychecker.api.caller.CoinCheckCaller
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.*
import net.ijichi.cryptocurrencychecker.model.enumeric.OrderType
import net.ijichi.cryptocurrencychecker.model.enumeric.PairType

/**
 * coincheck api service
 * Created by ijichiyoshihito on 2018/01/09.
 */
class CoinCheckService{
    private val caller = ApiUtil.generateCaller(CoinCheckCaller::class.java, ApiUtil.UrlType.COIN_CHECK)

    fun getTicker(): Single<Ticker> {
        return caller.getTicker()
    }

    fun getTrades(pair: PairType): Single<Trades> {
        return caller.getTrades(pair.name.toLowerCase())
    }

    fun getOrderBooks(): Single<OrderBooks>{
        return caller.getOrderBooks()
    }

    // input necessary amount or price
    fun getExchangeOrdersRate(orderType: OrderType, pair: PairType, amount: Double? = null, price: Int? = null): Single<ExchangeOrdersRate>{
        return caller.getExchangeOrdersRate(
            orderType.name.toLowerCase(),
            pair.name.toLowerCase(),
            amount,
            price)
    }

    fun getRate(pair: PairType): Single<Rate>{
        return caller.getRate(pair.name.toLowerCase())
    }

}
