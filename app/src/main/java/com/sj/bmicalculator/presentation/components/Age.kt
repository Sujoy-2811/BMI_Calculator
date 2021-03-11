package com.sj.bmicalculator.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Age(
    age : String,
    addImg :Int,
    minusImg :Int,
    decAge: () -> Unit,
    incAge: () ->Unit
) {
    val color = MaterialTheme.colors.secondary
    Column(modifier = Modifier
        .width(175.dp)
//        .border(border = BorderStroke(width = 1.dp , color = Color.Red))
        .padding(top = 8.dp  , bottom = 8.dp , start = 4.dp , end =4.dp)
        .background(color = MaterialTheme.colors.onSurface)
    ) {
        Text(text = "AGE",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(text = "${if (age.toInt() == -1) "" else age} Yrs",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )
        Row (horizontalArrangement = Arrangement.SpaceBetween){

            Option(image = addImg, onClick = incAge)
            Option(image = minusImg, onClick = decAge)

        }

    }
}