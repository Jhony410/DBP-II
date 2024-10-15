// Segundo.kt
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Segundo() {
    // Box para poder alinear elementos con align()
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp) // Espacio reservado para la barra de navegación
        ) {
            // Encabezado con el nombre y la fecha
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
                    onClick = { /* Selector de fecha */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Text(text = "Oct. 2024", color = Color.Black)
                    Icon(imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Selector de mes", tint = Color.Black)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Cuadro de resumen del presupuesto
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Presupuesto total",
                                fontSize = 16.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = "S/. 450.00",
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = "Ocultar presupuesto",
                            modifier = Modifier.size(40.dp),
                            tint = Color.Gray
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Ingresos, Gastos y Balance
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Ingresos", tint = Color.Green)
                            Text(text = "Ingresos", color = Color.Green, fontWeight = FontWeight.Bold)
                            Text(text = "S/. 800.00", color = Color.Green)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(imageVector = Icons.Default.Delete, contentDescription = "Gastos", tint = Color.Red)
                            Text(text = "Gastos", color = Color.Red, fontWeight = FontWeight.Bold)
                            Text(text = "S/. 350.00", color = Color.Red)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "Balance", tint = Color.Black)
                            Text(text = "Balance", color = Color.Black, fontWeight = FontWeight.Bold)
                            Text(text = "S/. 450.00", color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { /* Gestionar cuentas */ },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9C27B0))
                    ) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Gestionar cuentas",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Gestionar cuentas", color = Color.White)
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Lista de transacciones por fecha
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "Calendario",
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Oct. 2024", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Expandir", tint = Color.Gray)
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Transacciones realizadas
                for (day in listOf("03 Viernes", "02 Miércoles", "01 Miércoles")) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(text = day, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
                                Spacer(modifier = Modifier.height(4.dp))
                                Row {
                                    Text(text = "S/. 100.00", color = Color.Green)
                                    Spacer(modifier = Modifier.width(16.dp))
                                    Text(text = "S/. 50.00", color = Color.Red)
                                }
                            }
                            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Más opciones", tint = Color.Gray)
                        }
                    }
                }
            }
        }

        // Botón flotante para agregar transacciones
        FloatingActionButton(
            onClick = { /* Acción para agregar transacción */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 20.dp, bottom = 100.dp),
            containerColor = Color(0xFF9C27B0),
            contentColor = Color.White
        ) {
            Icon(Icons.Default.Add, contentDescription = "Agregar transacción")
        }

        // Barra de navegación inferior
        NavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(bottom = 0.dp),// Esto también funciona porque está dentro de un Box
            containerColor = Color(0xFF9C27B0)
        ) {
            NavigationBarItem(
                selected = true,
                onClick = { /* Acción para transacciones */ },
                icon = { Icon(imageVector = Icons.Default.List,
                    contentDescription = "Transacciones", tint = Color.Black) },
                label = { Text("Transacciones", color = Color.White) }
                )

            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para informe */ },
                icon = { Icon(imageVector = Icons.Default.Info,
                    contentDescription = "Informe", tint = Color.White) },
                label = { Text("Informe", color = Color.White) }
                                )

            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para configuración */ },
                icon = { Icon(imageVector = Icons.Default.Settings,
                    contentDescription = "Configuración", tint = Color.White) },
                label = { Text("Configuración", color = Color.White) }
                )

        }
    }
}
