package com.sj.bmicalculator.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sj.bmicalculator.BaseActivity
import com.sj.bmicalculator.R
import com.sj.bmicalculator.presentation.components.AppBar
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
                        Column( modifier = Modifier.fillMaxSize()
                        ) {

                        }

                    }
                    
                }

            }
        }
    }
}