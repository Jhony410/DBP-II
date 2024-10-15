// Primero.kt
package com.cursosant.trabajo_i_unidad.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cursosant.trabajo_i_unidad.R

@Preview
@Composable
fun Primero() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Fondo morado difuminado detrás del logo
        Box(
            modifier = Modifier
                .size(350.dp) // Tamaño del fondo
                .clip(CircleShape)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFFB93CC9), Color.Transparent)
                    )
                )
                .padding(24.dp)
        ) {
            // Imagen del logo (reemplazar con tu propio recurso en 'res/drawable')
            Image(
                painter = painterResource(id = R.drawable.primero), // Reemplazar con tu logo
                contentDescription = "Logo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.height(150.dp)) // Espacio entre logo y texto

        // Texto debajo del logo con tipografía personalizada
        Text(
            text = "MyBudget",
            color = Color(0xFF6A0DAD), // Color morado
            fontSize = 50.sp,
            fontWeight = FontWeight.W800,
            fontFamily = FontFamily.Cursive, // Tipografía diferente
            textAlign = TextAlign.Center,

        )
    }
}
