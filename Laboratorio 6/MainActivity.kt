package com.cursosant.practica6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cursosant.practica6.ui.theme.Practica6Theme
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        //ButtomExample() // Ejemplo del botón
                        //TextButtonExample() //Ejemplo de boton con texto
                        //ImageExample() //Ejemplo de imagen
                        //ImageExampleCircular() //Ejemplo de imagen circular
                        //IconsExample() //Ejemplo de icono
                        //ProgressBarExample() //Ejemplo de barra de progreso
                        //SwitchExample() //Ejemplo de cambiar
                        //CheckBoxExample() //Ejemplo de casilla de verificacion
                        //RadioButtonExample() //Ejemplo de boton de radio
                        //CardExample() //Ejemplo de tarjeta
                        //SurfaceExample() //Ejemplo de superficie
                        //BadgeBoxExample() //Ejemplo de caja de insignia
                        //DividerExample() //Ejemplo de divisor
                        //DropdownMenuExample() //Ejemplo de menu desplegable
                        //SliderExample() //Ejemplo de control deslizante
                        //SectionSliderExample() //Ejemplo de control deslizante de seccion
                        //AlertDialogExample() //Ejemplo de Dialogo de alerta
                    }
                }
            }
        }
    }
}
