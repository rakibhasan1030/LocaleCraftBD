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
import rakib.hasan.testlib.TestLibMainClass

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
                    val main = TestLibMainClass()
                    Log.v("TAG", "Division names : ${main.getDivisions()}")
                }
            }
        }
    }

}