package com.mixlr.panos.manualdependencyinjection.containers

import com.mixlr.panos.manualdependencyinjection.datasources.UserLocalDataSource
import com.mixlr.panos.manualdependencyinjection.datasources.UserRemoteDataSource
import com.mixlr.panos.manualdependencyinjection.repositories.UserRepository
import com.mixlr.panos.manualdependencyinjection.retrofitservices.LoginRetrofitService
import com.mixlr.panos.manualdependencyinjection.viewmodels.LoginViewModelFactory

// Container of objects shared across the whole app
class AppContainer {

    // Since you want to expose userRepository out of the container, you need to satisfy
    // its dependencies as you did before
    private val retrofit = LoginRetrofitService()

    private val remoteDataSource = UserRemoteDataSource(retrofit)
    private val localDataSource = UserLocalDataSource()

    // userRepository is not private; it'll be exposed
    val userRepository = UserRepository(localDataSource, remoteDataSource)

    val loginViewModelFactory = LoginViewModelFactory(userRepository)
}