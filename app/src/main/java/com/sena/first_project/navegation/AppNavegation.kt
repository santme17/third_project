package com.sena.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.first_project.ui.screen.DetalleProducto
import com.sena.first_project.ui.screen.Home
import com.sena.first_project.ui.screen.Producto
import com.sena.first_project.ui.screen.Carrito
import com.sena.first_project.ui.screen.Perfil

@Composable
fun AppNavegation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ) {
        composable<Inicio> {
            Home(
                onirProducto = { navController.navigate(Productos) },
                onirCarrito = { navController.navigate(Carrito) },
                onirPerfil = { navController.navigate(Perfil) }
            )
        }
        composable<Productos> {
            Producto(
                onirDetalleProducto = { id -> navController.navigate(DetalleProducto(id)) },
                onVolverHome = { navController.popBackStack() }
            )
        }
        composable<DetalleProducto> { backStackEntry ->
            val args = backStackEntry.toRoute<DetalleProducto>()
            DetalleProducto(
                id = args.id,
                onVolverProducto = { navController.popBackStack() }
            )
        }
        composable<Carrito> {
            Carrito(onVolverHome = { navController.popBackStack() })
        }
        composable<Perfil> {
            Perfil(onVolverHome = { navController.popBackStack() })
        }
    }
}