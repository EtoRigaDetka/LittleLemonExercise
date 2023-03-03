package com.example.littlelemonexercise

import android.os.Bundle
import android.provider.Settings.Global.getString
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Default
import com.example.littlelemonexercise.ui.theme.LittleLemonExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//
                    RestorauntName(
                        name = stringResource(id = R.string.title), size = 56
                    )
                }

            }
        }
    }
}


@Composable
fun RestorauntName(name:String,size:Int){
    Text(text ="$name", fontSize=size.sp)

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RestorauntName(
        name = stringResource(id = R.string.title),
        size = 32
    )
}

