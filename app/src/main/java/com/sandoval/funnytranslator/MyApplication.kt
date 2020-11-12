package com.sandoval.funnytranslator

import android.app.Application
import com.huawei.hms.mlsdk.common.MLApplication

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        MLApplication.getInstance().apiKey = "CgB6e3x9QF8GbTxrlyTXiXxCGamopZhcEgmpjekVdszLFZ7aMYqZpsPq0twn/h2FdnGdszg0mmSJK9Vwpk79/j0u"
    }

}