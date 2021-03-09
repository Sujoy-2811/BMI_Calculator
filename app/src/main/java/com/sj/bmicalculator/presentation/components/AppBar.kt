package com.sj.bmicalculator.presentation.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.animatedVectorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.Glide


@Composable
fun AppBar(
    themeChange : ()-> Unit,
    image : Int
) {
    Surface(elevation = 10.dp,
    modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp),
        color = MaterialTheme.colors.background
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.background),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            IconButton(onClick = { themeChange() },
                modifier = Modifier.align(Alignment.CenterVertically)
                    .padding(start = 8.dp)
                    .fillMaxWidth(0.07f)
            ) {
                Image(bitmap = ImageBitmap.Companion.imageResource(id =image), contentDescription =null )
            }
            
            Text(text = "BMI Calculator",
            style = TextStyle(color = MaterialTheme.colors.onBackground , fontSize = 37.sp),
                modifier = Modifier.padding(8.dp)
            )
            IconButton(onClick = { themeChange() },
            modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = null
                )
            }

        }

    }
}