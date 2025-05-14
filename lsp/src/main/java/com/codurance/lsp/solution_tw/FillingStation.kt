package com.codurance.lsp.solution_tw

class FillingStation {
    fun refuel(vehicle: PetrolVehicle) {
        vehicle.fillUpWithFuel()
    }

    fun charge(vehicle: ElectricVehicle) {
        vehicle.chargeBattery()
    }
}