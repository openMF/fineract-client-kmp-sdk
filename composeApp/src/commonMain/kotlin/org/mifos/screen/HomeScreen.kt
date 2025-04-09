package org.mifos.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Mifos Android Architecture",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(Color(0xff6200ed))
            )
        },
        containerColor = Color.White
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize()
                .padding(top = 125.dp)
        ) {
            LazyColumn() {
                for (i in 1..10) {
                    item() {
                        ColumnDesign()
                    }
                }
            }
        }

    }
}


@Preview
@Composable
fun ColumnDesign() {
    Card(
        modifier = Modifier.fillMaxWidth(9.8f)
            .padding(3.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(Color.White)

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top,

            ) {
            Column(
                modifier = Modifier.fillMaxWidth(.7f)
                    .padding(10.dp),
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp),
                    text = "Authentication API",
                    fontWeight = FontWeight(700),
                    fontSize = 22.sp
                )

                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp),
                    text = "Authentication user who is not connected to any service",
                    color = Color(0xFFbdbfbe),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(400),
                )
            }
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                Button(
                    modifier = Modifier.padding(end = 10.dp, top = 10.dp)
                        .size(width = 78.dp, height = 35.dp),

                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFFd5d7d6)),
                    shape = RectangleShape,
                    contentPadding = PaddingValues(start = 5.dp, end = 5.dp)
                ) {
                    Text(
                        text = "TEST API",
                        fontWeight = FontWeight(700),
                        color = Color.Black,
                        fontSize = 15.sp
                    )
                }
            }


        }
    }
}