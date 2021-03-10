package com.sj.bmicalculator.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Height(
    height : String,
    changeHeight: (String) -> Unit,
    hideKeybord : ()-> Unit
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 16.dp)
        .background(MaterialTheme.colors.onSurface)
        .padding(top = 16.dp, bottom = 8.dp),
    ) {
        Text(text = "${if (height.toInt() == -1) "0" else height} cm",
        modifier = Modifier.align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.h5
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(value = if (height.toInt() == -1) "" else height, onValueChange = { changeHeight(it) },
                placeholder = { Text(text = "Enter Height")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions {
                    hideKeybord()
                },
                modifier = Modifier.fillMaxWidth(0.4f)
                    .background(color = Color.Blue)
                    .padding(2.dp)
            )

        }

    }
}