// Noveno.kt
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.min

@Preview
@Composable
fun Noveno() {
    // Box principal para organizar el layout
    Box(
        modifier = Modifier
            .fillMaxSize()  // Asegura que ocupe toda la pantalla
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp),  // Deja espacio para la barra inferior
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Encabezado con el logo y el título
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF9C27B0))
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "MyBudget",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Tarjeta con las opciones de configuración
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
                    // Opción: Iniciar sesión
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "Iniciar sesión", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Iniciar sesión", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }

                    // Opción: Lenguaje
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = "Lenguaje", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Lenguaje", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }

                    // Opción: Modo oscuro
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "Modo oscuro", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Modo oscuro", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }

                    // Opción: Más información
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "Más información", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Más información", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }

                    // Opción: Notificaciones
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notificaciones", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Notificaciones", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }

                    // Opción: Políticas de privacidad
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Build, contentDescription = "Políticas de privacidad", tint = Color(0xFF9C27B0))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Políticas de privacidad", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        // Barra de navegación inferior
        NavigationBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(0.5.dp),  // Tamaño estándar para la barra de navegación
            containerColor = Color(0xFF9C27B0),
            tonalElevation = 0.1.dp
        ) {
            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para transacciones */ },
                icon = { Icon(imageVector = Icons.Default.List, contentDescription = "Transacciones", tint = Color.White) },
                label = { Text("Transacciones", color = Color.White) }
            )
            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para informe */ },
                icon = { Icon(imageVector = Icons.Default.Info, contentDescription = "Informe", tint = Color.White) },
                label = { Text("Informe", color = Color.White) }
            )
            NavigationBarItem(
                selected = true, // Seleccionado
                onClick = { /* Acción para configuración */ },
                icon = { Icon(imageVector = Icons.Default.Settings, contentDescription = "Configuración", tint = Color.White) },
                label = { Text("Configuración", color = Color.White) }
            )
        }
    }
}

