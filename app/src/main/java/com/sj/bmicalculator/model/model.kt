package com.sj.bmicalculator.model

import androidx.compose.runtime.MutableState

data class model (
    val isMale:Boolean,
    val image : Int,
    var selected : MutableState<Boolean>
)