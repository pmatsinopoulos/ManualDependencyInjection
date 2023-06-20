package com.mixlr.panos.manualdependencyinjection.viewmodels

import com.mixlr.panos.manualdependencyinjection.Factory
import com.mixlr.panos.manualdependencyinjection.repositories.UserRepository

class LoginViewModelFactory(private val userRepository: UserRepository) : Factory<LoginViewModel> {
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }
}