package com.mixlr.panos.manualdependencyinjection.repositories

import com.mixlr.panos.manualdependencyinjection.datasources.UserLocalDataSource
import com.mixlr.panos.manualdependencyinjection.datasources.UserRemoteDataSource

class UserRepository(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
)
