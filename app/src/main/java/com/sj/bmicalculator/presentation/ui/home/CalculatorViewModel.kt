package com.sj.bmicalculator.presentation.ui.home

import android.app.Activity
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sj.bmicalculator.R
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
    val weight = mutableStateOf(50)
    var members = data().members.value
    val minus = R.drawable.ic_minus
    val  add =R.drawable.ic_add

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
    fun changeWeight(weight : String){
        if (weight == ""){
            this.height.value = -1
        }else{
            try {
                this.weight.value = weight.toInt()
            }catch (e : Exception){
                this.weight.value = -1
            }
        }
        Log.d("Sujay" , "Weight : ${this.weight.value}")

    }

    fun decWeight(){
        if (weight.value == 1){
            weight.value = 250
        }else{
            weight.value--
        }
    }

    fun inWeight(){
        if (weight.value == 250){
            weight.value = 1
        }else{
            weight.value++
        }
    }

}