package com.dicoding.picodiploma.myprojectkp

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.dicoding.picodiploma.myprojectkp.login.data.Users
import com.dicoding.picodiploma.myprojectkp.login.presenter.LoginPresenter
import com.dicoding.picodiploma.myprojectkp.login.presenter.LoginView
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener, LoginView {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter(this)


        val tv_Reset : TextView = findViewById(R.id.reset_password)
        tv_Reset.setOnClickListener(this)

        val btn_Login : Button = findViewById(R.id.btn_login)
        btn_Login.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.reset_password -> {
                val moveIntent = Intent(this@LoginActivity, ResetPasswordActivity::class.java)
                startActivity(moveIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            }

            R.id.btn_login -> {
                val email = et_username.text.toString()
                val password = et_password.text.toString()
                presenter.login(email, password)

            }
        }
    }

    override fun onSuccessLogin(msg: String?, data: Users?) {
        alert {
            title = "Information"
            message = "Login Success"
        }.show()
        startActivity<BottomNavigasiActivity>()
        finish()
    }

    override fun onFailedLogin(msg: String?) {
        alert {
            title = "Information"
            message = "Login Failed Silahkan Cek Email Password"
        }.show()
    }
}