package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JetPackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    MessageCard(name = "Ashlesh")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //JetPackComposeExampleTheme {
    //Greeting("Android")
    // }
    MessageCard("Ashlesh")
}

@Composable
fun MessageCard(name: String) {
    Box(Modifier.background(Color.Gray)) {
        Row(Modifier.padding(5.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "abcd",
                modifier = Modifier
                    .size(50.dp)
                    .clip(
                        CircleShape
                    )
                    .background(Color.White)
            )
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = "Hello $name")
                Text(text = "Padole")
            }
        }
    }


}