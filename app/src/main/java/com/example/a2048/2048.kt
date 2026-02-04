package com.example.a2048

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Tablero2048() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF8EF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .background(Color(0xFFBBADA0))
                .padding(8.dp)
        ) {

            // FILA 1
            Row {
                Celda2048("2", Color(0xFFEEE4DA))
                Celda2048("32", Color(0xFFF59563), Color.White)
                Celda2048("2", Color(0xFFEEE4DA))
                Celda2048("4", Color(0xFFEDE0C8))
            }

            // FILA 2
            Row {
                Celda2048("4", Color(0xFFEDE0C8))
                Celda2048("64", Color(0xFFF65E3B), Color.White)
                Celda2048("4", Color(0xFFEDE0C8))
                Celda2048("128", Color(0xFFEDCF72), Color.White)
            }

            // FILA 3
            Row {
                Celda2048("8", Color(0xFFF2B179))
                Celda2048("256", Color(0xFFEDCC61), Color.White)
                Celda2048("512", Color(0xFFEDC850), Color.White)
                Celda2048("8", Color(0xFFF2B179))
            }

            // FILA 4
            Row {
                Celda2048("4", Color(0xFFEDE0C8))
                Celda2048("8", Color(0xFFF2B179))
                Celda2048("2", Color(0xFFEEE4DA))
                Celda2048("4", Color(0xFFEDE0C8))
            }
        }
    }
}

@Composable
fun Celda2048(
    texto: String,
    colorFondo: Color,
    colorTexto: Color = Color.Black
) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .padding(4.dp)
            .background(colorFondo),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = texto,
            fontWeight = FontWeight.Bold,
            color = colorTexto
        )
    }
}
