package com.example.lemonade

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Lemonade(modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LemonadePreview(){
    LemonadeTheme() {
        Lemonade(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        )
    }
}

@Composable
fun Lemonade(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    var squeezee by remember { mutableStateOf(1) }

    val displayImage = when (result) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    val displayText = when (result) {
        1 -> R.string.tree
        2 -> R.string.squeeze
        3 -> R.string.drink
        else -> R.string.again
    }

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Button(onClick = {

            if (result == 1){
                squeezee = (2..4).random()
            }
            if (result == 2){
                squeezee--
                if (squeezee==0) result++
            }
            else {
                result++
                if (result == 5){
                    result = 1
                }
            }

        }) {
            Image(painterResource(id = displayImage), contentDescription = stringResource(R.string.lemon_tree),Modifier
                .border(
                    border = BorderStroke(2.dp, Color(105,205,216)),
                    shape = CutCornerShape(4.dp)
                ))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(stringResource(id = displayText))
    }
}