package com.example.partyapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToPizzaPartyButton = findViewById<Button>(R.id.btn_pizza_party)

        goToPizzaPartyButton.setOnClickListener {
            val intent = Intent(this, PizzaPartyActivity::class.java)
            startActivity(intent)
        }
    }
}
