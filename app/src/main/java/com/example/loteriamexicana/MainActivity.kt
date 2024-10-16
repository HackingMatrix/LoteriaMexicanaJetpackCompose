package com.example.loteriamexicana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loteriamexicana.ui.theme.LoteriaMexicanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoteriaMexicanaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppLoteria()
                }
            }
        }
    }
}

@Composable
fun AppLoteria() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "pantalla_inicio") {
        composable("pantalla_inicio") { PantallaInicio(navController) }
        composable("pantalla_cartas") { PantallaCartas(navController) }
    }
}
