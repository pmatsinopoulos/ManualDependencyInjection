package com.mixlr.panos.manualdependencyinjection.datasources

import com.mixlr.panos.manualdependencyinjection.retrofitservices.LoginRetrofitService

class UserRemoteDataSource(private val loginService: LoginRetrofitService)