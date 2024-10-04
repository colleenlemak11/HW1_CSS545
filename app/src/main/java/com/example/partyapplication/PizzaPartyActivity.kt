package com.example.partyapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.partyapplication.controller.PizzaController

class PizzaPartyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_party)

        val numberOfPeopleEditText = findViewById<EditText>(R.id.editTextNumberOfPeople)
        val submitOrderButton = findViewById<Button>(R.id.btn_submit_order)
        val backButton = findViewById<Button>(R.id.btn_back)

        submitOrderButton.setOnClickListener {
            val numberOfPeople = numberOfPeopleEditText.text.toString().toIntOrNull()

            if (numberOfPeople != null && numberOfPeople > 0) {
                val pizzaController = PizzaController()
                val numberOfPizzas = pizzaController.getPizzaOrder(numberOfPeople)
                Toast.makeText(this, "Order $numberOfPizzas pizzas!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a valid number of people", Toast.LENGTH_SHORT).show()
            }
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
