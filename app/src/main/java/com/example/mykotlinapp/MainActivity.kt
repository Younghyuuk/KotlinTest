package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener{
    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var btnMult : Button
    lateinit var btnDivide : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultY : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnMult = findViewById(R.id.btn_mult)
        btnDivide = findViewById(R.id.btn_divide)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultY = findViewById(R.id.resY)

        btnAdd.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id) {
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_subtract -> {
                result = a-b
            }
            R.id.btn_mult -> {
                result = a*b
            }
            R.id.btn_divide -> {
                result = a/b
            }
        }
        resultY.text = "Result is $result"
    }

}