package com.example.atcitivites

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.atcitivites.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = binding.textView
        val user = intent.getStringExtra("user")
        val desc = intent.getStringExtra("desc")
        val userFrom = intent.getStringExtra("userFrom")

        text.text = "$user, вам послание от $userFrom, следующего содержания:\n\n $desc"

    }
}