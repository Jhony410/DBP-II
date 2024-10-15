// Cuarto.kt
package com.cursosant.trabajo_i_unidad.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Cuarto() {
    // Box contenedor para organizar la pantalla
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp)
        ) {
            // Encabezado con el logo y la fecha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF9C27B0))
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "MyBudget",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Button(
                    onClick = { /* Selector de mes */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Text(text = "Oct. 2024", color = Color.Black)
                    Icon(imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Selector de mes", tint = Color.Black)
                }
            }

            // Agregar un Spacer para empujar los botones más hacia abajo
            Spacer(modifier = Modifier.weight(1f))

            // Botones de acción (Ingreso y Gasto)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End // Alineado a la derecha
            ) {
                // Botón de Ingreso
                Button(
                    onClick = { /* Acción para ingreso */ },
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEEEEEE)),
                    shape = RoundedCornerShape(50)
                ) {
                    Text(text = "Ingreso", color = Color.Black)
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Ingreso",
                        tint = Color.Green
                    )
                }

                // Botón de Gasto
                Button(
                    onClick = { /* Acción para gasto */ },
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEEEEEE)),
                    shape = RoundedCornerShape(50)
                ) {
                    Text(text = "Gasto", color = Color.Black)
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Gasto",
                        tint = Color.Red
                    )
                }
            }

            Spacer(modifier = Modifier.weight(0.3f)) // Espacio adicional si es necesario
        }

        // Botón flotante para cerrar (X)
        FloatingActionButton(
            onClick = { /* Acción para cerrar */ },
            modifier = Modifier
                .align(Alignment.BottomEnd) // Alineado en la parte inferior derecha
                .padding(end = 20.dp, bottom = 100.dp),
            containerColor = Color(0xFF9C27B0),
            contentColor = Color.White
        ) {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Cerrar")
        }
    }
}

