// #1 ................................................................................................ mas abajo el segundo
package com.cursosant.lab4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun ConstraintExample1(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()){

        // Crear referencias para las cajas
        val (cajaGreen, cajaRed, cajaBlue, cajaWhite, cajaMagenta) = createRefs()


        // Caja Azul (arriba a la izquierda)
        Box(modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(cajaBlue) {
            end.linkTo(cajaRed.start)
            bottom.linkTo(cajaRed.top)
        })

        // Caja Magenta (arriba a la derecha)
        Box(modifier = Modifier.size(100.dp).background(Color.Magenta).constrainAs(cajaMagenta) {
            start.linkTo(cajaRed.end)
            bottom.linkTo(cajaRed.top)
        })

        // Caja Roja (en el centro)
        Box(modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(cajaRed) {
            centerVerticallyTo(parent)
            centerHorizontallyTo(parent)
        })

        // Caja Verde (abajo a la derecha)
        Box(modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(cajaGreen) {
            top.linkTo(cajaRed.bottom)
            start.linkTo(cajaRed.end)
        })

        // Caja Blanca (abajo a la izquierda)
        Box(modifier = Modifier.size(100.dp).background(Color.White).constrainAs(cajaWhite) {
            top.linkTo(cajaRed.bottom)
            end.linkTo(cajaRed.start)
        })
        
    }
}

// #2 ................................................................................................ mas abajo el tercero
package com.cursosant.lab4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun ConstraintExample1(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()){

        // Crear referencias para las cajas
        val (cajaGreen, cajaRed, cajaBlue, cajaWhite, cajaMagenta, cajaYellow, cajaBlack) = createRefs()

        Box(modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(cajaYellow){
            end.linkTo(cajaMagenta.start)
            bottom.linkTo(cajaMagenta.top)
        })


        // Caja Azul (arriba a la izquierda)
        Box(modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(cajaBlue) {
            end.linkTo(cajaRed.start)
            bottom.linkTo(cajaRed.top)
        })

        // Caja Magenta (arriba a la derecha)
        Box(modifier = Modifier.size(100.dp).background(Color.Magenta).constrainAs(cajaMagenta) {
            start.linkTo(cajaRed.end)
            bottom.linkTo(cajaRed.top)
        })

        // Caja Roja (en el centro)
        Box(modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(cajaRed) {
            centerVerticallyTo(parent)
            centerHorizontallyTo(parent)
        })

        // Caja Verde (abajo a la derecha)
        Box(modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(cajaGreen) {
            top.linkTo(cajaRed.bottom)
            start.linkTo(cajaRed.end)
        })

        // Caja Blanca (abajo a la izquierda)
        Box(modifier = Modifier.size(100.dp).background(Color.White).constrainAs(cajaWhite) {
            top.linkTo(cajaRed.bottom)
            end.linkTo(cajaRed.start)
        })
        Box(modifier = Modifier.size(100.dp).background(Color.Black).constrainAs(cajaBlack){
            top.linkTo(cajaRed.bottom)
            centerHorizontallyTo(parent)
            top.linkTo(cajaGreen.bottom)
        })
    }
}

// #3 ................................................................................................
package com.example.la4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun ConstraintExample() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxGreen, boxMagenta, boxYellow, boxRed, boxWhite, boxWhite2, boxWhite3, boxWhite4) = createRefs()

        Box(
            modifier = Modifier
                .size(131.dp)
                .background(color = Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(131.dp)
                .background(color = Color.Magenta)
                .constrainAs(boxMagenta) {
                    top.linkTo(boxRed.bottom)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(131.dp)
                .background(color = Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .size(131.dp)
                .background(color = Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxMagenta.end)
                }
        )

        Box(
            modifier = Modifier
                .size(131.dp)
                .background(color = Color.Blue)
                .constrainAs(boxWhite) {
                    top.linkTo(boxRed.bottom)
                    end.linkTo(parent.end)

                }
        )

        Box(
            modifier = Modifier
                .size(44.dp)
                .background(color = Color.White)
                .constrainAs(boxWhite2) {
                    bottom.linkTo(boxRed.top)
                    start.linkTo(boxGreen.end)

                }
        )
        Box(
            modifier = Modifier
                .size(44.dp)
                .background(color = Color.Cyan)
                .constrainAs(boxWhite3) {
                    bottom.linkTo(boxWhite2.top)
                    start.linkTo(boxWhite2.end)

                }
        )

        Box(
            modifier = Modifier
                .size(43.dp)
                .background(color = Color.DarkGray)
                .constrainAs(boxWhite4) {
                    bottom.linkTo(boxWhite3.top)
                    start.linkTo(boxWhite3.end)

                }
        )

    }
}
