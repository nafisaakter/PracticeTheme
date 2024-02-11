package com.example.practicetheme

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicetheme.ui.theme.PracticeThemeTheme

@RequiresApi(Build.VERSION_CODES.O)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PracticeTheme()
                }
            }
        }
    }
}

@Composable
fun PracticeTheme() {
    val appModifier = Modifier

        .fillMaxWidth()
    val purpleColor = Color(0xFF6200EE)
    val orngColor = Color(0XFFF7921E)
    val titleFontWeight = FontWeight.Bold
    Column(
        modifier = appModifier
            .padding(8.dp)


    ) {
        Text(
            text = "My title",
//            color = MaterialTheme.colorScheme.primary,
            fontSize = 30.sp,

            textAlign = TextAlign.Left,
            fontWeight = titleFontWeight,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom =24.dp,top =24.dp),

        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom =24.dp))



        Button(
            onClick = { /* Handle login */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = orngColor,
                contentColor = Color.White
            ), // Apply custom button colors
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            shape = RoundedCornerShape(0.dp)
        ) {
            Text(text = "Submit")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeThemeTheme {
        PracticeTheme()
    }
}