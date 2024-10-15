package com.cursosant.trabajo_i_unidad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cursosant.trabajo_i_unidad.screens.Cuarto
import com.cursosant.trabajo_i_unidad.screens.Noveno
import com.cursosant.trabajo_i_unidad.screens.Octavo
import com.cursosant.trabajo_i_unidad.screens.PreviewOctavo
import com.cursosant.trabajo_i_unidad.screens.PreviewSeptimo
import com.cursosant.trabajo_i_unidad.screens.Primero
import com.cursosant.trabajo_i_unidad.screens.Quinto
import com.cursosant.trabajo_i_unidad.screens.Segundo
import com.cursosant.trabajo_i_unidad.screens.Septimo
import com.cursosant.trabajo_i_unidad.screens.Sexto
import com.cursosant.trabajo_i_unidad.screens.Tercero
import com.cursosant.trabajo_i_unidad.ui.theme.Trabajo_I_UnidadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Trabajo_I_UnidadTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        // Aqui van las pantallas para la visualizacion
                        Primero()
                        Segundo()
                        Tercero()
                        Cuarto()
                        Quinto()
                        Sexto()
                        Septimo()
                        Octavo()
                        Noveno()
                    }
                }
            }
        }
    }
}

