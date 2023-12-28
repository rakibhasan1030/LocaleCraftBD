package rakib.hasan.localecraftbd

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import rakib.hasan.localecraftbd.ui.theme.LocaleCraftBDTheme
import rakib.hasan.geo.DivisionInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocaleCraftBDTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val main = DivisionInfo()

                    Log.v("TAG", "getDivisionsBn : ${main.getDivisionsBn()}")
                    Log.v("TAG", "getDivisionsEn : ${main.getDivisionsEn()}")

                    Log.v("TAG", "getDistrictsBn : ${main.getDistrictsBn()}")
                    Log.v("TAG", "getDistrictsEn : ${main.getDistrictsEn()}")

                    Log.v("TAG", "getUpazilasBn : ${main.getUpazilasBn()}")
                    Log.v("TAG", "getUpazilasEn : ${main.getUpazilasEn()}")

                    Log.v("TAG", "getUnionsBn : ${main.getUnionsBn().size}")
                    Log.v("TAG", "getUnionsEn : ${main.getUnionsEn()}")
                }
            }
        }
    }

}