package com.dicoding.picodiploma.myprojectkp.login.data

import com.google.gson.annotations.SerializedName

data class ResultLogin (
    @field:SerializedName("users")
    val users: Users? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)