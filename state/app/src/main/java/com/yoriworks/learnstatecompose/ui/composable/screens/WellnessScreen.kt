package com.yoriworks.learnstatecompose.ui.composable.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.yoriworks.learnstatecompose.data.WellnessTask
import com.yoriworks.learnstatecompose.data.WellnessTaskList
import com.yoriworks.learnstatecompose.ui.composable.components.StatefulCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
   Column(modifier = modifier) {
       StatefulCounter()
       val list = remember {
           getWellnessTasks().toMutableStateList()
       }
       WellnessTaskList(list = list, onCloseTask = {task -> list.remove(task)})
   }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }