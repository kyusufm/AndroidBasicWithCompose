package com.example.bussinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray,
                ) {

                    CenterDisplay("Android", "Chief")
                    ContactInformation("08128282", "@jonjonjon", "marjukjuk@gmail.com")
                }
            }
        }
    }
}

@Composable
fun CenterDisplay(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image, contentDescription = "logo",
            modifier = Modifier
                .width(80.dp)
                .background(Color.DarkGray)
        )
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(16.dp),
            fontSize = 32.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Android Junior Developer",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ContactInformation(phone: String, social: String, mail: String, modifier: Modifier = Modifier) {
    val phoneIcon = Icons.Rounded.Call
    val shareIcon = Icons.Rounded.Share
    val mailIcon = Icons.Rounded.Email
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Row (){
            Icon(imageVector = phoneIcon, contentDescription = null, Modifier.padding(end = 10.dp))
            Text(phone)
        }
        Row {
            Icon(imageVector = shareIcon, contentDescription = null, Modifier.padding(end = 10.dp))
            Text(social)
        }
        Row {
            Icon(imageVector = mailIcon, contentDescription = null, Modifier.padding(end = 10.dp))
            Text(mail)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BussinessCardAppTheme {
        Column() {
            CenterDisplay("Android", "chief")
            ContactInformation("08128282", "@jonjonjon", "marjukjuk@gmail.com")

        }
    }
}