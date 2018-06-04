package net.ijichi.cryptocurrencychecker.api.service

import io.reactivex.Single
import net.ijichi.cryptocurrencychecker.api.ApiUtil
import net.ijichi.cryptocurrencychecker.api.caller.BitFlyerCaller
import net.ijichi.cryptocurrencychecker.model.entity.*
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.ExchangeOrdersRate
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.OrderBooks
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.Rate
import net.ijichi.cryptocurrencychecker.model.entity.coincheck.Trades
import net.ijichi.cryptocurrencychecker.model.enumeric.OrderType
import net.ijichi.cryptocurrencychecker.model.enumeric.PairType

/**
 * coincheck api service
 * Created by ijichiyoshihito on 2018/01/09.
 */
class BitFlyerService {
    private val caller = ApiUtil.generateCaller(BitFlyerCaller::class.java, ApiUtil.UrlType.BIT_FLYER)

    fun getMarkets(): Single<List<Market>> {
        return caller.getMarkets()
    }

    fun getBoard(productCode: String? = null, alias: String? = null): Single<Board> {
        return caller.getBoard(productCode, alias)
    }

    fun getTicker(productCode: String? = null, alias: String? = null): Single<BFTiker> {
        return caller.getTicker(productCode, alias)
    }

    fun getExecutions(productCode: String? = null, alias: String? = null): Single<List<Execution>> {
        return caller.getExecutions(productCode, alias)
    }

    fun getBoardState(productCode: String? = null, alias: String? = null): Single<BoardState> {
        return caller.getBoardState(productCode, alias)
    }

    fun getHealth(productCode: String? = null, alias: String? = null): Single<Health> {
        return caller.getHealth(productCode, alias)
    }

    fun getChat(fromDate: String? = null): Single<List<Chat>> {
        return caller.getChat(fromDate)
    }

}