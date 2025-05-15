package com.codurance.lsp.additional_lsp_ocp

import com.codurance.lsp.solution_tw.Order

class CheckoutPaymentService(val order: Order) {
    fun calculateTotal(): Double {
        return with(order) {
            products.sumOf { it.price } + fees.sumOf { it.calculateFee() } - discounts.sumOf { it.amount }
        }
    }
}