package com.example.jetpackcomposepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class assignActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Mymorty()
        }
    }
}

@Composable
fun Mymorty() {
    var scrollState = rememberScrollState()


    Column(modifier = Modifier
        .verticalScroll(scrollState)
        .fillMaxSize()
    ) {
        Card(modifier = Modifier.padding(20.dp)) {

            Row() {
                Image(painter = painterResource(id = R.drawable.attila), contentDescription = "img")

                Column(modifier = Modifier.fillMaxWidth()) {


                    Text(
                        text = "Attila the warrior",
                        color = Color.Black,
                        fontWeight = ExtraBold
                    )
                    Text(text = "Human")
                    Text(text = "Active")

                }
            }
        }

Spacer(modifier = Modifier.height(1.dp))

        Card(modifier = Modifier
            .padding(20.dp)) {

            Row() {
                Image(painter = painterResource(id = R.drawable.legs), contentDescription = "img")
                Column(modifier = Modifier.fillMaxWidth()) {


                    Text(text = "Baby legs", color = Color.Black, fontWeight = ExtraBold)
                    Text(text = "Human")
                    Text(text = "Active")

                }
            }
        }


        Spacer(modifier = Modifier.height(1.dp))

        Card(modifier = Modifier
            .padding(20.dp)) {

            Row() {
                Image(painter = painterResource(id = R.drawable.poopy), contentDescription = "img")
                Column(modifier = Modifier.fillMaxWidth()) {


                    Text(
                        text = "Baby Poopybuthole",
                        color = Color.Black,
                        fontWeight = ExtraBold
                    )
                    Text(text = "Poopybutthole")
                    Text(text = "Active")

                }
            }
        }


        Spacer(modifier = Modifier.height(1.dp))

        Card(modifier = Modifier
            .padding(20.dp)) {

            Row() {
                Image(painter = painterResource(id = R.drawable.wizard), contentDescription = "img")

                Column(modifier = Modifier.fillMaxWidth()) {


                    Text(text = "Baby wizard", color = Color.Black, fontWeight = ExtraBold)
                    Text(text = "Alien")
                    Text(text = "Dead")

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable

fun MymortyPreview(){
     Mymorty()
}



