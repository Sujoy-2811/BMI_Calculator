package com.sj.bmicalculator.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Calculate(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .requiredHeightIn(50.dp)
        .background(color = Color.DarkGray),
        horizontalArrangement = Arrangement.Center

    ) {
        Text(text = "Calculate Your BMI" ,
        style = MaterialTheme.typography.h5,
        modifier = Modifier.align(Alignment.CenterVertically))
    }
} 