package com.example.partyapplication.model

data class PizzaOrder(var numberOfPeople: Int) {
    fun calculatePizzas(): Int {
        // Assuming each person needs 2 slices and each pizza has 8 slices
        return (numberOfPeople * 2 + 7) / 8
    }
}