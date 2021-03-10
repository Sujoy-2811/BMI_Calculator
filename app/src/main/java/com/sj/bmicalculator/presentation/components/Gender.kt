package com.sj.bmicalculator.presentation.components

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.sj.bmicalculator.R
import com.sj.bmicalculator.model.model
import com.sj.bmicalculator.presentation.theme.Blue900

@Composable
fun Gender(
    members : List<model>,
    gender : (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        for (member in members){
            Surface(modifier = Modifier
                .clickable {
                    gender(member.isMale)
                    Log.d("Sujay", "${ member.isMale }")
                }.background(color = if (member.selected.value) Color.Green else MaterialTheme.colors.onSurface)
                .padding(5.dp),


            ) {
                Row(modifier = Modifier
                    .background(color = MaterialTheme.colors.onSurface)
                    .padding(15.dp),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Image(bitmap = ImageBitmap.imageResource(id = member.image), contentDescription =null,
                        modifier = Modifier
                            .height(125.dp)
                            .width(125.dp)
                            .background(color = MaterialTheme.colors.onSurface),
                    )

                }

            }
        }

    }
}
