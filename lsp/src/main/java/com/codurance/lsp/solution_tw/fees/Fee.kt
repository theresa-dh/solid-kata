package com.codurance.lsp.solution_tw.fees

import com.codurance.lsp.solution_tw.Discount

abstract class Fee {
    abstract val id: String
    abstract val orderId: String
    abstract val basicAmount: Double
    abstract fun calculateFee(): Double
    abstract fun applyDiscount(discount: Discount): Double
    /* violates lsp:
    abstract fun calculateDeliveryFee(): Double
    abstract fun calculateSmallOrderFee(): Double
     */
}