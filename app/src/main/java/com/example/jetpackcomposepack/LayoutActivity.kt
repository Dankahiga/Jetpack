package com.example.jetpackcomposepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}

@Composable
fun myText(){
   Column(modifier = Modifier.fillMaxSize()) {
       Text(text = "Hello There" ,fontSize= 40.sp, fontStyle = FontStyle.Italic, color = Color.Magenta)
       Text(text = "Android",fontSize= 40.sp, fontStyle = FontStyle.Italic, color = Color.Magenta)

   Row(modifier = Modifier.fillMaxWidth().background(color = Color.LightGray),
       horizontalArrangement = Arrangement.SpaceBetween) {
       Text(text = "Yes", fontSize = 40.sp, fontStyle = FontStyle.Italic)
       Text(text = "No", fontSize = 40.sp, fontStyle = FontStyle.Italic)
   }
   }

}



@Preview(showBackground = true)
@Composable
fun mytextPreview(){
    myText()
}
