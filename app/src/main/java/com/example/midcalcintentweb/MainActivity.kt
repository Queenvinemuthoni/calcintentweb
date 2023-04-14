package com.example.midcalcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCalc:Button
    lateinit var ButtonIntent:Button
    lateinit var ButtonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.btn_calc)
        ButtonIntent=findViewById(R.id.btn_intent)
        ButtonWeb=findViewById(R.id.btn_web)

        ButtonCalc.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }

    }
}