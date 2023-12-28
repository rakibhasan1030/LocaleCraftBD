package rakib.hasan.geo

import rakib.hasan.geo.Utils.districtPath
import rakib.hasan.geo.model.division.DivisionDto
import rakib.hasan.geo.Utils.divisionPath
import rakib.hasan.geo.Utils.parseJson
import rakib.hasan.geo.Utils.unionPath
import rakib.hasan.geo.Utils.upazilaPath

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
