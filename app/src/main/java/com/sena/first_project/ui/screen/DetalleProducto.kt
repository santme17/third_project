package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DetalleProducto(
    id: Int,
    onVolverProducto: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hola desde Detalle del producto, este es el id del producto: $id")
        Button(onClick = onVolverProducto) {
            Text(text = "Volver a Producto")
        }
    }
}
