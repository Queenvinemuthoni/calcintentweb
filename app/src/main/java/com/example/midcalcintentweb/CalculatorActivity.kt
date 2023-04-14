package com.example.midcalcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var Edt_fnum:EditText
    lateinit var Edt_snum:EditText
    lateinit var Btn_add:Button
    lateinit var Btn_subtract:Button
    lateinit var Btn_multiply:Button
    lateinit var Btn_divide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Tv_answer=findViewById(R.id.txt_answer)
        Edt_fnum=findViewById(R.id.edt_fnum)
        Edt_snum=findViewById(R.id.edt_snum)
        Btn_add=findViewById(R.id.btn_add)
        Btn_subtract=findViewById(R.id.btn_subtract)
        Btn_multiply=findViewById(R.id.btn_multiply)
        Btn_divide=findViewById(R.id.btn_divide)

        Btn_add.setOnClickListener {
            var myfirstnumber=Edt_fnum.text.toString()
            var mysecondnumber=Edt_snum.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

        Btn_subtract.setOnClickListener {
            var myfirstnumber=Edt_fnum.text.toString()
            var mysecondnumber=Edt_snum.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        Btn_multiply.setOnClickListener {
            var myfirstnumber=Edt_fnum.text.toString()
            var mysecondnumber=Edt_snum.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        Btn_divide.setOnClickListener {
            var myfirstnumber=Edt_fnum.text.toString()
            var mysecondnumber=Edt_snum.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

    }
}