package com.sj.bmicalculator.presentation.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColors(
    primary = Blue600,
    primaryVariant = Blue400,
    onPrimary = Black2,
    secondary = Color.White,
    secondaryVariant = Teal300,
    onSecondary = Color.Black,
    error = RedErrorDark,
    onError = RedErrorLight,
    background = Blue800,
    onBackground = Color.White,
    surface = Color.White,
    onSurface = Black2,
)

//private val LightThemeColors = lightColors(
//    primary = Blue600,
//    primaryVariant = Blue400,
//    onPrimary = Black2,
//    secondary = Color.White,
//    secondaryVariant = Teal300,
//    onSecondary = Color.Black,
//    error = RedErrorDark,
//    onError = RedErrorLight,
//    background = Grey1,
//    onBackground = Color.Black,
//    surface = Color.White,
//    onSurface = Black2,
//)

private val DarkThemeColors = darkColors(
    primary = Blue700,
    primaryVariant = Color.White,
    onPrimary = Color.White,
    secondary = Black1,
    onSecondary = Color.White,
    error = RedErrorLight,
    background = Color.Black,
    onBackground = Color.White,
    surface = Black1,
    onSurface = Color.Gray,
)

@Composable
fun appTheme(
    isDark : Boolean,
    content : @Composable ()-> Unit
){
    MaterialTheme(colors = if(isDark) DarkThemeColors else LightThemeColors
    ) {
        content()
    }

}