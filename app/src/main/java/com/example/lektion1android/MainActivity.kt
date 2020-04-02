package com.example.lektion1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    lateinit var editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.inputText)
        Log.d(TAG, "Hej")


        val button = findViewById<Button>(R.id.button)

        button.text = "Tryck"

        button.setOnClickListener { v ->
            val message = editText.text.toString()
            Log.d(TAG, message)
        }

    }

//    fun buttonPressed (view : View) {
//        val message = editText.text.toString()
//        Log.d(TAG, message)
//    }
}
