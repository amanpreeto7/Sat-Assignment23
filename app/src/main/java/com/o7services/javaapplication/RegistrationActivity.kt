package com.o7services.javaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.o7services.javaapplication.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }
}