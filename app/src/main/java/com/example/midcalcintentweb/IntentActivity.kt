package com.example.midcalcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    lateinit var Btn_call:Button
    lateinit var Btn_share:Button
    lateinit var Btn_sms:Button
    lateinit var Btn_dial:Button
    lateinit var Btn_camera:Button
    lateinit var Btn_Mpesa:Button
    lateinit var Btn_email:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Btn_call=findViewById(R.id.btn_call)
        Btn_share=findViewById(R.id.btn_share)
        Btn_sms=findViewById(R.id.btn_sms)
        Btn_dial=findViewById(R.id.btn_dial)
        Btn_camera=findViewById(R.id.btn_camera)
        Btn_Mpesa=findViewById(R.id.btn_stk)
        Btn_email=findViewById(R.id.btn_email)

        Btn_call.setOnClickListener {

        }
        Btn_email.setOnClickListener {

        }
        Btn_Mpesa.setOnClickListener {

        }
        Btn_camera.setOnClickListener {

        }
        Btn_dial.setOnClickListener {

        }
        Btn_sms.setOnClickListener {

        }
        Btn_share.setOnClickListener {

        }
    }
}