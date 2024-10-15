// Septimo.kt
package com.cursosant.trabajo_i_unidad.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Tab
//import androidx.compose.material.TabRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Septimo() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Ingresos", "Gastos")

    // Box para organizar el diseño
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp)
        ) {

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

            Spacer(modifier = Modifier.height(1.dp))

            // Tabs para "Ingresos" y "Gastos"
            TabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = { Text(text = title) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Gráfico circular
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Ingresos por cuentas", fontSize = 18.sp, fontWeight = FontWeight.Bold)

                    // Composable para el gráfico circular
                    CircularGraph(
                        modifier = Modifier
                            .size(200.dp)
                            .padding(16.dp),
                        progress = listOf(0.75f, 0.2f, 0.05f)  // Proporciones del gráfico
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Lista de cuentas
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row {
                                Icon(imageVector = Icons.Default.Email,
                                    contentDescription = "Billetera", tint = Color.Green)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = "Billetera")
                            }
                            Text(text = "S/. 700.00", color = Color.Black)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row {
                                Icon(imageVector = Icons.Default.Home,
                                    contentDescription = "Banco", tint = Color.Yellow)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = "Mi banco")
                            }
                            Text(text = "S/. 100.00", color = Color.Black)
                        }
                    }
                }
            }
        }

        // Botón flotante para agregar
        FloatingActionButton(
            onClick = { /* Acción para agregar */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 20.dp, bottom = 100.dp),
            containerColor = Color(0xFF9C27B0),
            contentColor = Color.White
        ) {
            Icon(Icons.Default.Add, contentDescription = "Agregar")
        }

        // Barra de navegación inferior
        NavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(bottom = 0.dp),
            containerColor = Color(0xFF9C27B0)
        ) {
            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para transacciones */ },
                icon = { Icon(imageVector = Icons.Default.List,
                    contentDescription = "Transacciones", tint = Color.White) },
                label = { Text("Transacciones", color = Color.White) }
            )
            NavigationBarItem(
                selected = true,
                onClick = { /* Acción para informe */ },
                icon = { Icon(imageVector = Icons.Default.Info,
                    contentDescription = "Informe") },
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

@Composable
fun CircularGraph(modifier: Modifier = Modifier, progress: List<Float>) {
    Canvas(modifier = modifier) {
        // Colores para cada segmento: solo verde y amarillo
        val colors = listOf(Color.Green, Color.Yellow)

        // Inicio del ángulo
        var startAngle = 0f

        // Dibujar cada segmento
        progress.forEachIndexed { index, proportion ->
            val sweepAngle = proportion * 360
            drawArc(
                color = colors[index % colors.size], // Se asegura de usar solo los colores verde y amarillo
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = true,
                size = Size(size.width, size.height)
            )
            startAngle += sweepAngle
        }

        // Dibujar el texto en el centro
        drawIntoCanvas { canvas ->
            val paint = Paint().asFrameworkPaint().apply {
                isAntiAlias = true
                textAlign = android.graphics.Paint.Align.CENTER
                textSize = 48f
                color = android.graphics.Color.BLACK
            }
            canvas.nativeCanvas.drawText(
                "800.0",
                size.width / 2,
                size.height / 2 - (paint.descent() + paint.ascent()) / 2,
                paint
            )
        }
    }
}

@Preview
@Composable
fun PreviewSeptimo() {
    Septimo()
}



@Composable
fun Octavo() {
    var selectedTabIndex by remember { mutableStateOf(1) }
    val tabs = listOf("Ingresos", "Gastos")

    // Box para organizar el diseño
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 56.dp)
        ) {
            // Encabezado con el nombre y la fecha
            /*
            modifier = Modifier.align(Alignment.BottomCenter),
            containerColor = Color(0xFF9C27B0)
            * */
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

            Spacer(modifier = Modifier.height(1.dp))

            // Tabs para "Ingresos" y "Gastos"
            TabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = { Text(text = title) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Gráfico circular
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Ingresos por cuentas", fontSize = 18.sp, fontWeight = FontWeight.Bold)

                    // Composable para el gráfico circular
                    CircularGraph2(
                        modifier = Modifier
                            .size(200.dp)
                            .padding(16.dp),
                        progress = listOf(0.75f, 0.2f, 0.05f)  // Proporciones del gráfico
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Lista de cuentas
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row {
                                Icon(imageVector = Icons.Default.Email,
                                    contentDescription = "Billetera", tint = Color.Green)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = "Billetera")
                            }
                            Text(text = "S/. 300.00", color = Color.Red)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row {
                                Icon(imageVector = Icons.Default.Home,
                                    contentDescription = "Banco", tint = Color.Yellow)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = "Mi banco")
                            }
                            Text(text = "S/. 50.00", color = Color.Red)
                        }
                    }
                }
            }
        }

        // Botón flotante para agregar
        FloatingActionButton(
            onClick = { /* Acción para agregar */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 20.dp, bottom = 100.dp),
            containerColor = Color(0xFF9C27B0),
            contentColor = Color.White
        ) {
            Icon(Icons.Default.Add, contentDescription = "Agregar")
        }

        // Barra de navegación inferior
        NavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(bottom = 0.dp),
            containerColor = Color(0xFF9C27B0)
        ) {
            NavigationBarItem(
                selected = false,
                onClick = { /* Acción para transacciones */ },
                icon = { Icon(imageVector = Icons.Default.List,
                    contentDescription = "Transacciones", tint = Color.White) },
                label = { Text("Transacciones", color = Color.White) }
            )
            NavigationBarItem(
                selected = true,
                onClick = { /* Acción para informe */ },
                icon = { Icon(imageVector = Icons.Default.Info,
                    contentDescription = "Informe") },
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

@Composable
fun CircularGraph2(modifier: Modifier = Modifier, progress: List<Float>) {
    Canvas(modifier = modifier) {
        // Colores para cada segmento: solo verde y amarillo
        val colors = listOf(Color.Green, Color.Yellow)

        // Inicio del ángulo
        var startAngle = 0f

        // Dibujar cada segmento
        progress.forEachIndexed { index, proportion ->
            val sweepAngle = proportion * 360
            drawArc(
                color = colors[index % colors.size], // Se asegura de usar solo los colores verde y amarillo
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = true,
                size = Size(size.width, size.height)
            )
            startAngle += sweepAngle
        }

        // Dibujar el texto en el centro
        drawIntoCanvas { canvas ->
            val paint = Paint().asFrameworkPaint().apply {
                isAntiAlias = true
                textAlign = android.graphics.Paint.Align.CENTER
                textSize = 48f
                color = android.graphics.Color.BLACK
            }
            canvas.nativeCanvas.drawText(
                "350.0",
                size.width / 2,
                size.height / 2 - (paint.descent() + paint.ascent()) / 2,
                paint
            )
        }
    }
}

@Preview
@Composable
fun PreviewOctavo() {
    Octavo()
}
