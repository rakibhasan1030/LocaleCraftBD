package rakib.hasan.navigate.model.division


import com.google.gson.annotations.SerializedName

data class Division(
    @SerializedName("id") val id: String,
    @SerializedName("en_name") val enName: String,
    @SerializedName("bn_name") val bnName: String,
    @SerializedName("lat") val lat: String,
    @SerializedName("long") val long: String,
    @SerializedName("url") val url: String
)