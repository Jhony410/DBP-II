package com.cursosant.retos.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button

/* Primer reto
@Composable
fun DetailsScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de detalles")
    }
}


// Segundo reto
@Composable
fun DetailsScreen(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de detalles")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Todo sobre $name")
    }
}
*/

// Tercer reto
@Composable
fun DetailsScreen(name: String, onNavigateBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de detalles")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Todo sobre $name")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateBack) {
            Text(text = "Retroceder")
        }
    }
}








