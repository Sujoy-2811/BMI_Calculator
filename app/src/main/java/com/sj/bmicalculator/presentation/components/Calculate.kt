package com.sj.bmicalculator.presentation.components

import android.os.Bundle
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Calculate(
    navController : NavController,
    isMale : Boolean,
    height : Int,
    weight : Int,
    age : Int,
    id : Int
){
    val result = weight/((height*height)/10000f)
    Row(modifier = Modifier
        .fillMaxWidth()
        .requiredHeightIn(50.dp)
        .background(color = Color.DarkGray),
        horizontalArrangement = Arrangement.Center


    ) {
        Button(onClick = {Log.d("Sujay", "Result : $result")
            val bundle = Bundle()
            bundle.putFloat("resultId" , result)
        navController.navigate(id, bundle)
        }) {

            Text(text = "Calculate Your BMI" ,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.align(Alignment.CenterVertically))
        }
    }



} 