package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private var operand: Double = 0.0
    private var operation: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.resultTextView)
    }
    fun numberClick(view: TextView) {

        if(view is TextView) {
            val result: String = resultTextView.text.toString()
            val number: String = view.text.toString()
            if (result == "0") {
                result = ""
            }

            resultTextView.text = result + number
        }
    }
}


fun operatonClick(view: TextView) {
    if(view is TextView) {

        if(!TextUtils.isEmpty(resultTextView.Text)){
            operand = resultTextView.Text.toString().toDouble()
        }
        operation = view.text.toString()
        resultTextView.text == ""

    }
}

fun equalsClick(view: TextView){
    val secOperandText: String = resultTextView.text.toString()
    var secOperand: Double = 0.0
    if(!TextUtils.isEmpty(secOperandText)){
        secOperand = secOperandText.toDouble()
    }
    when (operation) {
        "+" -> resultTextView.text = (operand + secOperand).toString()
        "*" -> resultTextView.text = (operand * secOperand).toString()
        "-" -> resultTextView.text = (operand - secOperand).toString()
        "/" -> resultTextView.text = (operand / secOperand).toString()
    }
}
fun clearClick(view: TextView) {
    resultTextView.text=""
    operand=0.0
    operation=""
}





