package com.cursosant.retos.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/* Primer reto
@Composable
fun LoginScreen(onNavigateToHome: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de inicio de sesión")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateToHome) {
            Text(text = "Navegar a Home")
        }
    }
}*/


// Segundo y tercer reto
@Composable
fun LoginScreen(onNavigateToHome: (String) -> Unit) {
    val name = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de inicio de sesión")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Ingresa tu nombre") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onNavigateToHome(name.value) }) {
            Text(text = "Navegar a Home")
        }
    }
}


