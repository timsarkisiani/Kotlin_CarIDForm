package com.example.shualeduri1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var gagzavna: Button
    private lateinit var ki1: Button
    private lateinit var ara1: Button
    private lateinit var ki2: Button
    private lateinit var ara2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gagzavna = findViewById(R.id.gagzavna)
        gagzavna.setOnClickListener() {
            Toast.makeText(applicationContext, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
        }
    }
}