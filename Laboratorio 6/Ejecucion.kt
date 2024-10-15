package com.cursosant.practica6

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ButtomExample(){
    Button(onClick = {/*Accion del boton*/}) {
        Text("Haga click por favor")
    }
}

@Preview
@Composable
fun TextButtonExample() {
    TextButton(onClick = {
        // Acción del botón
    }) {
        Text("Botón solo de texto")
    }
}

@Preview
@Composable
fun ImageExample(){
    Image(
        painter = painterResource(id = R.drawable.image_example),
        //Reemplazar por tu imagen
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
            .aspectRatio(1f),
        contentScale = ContentScale.Fit
    )
}

@Preview
@Composable
fun ImageExampleCircular() {
    Image(
        painter = painterResource(id = R.drawable.image_example),
        contentDescription = null,
        modifier = Modifier
            .size(350.dp)  // Tamaño de la imagen
            .clip(CircleShape)  // Recorta la imagen en un círcular
            .border(2.dp, Color.Gray, CircleShape),  // Opción de agregar un borde alrededor
        contentScale = ContentScale.Crop  // Recorta la imagen para ajustarse al tamaño sin distorsionarla
    )
}

@Preview
@Composable
fun IconsExample(){
    Row {
        Icon(imageVector = Icons.Default.Favorite,
            contentDescription = "Icono favorito",
            tint = Color.Red)
        Icon(imageVector = Icons.Default.Home,
            contentDescription = "Icono de una Casa",
            tint = Color.Blue)
        Icon(imageVector = Icons.Default.Settings,
            contentDescription = "Icono de Configuracion",
            tint = Color.Gray)
    }
}

@Preview
@Composable
fun ProgressBarExample() {
    CircularProgressIndicator(
        progress = 0.7f,
        modifier = Modifier.size(80.dp),
        strokeWidth = 8.dp,
        color = Color.Red
    )
}

@Preview
@Composable
fun SwitchExample() {
    var isChecked by remember { mutableStateOf(false) }
    Switch(checked = isChecked, onCheckedChange = { isChecked = it })
}

@Preview
@Composable
fun CheckBoxExample() {
    var isChecked by remember { mutableStateOf(false) }
    Checkbox(checked = isChecked, onCheckedChange = { isChecked = it })
}

@Preview
@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }
    RadioButton(selected = selected, onClick = { selected = !selected })
}

@Preview
@Composable
fun CardExample() {
    Card(
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Text(text = "Este es una Tarjeta",
            modifier = Modifier.padding(16.dp))
    }
}

@Preview
@Composable
fun SurfaceExample() {
    Surface(
        modifier = Modifier.padding(16.dp),
        color = Color.LightGray
    ) {
        Text(text = "Este es una Superficie",
            modifier = Modifier.padding(16.dp))
    }
}

@Preview
@Composable
fun BadgeBoxExample() {
    BadgedBox(badge = { Badge { Text("3") } }) {
        Icon(imageVector = Icons.Default.Email,
            contentDescription = "Email con Badge")
    }
}

@Preview
@Composable
fun DividerExample() {
    Divider(color = Color.Gray, thickness = 10.dp)
}

@Preview
@Composable
fun DropdownMenuExample() {
    var expanded by remember { mutableStateOf(false) }

    Box {
        TextButton(onClick = { expanded = true }) {
            Text("Abrir menú")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Opción 1") },
                onClick = {
                    // Acción para Opción 1
                    expanded = false
                }
            )
            DropdownMenuItem(
                text = { Text("Opción 2") },
                onClick = {
                    // Acción para Opción 2
                    expanded = false
                }
            )
        }
    }
}

@Preview
@Composable
fun SliderExample() {
    var sliderValue by remember { mutableStateOf(0.5f) }
    Slider(value = sliderValue,
        onValueChange = { sliderValue = it })
}

@Preview
@Composable
fun SectionSliderExample() {
    var sectionValue by remember { mutableStateOf(0) }
    Slider(value = sectionValue.toFloat(),
        onValueChange = { sectionValue = it.toInt() },
        valueRange = 0f..5f, steps = 4)
}

@Preview
@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Aceptar")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Cancelar")
                }
            },
            title = { Text("Título del diálogo") },
            text = { Text("Este es el contenido del diálogo.") }
        )
    }

    Button(onClick = { showDialog = true }) {
        Text("Mostrar diálogo")
    }
}
