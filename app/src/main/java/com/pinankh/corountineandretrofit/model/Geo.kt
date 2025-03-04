package com.pinankh.corountineandretrofit.model

/**
 * Created by @Author Pinankh Patel on 04,March,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName


data class Geo (

    @SerializedName("lat" ) var lat : String? = null,
    @SerializedName("lng" ) var lng : String? = null

)