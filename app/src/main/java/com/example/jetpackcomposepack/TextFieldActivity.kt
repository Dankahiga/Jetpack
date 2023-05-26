package com.example.jetpackcomposepack

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepack.ui.theme.JetpackComposePackTheme
import androidx.compose.material3.Text as Text

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           form()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form() {
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Cyan)) {
        Text(
            text = "PERSONAL DETAILS",
            fontSize = 40.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )

        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = "Firstname") },
            placeholder = { Text(text = "Enter Firstname") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Iconz"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Iconz"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

//Middlename
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname,
            onValueChange = { mname = it },
            label = { Text(text = "Middlename") },
            placeholder = { Text(text = "Enter Middlename") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "Iconz") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Iconz"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
//Surname
        var sname by remember { mutableStateOf("") }
        TextField(
            value = sname,
            onValueChange = { sname = it },
            label = { Text(text = "Surname") },
            placeholder = { Text(text = "Enter Surname") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Iconz"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Iconz"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
//Email
        var myemail by remember { mutableStateOf("") }
        TextField(
            value = myemail,
            onValueChange = { myemail = it },
            label = { Text(text = "Email") },
            placeholder = { Text(text = "Enter your Email") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Iconz") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
//Password
        var pass by remember { mutableStateOf("") }
        TextField(
            value = pass,
            onValueChange = { pass = it },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Enter your Password") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Iconz") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Iconz"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
//PhoneNumber
        var phone by remember { mutableStateOf("") }
        TextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text(text = "Contact") },
            placeholder = { Text(text = "Enter PhoneNumber") },
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "Iconz") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Iconz"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}