// Quinto.kt
package com.cursosant.trabajo_i_unidad.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Quinto() {
    // Box para organizar los elementos verticalmente
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Encabezado "Ingreso"
            Text(
                text = "Ingreso",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green,
                modifier = Modifier.padding(vertical = 16.dp),
                textAlign = TextAlign.Center
            )

            // Tarjeta de formulario
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Campo de Monto
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Monto", tint = Color.Green)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Monto", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Cuenta
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Cuenta", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Cuenta", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Detalles
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Detalles", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Detalles", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Fecha
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.DateRange, contentDescription = "Fecha", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "04/10/2024", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botones de acción
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Botón Cancelar
                TextButton(onClick = { /* Acción cancelar */ }) {
                    Text(text = "Cancelar", color = Color(0xFF9C27B0), fontSize = 14.5.sp)
                }

                // Botón Guardar
                Button(
                    onClick = { /* Acción guardar */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9C27B0)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .height(48.dp)
                        .width(100.dp)
                ) {
                    Text(text = "Guardar", color = Color.White, fontSize = 14.5.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun Sexto() {
    // Box para organizar los elementos verticalmente
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Encabezado "Ingreso"
            Text(
                text = "Gasto",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                modifier = Modifier.padding(vertical = 16.dp),
                textAlign = TextAlign.Center
            )

            // Tarjeta de formulario
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Campo de Monto
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Delete, contentDescription = "Monto",
                            tint = Color.Red)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Monto", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Cuenta
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Cuenta", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Cuenta", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Detalles
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Detalles", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Detalles", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider()

                    // Campo de Fecha
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.DateRange, contentDescription = "Fecha", tint = Color.Black)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "04/10/2024", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botones de acción
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Botón Cancelar
                TextButton(onClick = { /* Acción cancelar */ }) {
                    Text(text = "Cancelar", color = Color(0xFF9C27B0), fontSize = 14.5.sp)
                }

                // Botón Guardar
                Button(
                    onClick = { /* Acción guardar */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9C27B0)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .height(48.dp)
                        .width(100.dp)
                ) {
                    Text(text = "Guardar", color = Color.White, fontSize = 14.5.sp)
                }
            }
        }
    }
}