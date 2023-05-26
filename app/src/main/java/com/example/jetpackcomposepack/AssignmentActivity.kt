package com.example.jetpackcomposepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
images()
        }
    }
}

@Composable
fun images() {
    Column(modifier=Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "Pizza")
        Text(text = "Homemade veg pizza", color = Color.Black, fontWeight = FontWeight.ExtraBold)
        Text(text = "Italian food: delicious homemade pizza with mozzarella and cherry tomatoes shot from above on rustic wooden table. Some ingredients for preparing pizza like mozzarella cheese, basil, fresh tomatoes, olive oil, salt and pepper are all around the pizza.")

    }
}


@Preview(showBackground = true)
@Composable
fun imagesPreview(){
    images()
}
