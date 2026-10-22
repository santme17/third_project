package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(
    onirProducto: () -> Unit,
    onirCarrito: () -> Unit,
    onirPerfil: () -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hola desde la Home")
        Button(onClick = onirProducto) {
            Text(text = "Ir a productos")
        }
        Button(onClick = onirCarrito) {
            Text(text = "Ir al carrito")
        }
        Button(onClick = onirPerfil) {
            Text(text = "Ir al perfil")
        }
    }
}