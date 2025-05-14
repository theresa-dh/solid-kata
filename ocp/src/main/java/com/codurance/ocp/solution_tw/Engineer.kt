package com.codurance.ocp.solution_tw

class Engineer(
    private val salary: Int
) : Employee {
    override fun payAmount() = salary
}