package rakib.hasan.testlib

import com.google.gson.Gson
import rakib.hasan.local_craft_bd.model.division.DivisionDto
import rakib.hasan.testlib.Utils.divisionPath
import rakib.hasan.testlib.Utils.parseJson
import java.io.BufferedReader
import java.io.InputStreamReader

class TestLibMainClass {
    fun getDivisions(): List<String> = parseJson<DivisionDto>(divisionPath).divisions.map { it.enName }
}
