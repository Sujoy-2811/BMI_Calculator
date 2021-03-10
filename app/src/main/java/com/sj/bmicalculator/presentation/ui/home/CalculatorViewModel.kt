package com.sj.bmicalculator.presentation.ui.home

import android.app.Activity
import android.util.Log
import android.view.inputmethod.InputMethodManager
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
    val height = mutableStateOf(-1)
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
    fun changeHeight(height : String){
        if (height == ""){
            this.height.value = -1
        }else{
            try {
                this.height.value = height.toInt()
            }catch (e : Exception){
                this.height.value = -1
            }
        }
        Log.d("Sujay" , "Height : ${this.height.value}")
    }

}