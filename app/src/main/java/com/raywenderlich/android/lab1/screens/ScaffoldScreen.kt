package com.raywenderlich.android.lab1.screens

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ScaffoldScreen(){
    MyScaffold()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
@Preview
fun MyScaffold() {
    //TODO
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState) {
    //TODO
}

@Composable
fun MyBottomAppBar(){
    //TODO
}