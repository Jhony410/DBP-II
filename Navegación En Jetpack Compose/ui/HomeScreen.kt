package com.cursosant.retos.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button

import androidx.compose.ui.unit.dp

/* Primer reto
@Composable
fun HomeScreen(onNavigateToDetails: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenidos al Home")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateToDetails) {
            Text(text = "Navegar a los detalles")
        }
    }
}


// Segundo reto
@Composable
fun HomeScreen(name: String, onNavigateToDetails: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenid@ al Home")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = name)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateToDetails) {
            Text(text = "Navegar a los detalles")
        }
    }
}*/

// Tercer reto
@Composable
fun HomeScreen(
    name: String,
    onNavigateToDetails: () -> Unit,
    onNavigateBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenid@ a Home")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = name)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateToDetails) {
            Text(text = "Navegar a los detalles")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onNavigateBack) {
            Text(text = "Retroceder")
        }
    }
}