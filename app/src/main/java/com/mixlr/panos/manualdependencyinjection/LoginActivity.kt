package com.mixlr.panos.manualdependencyinjection

import android.app.Activity
import android.os.Bundle
import com.mixlr.panos.manualdependencyinjection.containers.AppContainer
import com.mixlr.panos.manualdependencyinjection.containers.LoginContainer
import com.mixlr.panos.manualdependencyinjection.viewmodels.LoginViewModel


class LoginActivity : Activity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var loginData: LoginUserData
    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appContainer = MyApplication().appContainer
        appContainer.loginContainer = LoginContainer(appContainer.userRepository)

        loginViewModel = appContainer.loginContainer!!.loginViewModelFactory.create()
        loginData = appContainer.loginContainer!!.loginData
    }

    override fun onDestroy() {
        appContainer.loginContainer = null
        super.onDestroy()
    }
}
