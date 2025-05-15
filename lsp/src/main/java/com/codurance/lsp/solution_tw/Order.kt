package com.codurance.lsp.solution_tw

import com.codurance.lsp.solution_tw.fees.Fee

data class Order(
    val id: String,
    val discounts: List<Discount>,
    val fees: List<Fee>,
    val products: List<Product>,
)

data class Product(
    val id: String,
    val name: String,
    val price: Double,
)
