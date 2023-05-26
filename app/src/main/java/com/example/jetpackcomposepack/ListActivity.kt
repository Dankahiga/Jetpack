package com.example.jetpackcomposepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           items()
        }
    }
}

@Composable
fun items(){

    var scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
        , horizontalAlignment = Alignment.CenterHorizontally) {
        for (numbers in 1..5000){
            Text(text = "List number is $numbers", fontSize = 30.sp
                , fontWeight = FontWeight.Bold
                , modifier = Modifier
                    .padding(vertical = 30.dp)
                    .background(color = Color.Gray)
                    .fillMaxWidth())
        }
    }
}


@Preview(showBackground = true)
@Composable
fun itemsPreview(){
    items()
}