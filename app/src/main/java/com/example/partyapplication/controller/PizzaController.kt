package com.example.partyapplication.controller

import com.example.partyapplication.model.PizzaOrder

class PizzaController {
    fun getPizzaOrder(numberOfPeople: Int): Int {
        val pizzaOrder = PizzaOrder(numberOfPeople)
        return pizzaOrder.calculatePizzas()
    }
}
