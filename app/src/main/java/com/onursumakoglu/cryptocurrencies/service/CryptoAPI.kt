package com.onursumakoglu.cryptocurrencies.service

import com.onursumakoglu.cryptocurrencies.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("prices?key=f0f89ebc7843811550508581583c5f7a147b08c0")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>


}