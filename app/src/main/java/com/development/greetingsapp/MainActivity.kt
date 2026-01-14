package com.development.greetingsapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var counter: Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Step 2 : Declaring Views
        val edt : EditText = findViewById(R.id.edt)
        val res_txt = findViewById<TextView>(R.id.res_txt)

        val btn = findViewById<Button>(R.id.btn) //can use any method

        //Step 3 : Adding funcitonalities (including counter app)
        btn.setOnClickListener(){
            var entered_text = edt.text
            res_txt.setText(""+increasecount())
            Toast.makeText(this,"Hello "+entered_text, Toast.LENGTH_LONG).show()

        }



    }
    fun increasecount() : Int{
        counter++
        return counter
    }
}
