package com.example.project1

import android.annotation.SuppressLint //this was given by QuickFixes
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Variables
    private lateinit var resultView: TextView
    private var currentNum: Double = 0.0
    private var currentOp: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Result TextView
        resultView = findViewById(R.id.result)

        // Click listeners for number buttons
        val numberButtons = arrayOf<Button>(
            findViewById(R.id.zero), findViewById(R.id.one), findViewById(R.id.two), findViewById(R.id.three), findViewById(R.id.four), findViewById(R.id.five), findViewById(R.id.six),
            findViewById(R.id.seven), findViewById(R.id.eight), findViewById(R.id.nine)
        )

        for (button in numberButtons) {
            button.setOnClickListener {
                onNumberButtonClick(it)
            }
        }

        // Click listeners for operator buttons
        val operatorButtons = arrayOf<Button>(
            findViewById(R.id.plus), findViewById(R.id.minus), findViewById(R.id.multiply), findViewById(R.id.divide), findViewById(R.id.divideBy100)
        )

        for (button in operatorButtons) {
            button.setOnClickListener {
                onOperatorButtonClick(it)
            }
        }

        // Click listener for = button
        val equalsButton = findViewById<Button>(R.id.equals)
        equalsButton.setOnClickListener {
            onEqualsButtonClick()
        }

        // Click listener for C button
        val clearButton = findViewById<Button>(R.id.clear)
        clearButton.setOnClickListener {
            onClearButtonClick()
        }

        // Click listener for +/- button
        val negateButton = findViewById<Button>(R.id.positiveOrNegative)
        negateButton.setOnClickListener {
            onNegateButtonClick()
        }

        // Set click listener for the decimal button
        val decimalButton = findViewById<Button>(R.id.decimal)
        decimalButton.setOnClickListener {
            onDecimalButtonClick(it)
        }

        // Set click listeners for the Landscape exclusive buttons (sin, cos, tan, Log 10, ln)
        //Remember, these additional buttons are not in the portrait mode so you must check if these are null or
        //not before setting the onClickListener




    }
    @SuppressLint("SetTextI18n") //this was given by QuickFixes
    private fun onNumberButtonClick(view: View) {
        if (view is Button) {
            val buttonText = view.text.toString()
            val currentText = resultView.text.toString()

            // Check if the current text is "0" or an operator result
            if (currentText == "0" || currentOp != null) {
                resultView.text = buttonText
            } else {
                resultView.text = currentText + buttonText
            }
        }
    }
    private fun onOperatorButtonClick(view: View) {
        if (view is Button) {
            val operator = view.text.toString()
            val currentText = resultView.text.toString()

            //Check
            if (currentOp != null || currentText.isEmpty()) {
                //Update
                currentOp = operator
            } else {
                //Calculate
                val previousNum = currentNum
                val currentNumStr = currentText.replace(",", "").toDouble()
                currentNum = when (currentOp) {
                    "+" -> previousNum + currentNumStr
                    "-" -> previousNum - currentNumStr
                    "X" -> previousNum * currentNumStr
                    "/" -> {
                        if (currentNumStr != 0.0) {
                            previousNum / currentNumStr
                        } else {
                            //Otherwise, error
                            println("Error")
                            return
                        }
                    }
                    "%" -> currentNumStr / 100.0
                    else -> currentNumStr
                }

                //Display
                resultView.text = currentNum.toString()
                currentOp = operator
            }
        }
    }
    private fun onEqualsButtonClick() {
        val currentText = resultView.text.toString()
        if (currentOp != null && currentText.isNotEmpty()) {
            val currentNumStr = currentText.replace(",", "").toDouble()
            when (currentOp) {
                "+" -> currentNum += currentNumStr
                "-" -> currentNum -= currentNumStr
                "X" -> currentNum *= currentNumStr
                "/" -> {
                    if (currentNumStr != 0.0) {
                        currentNum /= currentNumStr
                    } else {
                        //Otherwise, error
                        println("Error")
                        return
                    }
                }
                "%" -> currentNum = currentNumStr / 100.0
            }

            //Display
            resultView.text = currentNum.toString()
            currentOp = null
        }
    }

    private fun onClearButtonClick() {
        currentNum = 0.0
        currentOp = null
        resultView.text = "0"
    }

    private fun onNegateButtonClick() {
        val currentText = resultView.text.toString()
        if (currentText != "0") {
            currentNum = -currentText.replace(",", "").toDouble()
            resultView.text = currentNum.toString()
        }
    }

    @SuppressLint("SetTextI18n")  //this was given by QuickFixes
    private fun onDecimalButtonClick(view: View) {
        if (view is Button) {
            val currentText = resultView.text.toString()
            //Check
            if (!currentText.contains(".")) {
                //Append
                resultView.text = "$currentText."
            }
        }
    }

    // Logging function
    private fun logButtonPress(buttonText: String) {
        Log.d("CalculatorApp", "Button Pressed: $buttonText")
    }
    // Trigonometry calculation functions
    private fun calculateSin() {
        val currentText = resultView.text.toString()
        val currentValue = currentText.toDouble()
        val result = Math.sin(currentValue)
        resultView.text = result.toString()
    }
    private fun calculateCos() {
        val currentText = resultView.text.toString()
        val currentValue = currentText.toDouble()
        val result = Math.cos(currentValue)
        resultView.text = result.toString()
    }
    private fun calculateTan() {
        val currentText = resultView.text.toString()
        val currentValue = currentText.toDouble()
        val result = Math.tan(currentValue)
        resultView.text = result.toString()
    }
    // Logarithmic calculation functions
    private fun calculateLog10() {
        val currentText = resultView.text.toString()
        val currentValue = currentText.toDouble()
        val result = Math.log10(currentValue)
        resultView.text = result.toString()
    }
    private fun calculateLn() {
        val currentText = resultView.text.toString()
        val currentValue = currentText.toDouble()
        val result = Math.log(currentValue)
        resultView.text = result.toString()
    }



}

