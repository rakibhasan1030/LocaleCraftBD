package rakib.hasan.testlib

import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

object Utils {

    const val divisionPath = "divisions.json"

    inline fun <reified T> parseJson(fileName: String): T {
        val inputStream = TestLibMainClass::class.java.classLoader.getResourceAsStream("divisions.json")
            ?: throw IllegalStateException("divisions.json not found in classpath")
        val reader = BufferedReader(InputStreamReader(inputStream)).use { it.readText() }
        return Gson().fromJson(reader, T::class.java)
    }
}