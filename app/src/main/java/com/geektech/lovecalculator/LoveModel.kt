package com.geektech.lovecalculator

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LoveModel(
    @SerializedName("fname")
    var fname: String?= null,
    @SerializedName("sname")
    var sname: String?= null,
    var percentage: String?= null,
    var result: String?= null,
):Serializable
