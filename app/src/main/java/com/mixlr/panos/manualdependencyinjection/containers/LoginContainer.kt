package com.mixlr.panos.manualdependencyinjection.containers

import com.mixlr.panos.manualdependencyinjection.LoginUserData
import com.mixlr.panos.manualdependencyinjection.repositories.UserRepository
import com.mixlr.panos.manualdependencyinjection.viewmodels.LoginViewModelFactory

class LoginContainer(private val userRepository: UserRepository) {
    val loginData = LoginUserData(username = "username", password = "password")
    val loginViewModelFactory = LoginViewModelFactory(this.userRepository)
}