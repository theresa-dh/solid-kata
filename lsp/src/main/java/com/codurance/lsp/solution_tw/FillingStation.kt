package com.codurance.lsp.solution_tw

import com.codurance.lsp.solution_tw.vehicles.ElectricVehicle
import com.codurance.lsp.solution_tw.vehicles.PetrolVehicle

class FillingStation {
    fun refuel(vehicle: PetrolVehicle) {
        vehicle.fillUpWithFuel()
    }

    fun charge(vehicle: ElectricVehicle) {
        vehicle.chargeBattery()
    }
}