package com.sj.bmicalculator.presentation.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class CalculatorViewModel
@Inject
constructor(

): ViewModel() {

    val isMale = mutableStateOf(false)
    val height = mutableStateOf(0)
    val weight = mutableStateOf(0)
}