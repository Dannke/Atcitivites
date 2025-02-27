package com.example.atcitivites

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.atcitivites.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = binding.editTextPerson
        val desc = binding.editTextDesc
        val userFrom = binding.editTextFrom
        val buttonSend = binding.buttonSend

        buttonSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user", user.text.toString())
            intent.putExtra("userFrom", userFrom.text.toString())
            intent.putExtra("desc", desc.text.toString())

            startActivity(intent)
        }
    }
}