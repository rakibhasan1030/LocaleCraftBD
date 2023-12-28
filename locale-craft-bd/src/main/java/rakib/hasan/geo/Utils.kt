package rakib.hasan.geo

import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

object Utils {

    const val divisionPath = "divisions.json"
    const val districtPath = "districts.json"
    const val upazilaPath = "upazilas.json"
    const val unionPath = "unions.json"

    inline fun <reified T> parseJson(fileName: String): T {
        val inputStream = DivisionInfo::class.java.classLoader.getResourceAsStream(fileName) ?: throw IllegalStateException("$fileName.json not found in classpath")
        val reader = BufferedReader(InputStreamReader(inputStream)).use { it.readText() }
        return Gson().fromJson(reader, T::class.java)
    }
}