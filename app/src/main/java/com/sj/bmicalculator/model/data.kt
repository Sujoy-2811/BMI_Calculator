package com.sj.bmicalculator.model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import com.sj.bmicalculator.R
import java.util.*

class data {
    var gender : MutableState<List<data>> = mutableStateOf(ArrayList())
    val male = model(isMale = true, image = R.drawable.ic_male , mutableStateOf(value = false))
    var female = model(isMale = false, image = R.drawable.ic_female,mutableStateOf(value = false))
    var members :MutableState<List<model>> = mutableStateOf(mutableStateListOf(male , female))
}