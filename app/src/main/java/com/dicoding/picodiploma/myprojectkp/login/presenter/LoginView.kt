package com.dicoding.picodiploma.myprojectkp.login.presenter

import com.dicoding.picodiploma.myprojectkp.login.data.Users

interface LoginView {
    fun onSuccessLogin (msg : String?, data : Users?)
    fun onFailedLogin (msg : String?)
}