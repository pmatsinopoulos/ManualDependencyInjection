package com.mixlr.panos.manualdependencyinjection

import android.app.Application
import com.mixlr.panos.manualdependencyinjection.containers.AppContainer

class MyApplication : Application() {
    val appContainer = AppContainer()
}