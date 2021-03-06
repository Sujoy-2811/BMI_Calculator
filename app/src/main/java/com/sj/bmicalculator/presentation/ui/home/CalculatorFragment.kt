package com.sj.bmicalculator.presentation.ui.home

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.sj.bmicalculator.BaseActivity
import com.sj.bmicalculator.R
import com.sj.bmicalculator.model.data
import com.sj.bmicalculator.presentation.components.*
import com.sj.bmicalculator.presentation.theme.appTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CalculatorFragment:Fragment() {

    private  val viewModel : CalculatorViewModel by viewModels()
    val image = R.drawable.drawer_icon

    @Inject
    lateinit var application: BaseActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {

                val members = viewModel.members
                val height = viewModel.height.value.toString()
                val weight = viewModel.weight.value.toString()
                val age = viewModel.age.value.toString()
                val isMale  = viewModel.isMale.value
                val add = viewModel.add
                val minus = viewModel.minus
                val id = R.id.viewResult


                appTheme(isDark = application.isDarkTheme.value) {
                    Scaffold(
                        topBar = { AppBar(themeChange = application::changeTheme, image = image) },
                        drawerContent = {
                            IconButton(onClick = { },
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = null
                                )
                            }
                        }
                    ) {
                        Column( modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize()
                            .padding(15.dp)
                        ) {

                            Gender(members = members , gender = viewModel::genderSelection)
                            Height(height = height ,changeHeight = viewModel::changeHeight , hideKeybord = {val imm = context?.getSystemService(
                                Activity.INPUT_METHOD_SERVICE) as InputMethodManager?
                                imm?.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)}
                            )
                            Row(modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Weight(
                                    weight = weight,
                                    addImg = add,
                                    minusImg = minus,
                                    decWeight = viewModel::decWeight,
                                    incWeight = viewModel::inWeight)

                                Age(
                                    age = age,
                                    addImg = add,
                                    minusImg = minus,
                                    decAge = viewModel::decAge,
                                    incAge = viewModel::incAge)

                            }
                            Calculate(
                                navController = findNavController(),
                                isMale = isMale,
                                height = height.toInt(),
                                weight = weight.toInt(),
                                age = age.toInt(),
                                id = id
                            )

                        }

                    }

                }

            }
        }

    }
}