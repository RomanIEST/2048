package com.example.a2048

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PerfilMultiservicios() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1c1e21)) // Fondo oscuro tipo FB
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. Banner Superior y Espacio para Foto de Perfil
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            // Fondo del Banner (Sustituye a la imagen)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.DarkGray) // Representación del banner
            )

            // Espacio de la Foto de Perfil (Círculo superpuesto)
            Surface(
                modifier = Modifier
                    .size(140.dp)
                    .border(4.dp, Color(0xFF1c1e21), CircleShape),
                shape = CircleShape,
                color = Color.LightGray // Representación del logo
            ) {
                // Aquí iría el logo después
                // Ejemplo: Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")
            }
        }

        // 2. Textos Principales
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Multiservicios Castan: Soluciones para tu hogar en Tampico",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 20.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "128 seguidores • 1 seguidos",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // 3. Botones de Acción (Row)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0866ff))
            ) {
                Text("Mensaje", color = Color.White)
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3a3b3c))
            ) {
                Text("Seguir", color = Color.White)
            }

            Button(
                onClick = { /* Acción */ },
                modifier = Modifier.weight(0.5f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3a3b3c))
            ) {
                Icon(
                    Icons.Filled.Search,
                    contentDescription = "Buscar",
                    tint = Color.White
                )
            }
        }

        // 4. Descripción
        Text(
            text = "En Multiservicios Castan ofrecemos todo tipo de servicios para el mantenimiento y reparación del hogar en Tampico, Tamaulipas.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}