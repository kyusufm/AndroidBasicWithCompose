package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.IntegerRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier=Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard("t1","Displays text and follows the recommended Material Design guidelines.\n", Color(0xFFEADDFF), Modifier.weight(1f))
            QuadrantCard("t2","Creates a composable that lays out and draws a given Painter class object.\n", Color(0xFFF6EDFF), Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard("t3","A layout composable that places its children in a horizontal sequence.\n", Color(0xFFB69DF8), Modifier.weight(1f))
            QuadrantCard("t4","A layout composable that places its children in a vertical sequence.\n", Color(0xFFD0BCFF), Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantCard(title:String, desc:String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title,
        fontWeight = FontWeight.Bold)
        Text(text = desc,
        textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}