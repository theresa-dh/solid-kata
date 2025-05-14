package com.codurance.lsp.solution_tw

abstract class Vehicle {
    private var engineStarted: Boolean = false

    fun startEngine() {
        engineStarted = true
    }

    fun engineIsStarted(): Boolean = engineStarted

    fun stopEngine() {
        engineStarted = false
    }
}