package com.mixlr.panos.manualdependencyinjection.viewmodels

import com.mixlr.panos.manualdependencyinjection.repositories.UserRepository

class LoginViewModel(private val userRepository: UserRepository) {
}