package com.onursumakoglu.cryptocurrencies.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //@SerializedName("currency")  //it is not necessary if our api variable same with our variable.
    val currency: String,
    //@SerializedName("price")
    val price: String
    )




/*
data class CryptoModel(        // When model used in this way, serializedname has to be specified.
    @SerializedName("currency")
    val currency_name: String,
    @SerializedName("price")
    val price_count: String
)
 */