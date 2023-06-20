package com.mixlr.panos.manualdependencyinjection

interface Factory<T> {
    fun create(): T
}