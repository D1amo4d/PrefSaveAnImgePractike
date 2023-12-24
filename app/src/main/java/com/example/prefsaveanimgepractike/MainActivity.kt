package com.example.prefsaveanimgepractike

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prefsaveanimgepractike.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReplacing.setOnClickListener {
            pickImageGallary()
        }

    }

    private fun pickImageGallary() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, REPLACING_AIMGE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REPLACING_AIMGE && resultCode == RESULT_OK) {
            binding.ReplacingTheImage.setImageURI(data?.data)

        }
    }

    companion object {
        const val REPLACING_AIMGE = 100
    }
}