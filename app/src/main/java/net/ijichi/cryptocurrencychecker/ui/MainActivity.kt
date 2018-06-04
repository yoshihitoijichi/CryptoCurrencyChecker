package net.ijichi.cryptocurrencychecker.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import net.ijichi.cryptocurrencychecker.R
import net.ijichi.cryptocurrencychecker.api.service.BitFlyerService
import net.ijichi.cryptocurrencychecker.api.service.CoinCheckService
import net.ijichi.cryptocurrencychecker.databinding.ActivityMainBinding
import net.ijichi.cryptocurrencychecker.model.enumeric.OrderType
import net.ijichi.cryptocurrencychecker.model.enumeric.PairType
import net.ijichi.cryptocurrencychecker.model.extension.fetch
import net.ijichi.cryptocurrencychecker.model.extension.print
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = MainPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = adapter
        binding.mainTabLayout.setupWithViewPager(binding.mainViewPager)

        binding.mainViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageSelected(position: Int) {
                Timber.i("position:$position")
            }
        })
    }

    override fun onStart() {
        super.onStart()

        // CoinCheck
//        val coinCheckService = CoinCheckService()
//        coinCheckService.getTicker().fetch({},{})
//        coinCheckService.getTrades(PairType.BTC_JPY).fetch({},{})
//        coinCheckService.getOrderBooks().fetch({},{})
//        coinCheckService.getExchangeOrdersRate(
//            OrderType.BUY,
//            PairType.BTC_JPY,
//            1.0).fetch({},{})
//        coinCheckService.getRate(PairType.BTC_JPY).fetch({},{})


        // Zaif

    }
}
