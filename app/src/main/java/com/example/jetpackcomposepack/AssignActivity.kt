package com.example.jetpackcomposepack

import android.content.Intent
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme

class AssignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          mycards()
        }
    }
}

@Composable
fun mycards(){
    var mContext = LocalContext.current
    var scrollState = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {


        Card(modifier = Modifier


            .padding(20.dp)) {


            Column(modifier = Modifier
                .padding(30.dp)
                .fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.food1),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(width = 250.dp, height = 250.dp)
                        .clip(shape = CircleShape)
                )

            }
        }
        Spacer(modifier =Modifier.height(20.dp) )

        Card(modifier = Modifier
            .padding(20.dp)) {


            Column(modifier = Modifier
                .padding(30.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.food2),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(width = 250.dp, height = 250.dp)
                        .clip(shape = CircleShape)
                )

            }
        }
        Spacer(modifier =Modifier.height(20.dp) )

        Card(modifier = Modifier
            .padding(20.dp)) {


            Column(modifier = Modifier
                .padding(30.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.food3),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(width = 250.dp, height = 250.dp)
                        .clip(shape = CircleShape)
                )

            }
        }
    }
    Button(onClick = {
        mContext.startActivity(Intent(mContext,CardActivity::class.java))
    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        , shape = RectangleShape
    ) {
        Text(text = "Breeds", color = Color.Cyan)
    }
}


@Preview(showBackground = true)
@Composable
fun mycardsPreview(){
    mycards()
}
