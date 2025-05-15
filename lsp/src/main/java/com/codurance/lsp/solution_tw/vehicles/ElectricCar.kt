package com.codurance.lsp.solution_tw.vehicles

class ElectricCar: ElectricVehicle() {

    companion object {
        private const val BATTERY_FULL = 100
    }

    private var batteryLevel: Int = 0

    fun getBatteryLevel(): Int = batteryLevel

    override fun chargeBattery() {
        batteryLevel = BATTERY_FULL
    }
}