package rakib.hasan.local_craft_bd.model.division


import com.google.gson.annotations.SerializedName

data class DivisionDto(
    @SerializedName("name") val name: String,
    @SerializedName("data") val divisions: List<Division>
)