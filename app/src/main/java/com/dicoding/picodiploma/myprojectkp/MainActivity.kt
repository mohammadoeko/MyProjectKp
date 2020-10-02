package com.dicoding.picodiploma.myprojectkp

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin : Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

        val btnSignup : Button = findViewById(R.id.btn_signup)
        btnSignup.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_login -> {
                val moveIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(moveIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            }

            R.id.btn_signup -> {
                val moveIntent = Intent(this@MainActivity, SignupActivity::class.java)
                startActivity(moveIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            }

             }
        }
    }
