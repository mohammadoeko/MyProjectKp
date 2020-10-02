package com.dicoding.picodiploma.myprojectkp.login.presenter

import com.dicoding.picodiploma.myprojectkp.login.data.ResultLogin
import com.dicoding.picodiploma.myprojectkp.login.network.NetworkConfig
import kotlinx.android.synthetic.main.activity_login.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginPresenter (val loginView: LoginView) {
    fun login(email : String, password : String) {
        NetworkConfig.getService()
            .login(email, password)
            .enqueue(object : Callback<ResultLogin>{
                override fun onFailure(call: Call<ResultLogin>, t: Throwable) {
                    loginView.onFailedLogin(t.localizedMessage)
                }

                override fun onResponse(call: Call<ResultLogin>, response: Response<ResultLogin>) {
                    if (response.isSuccessful && response.body()?.status == 200) {
                        loginView.onSuccessLogin(response.body()?.message, response.body()?.users)

                    } else {
                        loginView.onFailedLogin(response.body()?.message)
                    }
                }
            })
    }
}