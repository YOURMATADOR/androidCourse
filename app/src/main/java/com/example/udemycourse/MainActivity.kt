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
        val city = intent.getStringExtra("com.example.udemycourse.linearActivity.CITY")
        Toast.makeText(this, city, Toast.LENGTH_SHORT).show()
    }

//    fun validateLogIn(): Boolean {
//        val tiUsername = findView<ById<EditText>(R.id.tiUsername)
//        val tiUsernameText = tiUsername.text
//
//        if (tiUsernameText.isNullOrEmpty()) {
//            return false
//        }
//        return true
//    }
}
