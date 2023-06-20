package com.mixlr.panos.manualdependencyinjection

import android.app.Activity
import android.os.Bundle
import com.mixlr.panos.manualdependencyinjection.datasources.UserLocalDataSource
import com.mixlr.panos.manualdependencyinjection.datasources.UserRemoteDataSource
import com.mixlr.panos.manualdependencyinjection.repositories.UserRepository
import com.mixlr.panos.manualdependencyinjection.retrofitservices.LoginRetrofitService
import com.mixlr.panos.manualdependencyinjection.viewmodels.LoginViewModel


class LoginActivity : Activity() {
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appContainer = MyApplication().appContainer
        loginViewModel = LoginViewModel(appContainer.userRepository)
    }
}
