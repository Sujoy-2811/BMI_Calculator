package com.sj.bmicalculator.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView


class ResultFragment : Fragment() {
    
    var result : Float = 0f
    var isMale : Boolean? = null
    var age : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.getFloat("resultId")?.let { 
            result =it
        }
        arguments?.getBoolean("isMaleId")?.let {
            isMale=it
        }
        arguments?.getInt("ageId")?.let {
            age =it
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {

            setContent {
                Row() {
                    Text(text = "$result" , style = MaterialTheme.typography.h2)
                    Text(text = "$isMale" , style = MaterialTheme.typography.h2)
                    Text(text = "$age" , style = MaterialTheme.typography.h2)

                }

            }
        }
    }
}