package com.bihteryalcin.calculator_bihteryalcin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener(){
            add()
        }

        multiply.setOnClickListener(){
            multiply()
        }

        divide.setOnClickListener(){
            divide()
        }

        subtract.setOnClickListener(){
            subtract()
        }


    }



    fun add(){

        if(Isempty()){
            val input1= num1.text.toString().trim().toBigDecimal()
            val input2= num2.text.toString().trim().toBigDecimal()
            result.text = input1.add(input2).toString()
        }
    }

    fun subtract(){

        if(Isempty()){
            val input1= num1.text.toString().trim().toBigDecimal()
            val input2= num2.text.toString().trim().toBigDecimal()
            result.text = input1.subtract(input2).toString()
        }
    }

    fun multiply(){

        if(Isempty()){
            val input1= num1.text.toString().trim().toBigDecimal()
            val input2= num2.text.toString().trim().toBigDecimal()
            result.text = input1.multiply(input2).toString()
        }
    }

    fun divide(){

        if(Isempty()){
            val input1= num1.text.toString().trim().toBigDecimal()
            val input2= num2.text.toString().trim().toBigDecimal()
            if(input2.compareTo(BigDecimal.ZERO)==0){
                num2.error= "Invalid Number"
            }
            else{
            result.text = input1.divide(input2,2, RoundingMode.HALF_UP).toString()
        }}
    }



    fun Isempty():Boolean {
        var a = true
        if (num1.text.toString().trim().isEmpty()) {
            num1.error = "Number Required!"
            a = false
        }
        if (num2.text.toString().trim().isEmpty()) {
            num2.error = "Number Required!"
            a = false
        }

       return a
    }




}