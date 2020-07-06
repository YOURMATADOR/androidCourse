package com.example.udemycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tiUsername = findViewById<EditText>(R.id.tiUsername)
        val bSignIn = findViewById<Button>(R.id.bSignIn)

        bSignIn.setOnClickListener(View.OnClickListener {
            if (validateLogIn()) {
                Toast.makeText(this, "Hello " + tiUsername.text, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all the inputs", Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun validateLogIn(): Boolean {
        val tiUsername = findViewById<EditText>(R.id.tiUsername)
        val tiUsernameText = tiUsername.text

        if (tiUsernameText.isNullOrEmpty()) {
            return false
        }
        return true
    }
}
