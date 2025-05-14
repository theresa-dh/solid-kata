package com.codurance.lsp.solution_tw

class PetrolCar: PetrolVehicle() {

    companion object {
        private const val FUEL_TANK_FULL = 100
    }

    private var fuelTankLevel: Int = 0

    fun getFuelTankLevel(): Int = fuelTankLevel

    override fun fillUpWithFuel() {
        fuelTankLevel = FUEL_TANK_FULL
    }
}