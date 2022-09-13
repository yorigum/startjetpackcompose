package com.yoriworks.learnstatecompose.ui.composable.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yoriworks.learnstatecompose.ui.composable.components.WaterCounter


@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    WaterCounter(modifier)
}