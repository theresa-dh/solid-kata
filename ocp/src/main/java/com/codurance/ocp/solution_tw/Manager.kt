package com.codurance.ocp.solution_tw

class Manager(
    private val salary: Int,
    private val bonus: Int
) : Employee {
    override fun payAmount(): Int = salary + bonus
}