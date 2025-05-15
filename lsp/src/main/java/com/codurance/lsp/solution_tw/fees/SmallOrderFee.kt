package com.codurance.lsp.solution_tw.fees

import com.codurance.lsp.solution_tw.Discount

class SmallOrderFee(
    override val id: String,
    override val orderId: String,
    override val basicAmount: Double = 5.0
) : Fee() {
    override fun calculateFee(): Double = basicAmount

    override fun applyDiscount(discount: Discount): Double = calculateFee() - discount.amount
}