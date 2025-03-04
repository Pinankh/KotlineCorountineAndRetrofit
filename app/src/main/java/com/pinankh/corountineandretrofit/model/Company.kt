package com.pinankh.corountineandretrofit.model

/**
 * Created by @Author Pinankh Patel on 04,March,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName


data class Company (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("catchPhrase" ) var catchPhrase : String? = null,
    @SerializedName("bs"          ) var bs          : String? = null

)