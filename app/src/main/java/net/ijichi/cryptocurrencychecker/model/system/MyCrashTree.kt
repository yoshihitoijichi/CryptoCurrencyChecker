package net.ijichi.cryptocurrencychecker.model.system

import android.util.Log
import timber.log.Timber

/**
 * timber crash class
 * Created by ijichiyoshihito on 2018/01/09.
 */
class MyCrashTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

        if (priority == Log.ERROR) {
        }

        if (priority == Log.DEBUG) {
        }

        if (priority == Log.WARN) {
        }

        if (priority == Log.INFO) {
        }

    }
}