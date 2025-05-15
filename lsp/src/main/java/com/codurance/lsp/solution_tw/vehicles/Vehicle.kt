package com.codurance.lsp.solution_tw.vehicles

abstract class Vehicle {
    abstract val deliveryFactor: Double
    private var engineStarted: Boolean = false

    fun startEngine() {
        engineStarted = true
    }

    fun engineIsStarted(): Boolean = engineStarted

    fun stopEngine() {
        engineStarted = false
    }
}