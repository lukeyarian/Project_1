package com.example.project1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Numbers
    var current = 0
    var pending = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TextView
        val result: TextView = findViewById(R.id.result)


        //FUNCTION BUTTONS
        //clear button
        val clear: Button = findViewById(R.id.clear)
        clear.setOnClickListener {
            result.text = ""
        }

        //equals button
        val equals: Button = findViewById(R.id.equals)
        equals.setOnClickListener {
            // Handle button click event here
        }

        //positiveOrNegative button
        val positiveOrNegative: Button = findViewById(R.id.positiveOrNegative)
        positiveOrNegative.setOnClickListener {
            // Handle button click event here
        }

        //divideBy100 button
        val divideBy100: Button = findViewById(R.id.divideBy100)
        divideBy100.setOnClickListener {
            // Handle button click event here
        }

        //decimal button
        val decimal: Button = findViewById(R.id.decimal)
        decimal.setOnClickListener {
            // Handle button click event here
        }

        //add button
        val add: Button = findViewById(R.id.plus)
        add.setOnClickListener {
            // Handle button click event here
        }

        //subtract button
        val subtract: Button = findViewById(R.id.minus)
        subtract.setOnClickListener {
            // Handle button click event here
        }

        //multiply button
        val multiply: Button = findViewById(R.id.multiply)
        multiply.setOnClickListener {
            // Handle button click event here
        }

        //divide button
        val divide: Button = findViewById(R.id.divide)
        divide.setOnClickListener {
            // Handle button click event here
        }

        //NUMBER BUTTONS
        //one button
        val one: Button = findViewById(R.id.one)
        one.setOnClickListener {
            result.text = ""
        }

        //two button
        val two: Button = findViewById(R.id.two)
        two.setOnClickListener {
            result.text = ""
        }

        //three button
        val three: Button = findViewById(R.id.three)
        three.setOnClickListener {
            result.text = ""
        }

        //four button
        val four: Button = findViewById(R.id.four)
        four.setOnClickListener {
            result.text = ""
        }

        //five button
        val five: Button = findViewById(R.id.five)
        five.setOnClickListener {
            result.text = ""
        }

        //six button
        val six: Button = findViewById(R.id.six)
        six.setOnClickListener {
            result.text = ""
        }

        //seven button
        val seven: Button = findViewById(R.id.seven)
        seven.setOnClickListener {
            result.text = ""
        }

        //eight button
        val eight: Button = findViewById(R.id.eight)
        eight.setOnClickListener {
            result.text = ""
        }

        //nine button
        val nine: Button = findViewById(R.id.nine)
        nine.setOnClickListener {
            result.text = ""
        }

        //zero button
        val zero: Button = findViewById(R.id.zero)
        zero.setOnClickListener {
            result.text = ""
        }

    }
}