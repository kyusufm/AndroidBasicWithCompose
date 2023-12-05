package com.example.happyiduladha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happyiduladha.ui.theme.HappyIdulAdhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyIdulAdhaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingText(message = "Happy Idul Adha Ibrahim!", from ="From futhari")
                }
            }
        }
    }
}

@Composable
fun GreetingText( message: String, from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
            ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyIdulAdhaTheme {
        GreetingText(message = "Happy Idul Adha Ibrahim!", from ="From futhari")
    }
}