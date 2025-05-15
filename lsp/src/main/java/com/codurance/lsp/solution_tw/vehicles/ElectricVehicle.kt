package com.codurance.lsp.solution_tw.vehicles

abstract class ElectricVehicle: Vehicle() {
    override val deliveryFactor: Double = 1.0
    abstract fun chargeBattery()
}