package com.dicoding.picodiploma.myprojectkp.login.data

import com.google.gson.annotations.SerializedName

data class Users (

    @field:SerializedName("user_id")
    val userId: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,

    @field:SerializedName("no_hp")
    val noHp: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("password")
    val password: String? = null,

    @field:SerializedName("isEmailConfirmed")
    val isEmailConfirmed: String? = null,

    @field:SerializedName("token")
    val token: String? = null,

    @field:SerializedName("created_at")
    val createdAt: String? = null,

    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("is_active")
    val isActive: String? = null

)