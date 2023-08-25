package com.example.loginpage_pppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginpage_pppb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var correctUsername: String
    private lateinit var correctPassword: String
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        correctUsername = "imrismaa"
        correctPassword = "hakunamatat4"

        binding.loginbtn.setOnClickListener {
            val usernameInput = binding.username.text.toString()
            val passwordInput = binding.password.text.toString()

            if (usernameInput == correctUsername && passwordInput == correctPassword) {
                Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this@MainActivity, "username atau assword salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}