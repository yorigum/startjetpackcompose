package com.yoriworks.learnstatecompose.ui.composable.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yoriworks.learnstatecompose.data.WellnessTaskList
import com.yoriworks.learnstatecompose.ui.composable.components.StatefulCounter
import com.yoriworks.learnstatecompose.ui.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTaskList(list = wellnessViewModel.tasks,
            onCheckedChange = { task, checked ->
                wellnessViewModel.changeTaskChecked(
                    task,
                    checked
                )
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) })
    }
}
