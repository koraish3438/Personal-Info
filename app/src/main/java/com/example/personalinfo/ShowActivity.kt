package com.example.personalinfo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.personalinfo.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()

        binding.backBtn.setOnClickListener { 
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun getData() {
        val name = intent.getStringExtra("name") ?: "No Name"
        val number = intent.getStringExtra("number") ?: "No Number"
        val imageURL = intent.getStringExtra("image")

        binding.gettingName.text = name
        binding.gettingNumber.text = number

        try {
            if (!imageURL.isNullOrEmpty()) {
                Glide.with(this).load(imageURL).into(binding.gettingImage)
            } else {
                binding.gettingImage.setImageResource(R.drawable.person)
            }
        } catch (e: Exception) {
            binding.gettingImage.setImageResource(R.drawable.person)
            e.printStackTrace()
        }
    }
}