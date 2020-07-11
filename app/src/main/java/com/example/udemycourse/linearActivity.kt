package com.example.udemycourse

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_linear.*

class linearActivity : AppCompatActivity() {
    val KEY = "com.example.udemycourse.linearActivity.CITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        setListeners()
    }

    fun setListeners() {
        val welcomeButton = findViewById<Button>(R.id.welcome_button)
        welcomeButton.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            val goCityIntent = Intent(this, MainActivity::class.java)
            goCityIntent.putExtra(KEY,"Guadalajara")
            startActivity(goCityIntent)
        })

    }
}
