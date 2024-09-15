package com.cursosant.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cursosant.lab4.ui.theme.Lab4Theme
import androidx.compose.ui.text.font.FontWeight


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComplexLayout()
                }
            }
        }
    }
}

@Composable
fun MyComplexLayout() {
    Column(
        Modifier
            .fillMaxSize()
            .border(4.dp, Color.Black) // Borde negro
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center // Centramos el contenido
        ) {
            Text(
                text = "TRISTEZA",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold, // Letra más gruesa
                color = Color.Black, // Color de la letra negro
                textAlign = TextAlign.Center
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center // Centramos el contenido
            ) {
                Text(
                    text = "ALEGRIA",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold, // Letra más gruesa
                    color = Color.Black, // Color de la letra negro
                    textAlign = TextAlign.Center
                )
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center // Centramos el contenido
            ) {
                Text(
                    text = "DESAGRADO",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold, // Letra más gruesa
                    color = Color.Black, // Color de la letra negro
                    textAlign = TextAlign.Center
                )
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red),
            contentAlignment = Alignment.Center // Centramos el contenido
        ) {
            Text(
                text = "IRA",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold, // Letra más gruesa
                color = Color.Black, // Color de la letra negro
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab4Theme {
        MyComplexLayout()
    }
}
