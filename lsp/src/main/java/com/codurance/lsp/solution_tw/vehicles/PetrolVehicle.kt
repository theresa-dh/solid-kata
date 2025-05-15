package com.codurance.lsp.solution_tw.vehicles

abstract class PetrolVehicle: Vehicle() {
    override val deliveryFactor: Double = 2.0
    abstract fun fillUpWithFuel()
}