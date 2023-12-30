package rakib.hasan.navigate

import rakib.hasan.navigate.Utils.districtPath
import rakib.hasan.navigate.Utils.divisionPath
import rakib.hasan.navigate.Utils.parseJson
import rakib.hasan.navigate.Utils.unionPath
import rakib.hasan.navigate.Utils.upazilaPath
import rakib.hasan.navigate.model.division.DivisionDto

class DivisionInfo {
    fun getDivisionsEn(): List<String> = parseJson<DivisionDto>(divisionPath).divisions.map { it.enName }
    fun getDivisionsBn(): List<String> = parseJson<DivisionDto>(divisionPath).divisions.map { it.bnName }

    fun getDistrictsEn(): List<String> = parseJson<DivisionDto>(districtPath).divisions.map { it.enName }
    fun getDistrictsBn(): List<String> = parseJson<DivisionDto>(districtPath).divisions.map { it.bnName }

    fun getUpazilasEn(): List<String> = parseJson<DivisionDto>(upazilaPath).divisions.map { it.enName }
    fun getUpazilasBn(): List<String> = parseJson<DivisionDto>(upazilaPath).divisions.map { it.bnName }

    fun getUnionsEn(): List<String> = parseJson<DivisionDto>(unionPath).divisions.map { it.enName }
    fun getUnionsBn(): List<String> = parseJson<DivisionDto>(unionPath).divisions.map { it.bnName }

}
