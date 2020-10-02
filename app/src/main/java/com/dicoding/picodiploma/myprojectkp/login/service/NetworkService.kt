package com.dicoding.picodiploma.myprojectkp.login.service
import com.dicoding.picodiploma.myprojectkp.login.data.ResultLogin
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface NetworkService {

    @FormUrlEncoded
    @POST("loginUsers")
    fun login(@Field("email") email : String?, @Field("password") password : String?) : Call<ResultLogin>
}