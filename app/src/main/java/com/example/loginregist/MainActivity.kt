package com.example.loginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.loginregist.databinding.ActivityLoginBinding
import com.example.loginregist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tv = findViewById(R.id.textView2)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username dan Password: $password"

        binding.btn2.setOnClickListener{replace(Fragment1())}


    }


    private fun replace(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView3, fragment)
        fragmentTransaction.commit()
    }
}