package com.sj.bmicalculator.presentation.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sj.bmicalculator.model.data
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
    var members = data().members.value

    fun genderSelection(isMale : Boolean){
        if (isMale){
            members[0].selected.value = true
            members[1].selected.value = false
        }else{
            members[0].selected.value = false
            members[1].selected.value = true
        }
    }
}