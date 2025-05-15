package com.codurance.lsp.solution_tw.fees

import com.codurance.lsp.solution_tw.Discount
import com.codurance.lsp.solution_tw.vehicles.Vehicle

class DeliveryFee(
    override val id: String,
    override val orderId: String,
    override val basicAmount: Double = 2.5,
    private val deliveryMode: Vehicle,
) : Fee() {
    override fun calculateFee(): Double {
        return deliveryMode.deliveryFactor * basicAmount
        /* violates ocp:
        return if (deliveryMode == PetrolCar()) basicAmount * 2 else basicAmount
         */
    }

    override fun applyDiscount(discount: Discount): Double = calculateFee() - discount.amount
}