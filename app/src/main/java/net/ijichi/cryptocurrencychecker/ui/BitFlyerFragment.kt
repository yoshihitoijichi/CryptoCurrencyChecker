package net.ijichi.cryptocurrencychecker.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.ijichi.cryptocurrencychecker.R
import net.ijichi.cryptocurrencychecker.api.service.BitFlyerService
import net.ijichi.cryptocurrencychecker.databinding.FragmentBitFlyerBinding
import net.ijichi.cryptocurrencychecker.model.extension.fetch
import timber.log.Timber


/**
 * bit flyer fragment
 * Created by ijichiyoshihito on 2018/01/22.
 */
class BitFlyerFragment : Fragment() {

    private lateinit var binding: FragmentBitFlyerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bit_flyer, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // BitFlyer
        val bitFlyerService = BitFlyerService()

        // [{"product_code":"BTC_JPY"},{"product_code":"FX_BTC_JPY"},{"product_code":"ETH_BTC"},{"product_code":"BCH_BTC"},{"product_code":"BTCJPY19JAN2018"},{"product_code":"BTCJPY26JAN2018","alias":"BTCJPY_MAT1WK"},{"product_code":"BTCJPY02FEB2018","alias":"BTCJPY_MAT2WK"}]
        bitFlyerService.getMarkets().fetch({
            val productCode = it.first().productCode
            Timber.i("productCode:$productCode")
            bitFlyerService.getHealth(productCode).fetch({
                binding.item0?.content?.text = it.status
            }, {})


            // 板情報
//            bitFlyerService.getBoard(it.first().productCode).fetch({},{})
//            bitFlyerService.getTicker(productCode).fetch({},{})
//            bitFlyerService.getExecutions(productCode).fetch({},{})

//            bitFlyerService.getBoardState(productCode).fetch({},{})
//            bitFlyerService.getHealth(productCode).fetch({},{})
            bitFlyerService.getChat().fetch({}, {})
        }, {})

    }
}