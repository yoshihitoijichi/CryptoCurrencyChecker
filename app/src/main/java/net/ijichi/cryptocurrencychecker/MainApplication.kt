package net.ijichi.cryptocurrencychecker

import android.app.Application
import android.content.Context
import net.ijichi.cryptocurrencychecker.model.system.MyCrashTree
import timber.log.Timber

/**
 * main application
 * Created by ijichiyoshihito on 2018/01/09.
 */
class MainApplication : Application() {
    companion object {
        private lateinit var mInstance: MainApplication

        val instance: MainApplication
            get() = mInstance
        val context: Context
            get() = instance.applicationContext
    }

    init {
        mInstance = this
    }

    override fun onCreate() {
        super.onCreate()
        setupTimber()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
        else
            Timber.plant(MyCrashTree())
    }

}
