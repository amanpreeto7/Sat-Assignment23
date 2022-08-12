package com.o7services.javaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.o7services.javaapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
        var arrayList = arrayOf(1,2,3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        arrayList[0] = 5

        binding.btnLogin.setOnClickListener {
            System.out.println("Login Clicked")
            var name = binding.etName.text.toString()
            var password = binding.etPassword.text.toString()
            if(name.isNullOrEmpty() == true){
                binding.etName.error = resources.getString(R.string.enter_name)
                binding.etName.requestFocus()
            }else if(password.isNullOrEmpty()) {
                binding.etPassword.error = resources.getString(R.string.login_password)
            }else{
                Toast.makeText(this, resources.getString(R.string.login_successfully), Toast.LENGTH_LONG)
            }
            System.out.println("Login Clicked $name")

        }
    }
}