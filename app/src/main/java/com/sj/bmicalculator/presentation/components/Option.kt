package com.sj.bmicalculator.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Option(
    image : Int,
    onClick :() -> Unit
) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier
            .padding(6.dp)
            .size(56.dp)
            .clip(CircleShape)
            .clickable { onClick()},
            backgroundColor = Color.Red,
            shape = CutCornerShape(16.dp) ,


            ) {
        }
        Image(painterResource(id =image), contentDescription =null,
        contentScale = ContentScale.Fit)
    }
}