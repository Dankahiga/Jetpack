package com.example.jetpackcomposepack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

            }
        }
    }


@Composable
fun text(){
    var mContext = LocalContext.current
   Column(modifier = Modifier.fillMaxSize()
           , horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Text(text = "Welcome to Android",
           color = Color.Blue,
           fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
           fontWeight = FontWeight.Bold,
           fontFamily = FontFamily.SansSerif,
           textDecoration = TextDecoration.Underline,

       )
       Button(onClick = {
           mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
       },
       colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
           , shape = RectangleShape) {
           Text(text = "Layout")
       }

       Spacer(modifier =Modifier.height(20.dp) )

       Button(onClick = {
           mContext.startActivity(Intent(mContext,ImageActivity::class.java))
       },
           colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
           , shape = RectangleShape) {
           Text(text = "Images")
       }

       Spacer(modifier =Modifier.height(20.dp) )

       Button(onClick = {
           mContext.startActivity(Intent(mContext,AssignmentActivity::class.java))
       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
           , shape = RectangleShape) {
           Text(text = "Pizza")
       }

       Spacer(modifier =Modifier.height(20.dp) )

       Button(onClick = {
           mContext.startActivity(Intent(mContext,TextFieldActivity::class.java))
       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
           , shape = RectangleShape) {
           Text(text = "Details Form")
       }

       Spacer(modifier =Modifier.height(20.dp) )

       Button(onClick = {
           mContext.startActivity(Intent(mContext,ListActivity::class.java))
       }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
           , shape = RectangleShape) {
           Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Icon")
           Text(text = "List number", color = Color.Cyan)
       }

       Spacer(modifier =Modifier.height(20.dp) )
   }
    Button(onClick = {
        mContext.startActivity(Intent(mContext,CardActivity::class.java))
    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        , shape = RectangleShape) {
        Text(text = "Breeds", color = Color.Cyan)
    }

    Spacer(modifier =Modifier.height(20.dp) )

    Button(onClick = {
        mContext.startActivity(Intent(mContext,AssignActivity::class.java))
    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        , shape = RectangleShape) {
        Text(text = "Food", color = Color.Cyan)
    }

    Spacer(modifier =Modifier.height(20.dp) )

    Button(onClick = {
        mContext.startActivity(Intent(mContext,assignActivity2::class.java))
    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        , shape = RectangleShape) {
        Text(text = "Food", color = Color.Cyan)
    }

}

@Preview(showBackground = true)
@Composable
fun textPreview(){
    text()
}
