package com.pinankh.corountineandretrofit.model

/**
 * Created by @Author Pinankh Patel on 04,March,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName


data class UserResponse (

    @SerializedName("id"       ) var id       : Int?     = null,
    @SerializedName("name"     ) var name     : String?  = null,
    @SerializedName("username" ) var username : String?  = null,
    @SerializedName("email"    ) var email    : String?  = null,
    @SerializedName("address"  ) var address  : Address? = Address(),
    @SerializedName("phone"    ) var phone    : String?  = null,
    @SerializedName("website"  ) var website  : String?  = null,
    @SerializedName("company"  ) var company  : Company? = Company()

)