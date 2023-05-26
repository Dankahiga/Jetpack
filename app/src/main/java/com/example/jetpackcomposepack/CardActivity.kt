package com.example.jetpackcomposepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()

        }
    }
}

@Composable
fun mycard(){
    var scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally

        ) {
        Text(text = "Breed", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Card(modifier = Modifier

            .background(color = Color.Gray)
            .padding(20.dp)) {


           Column(modifier = Modifier
               .padding(30.dp)) {
               Text(text = "Doberman", fontStyle = FontStyle.Italic, fontSize = 30.sp)
               Image(
                   painter = painterResource(id = R.drawable.dog3),
                   contentDescription = "image",
                   modifier = Modifier
                       .size(width = 120.dp, height = 100.dp)
                       .clip(shape = CircleShape)
               )
               
           }
        }
        Spacer(modifier =Modifier.height(20.dp) )

        Card(modifier = Modifier

            .background(color = Color.Gray)
            .padding(20.dp)) {


            Column(modifier = Modifier
                .padding(30.dp)) {
                Text(text = "Labrador", fontStyle = FontStyle.Italic, fontSize = 30.sp)
                Image(
                    painter = painterResource(id = R.drawable.lab),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(width = 120.dp, height = 100.dp)
                        .clip(shape = CircleShape)
                )

            }
        }
        Spacer(modifier =Modifier.height(20.dp) )

        Card(modifier = Modifier

            .background(color = Color.Gray)
            .padding(20.dp)) {


            Column(modifier = Modifier
                .padding(30.dp)) {
                Text(text = "Chowchow", fontStyle = FontStyle.Italic, fontSize = 30.sp)
                Image(
                    painter = painterResource(id = R.drawable.dog2),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(width = 120.dp, height = 100.dp)
                        .clip(shape = CircleShape)
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun mycardPreview(){
    mycard()

}