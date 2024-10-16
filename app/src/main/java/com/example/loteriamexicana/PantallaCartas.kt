package com.example.loteriamexicana

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


val cartas = listOf(
    R.drawable.carta1,
    R.drawable.carta2,
    R.drawable.carta3,
    R.drawable.carta4,
    R.drawable.carta5,
    R.drawable.carta6,
    R.drawable.carta7,
    R.drawable.carta8,
    R.drawable.carta9,
    R.drawable.carta10,
    R.drawable.carta11,
    R.drawable.carta12,
    R.drawable.carta13,
    R.drawable.carta14,
    R.drawable.carta15,
    R.drawable.carta16,
    R.drawable.carta17,
    R.drawable.carta18,
    R.drawable.carta19,
    R.drawable.carta20,
    R.drawable.carta21,
    R.drawable.carta22,
    R.drawable.carta23,
    R.drawable.carta24,
    // Agrega más cartas aquí
)

@Composable
fun PantallaCartas(navController: NavController) {
    var cartaActual by remember { mutableStateOf(cartas.random()) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen de la carta actual
        Image(
            painter = painterResource(id = cartaActual),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        // Botón para obtener una nueva carta
        Button(onClick = { cartaActual = cartas.random() }) {
            Text(text = "Nueva Carta")
        }
        Spacer(modifier = Modifier.height(16.dp))
        // Botón para terminar el juego
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Terminar Juego")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantallaCartas() {
    val navController = rememberNavController()
    PantallaCartas(navController)
}
