package com.sj.bmicalculator.presentation.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Weight(
    weight : String,
    addImg :Int,
    minusImg :Int,
    decWeight: () -> Unit,
    incWeight: () ->Unit
) {
    val color =MaterialTheme.colors.secondary
    Column(modifier = Modifier
        .width(175.dp)
//        .border(border = BorderStroke(width = 1.dp , color = Color.Red))
        .padding(top = 8.dp  , bottom = 8.dp , start = 4.dp , end =4.dp)
        .background(color = MaterialTheme.colors.onSurface)
    ) {
        Text(text = "Weight",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(text = "${if (weight.toInt() == -1) "" else weight} Kg",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )
        Row (horizontalArrangement = Arrangement.SpaceBetween){

            Option(image = addImg, onClick = incWeight)
            Option(image = minusImg, onClick = decWeight)

        }

    }

}