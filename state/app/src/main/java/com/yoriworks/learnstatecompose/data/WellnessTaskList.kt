package com.yoriworks.learnstatecompose.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yoriworks.learnstatecompose.ui.composable.components.WellnessTaskItem

@Composable
fun WellnessTaskList(
    list: List<WellnessTask>,
    onCheckedChange: (WellnessTask,Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { task -> task.id }
        ) { task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = {checked -> onCheckedChange(task,checked)},
                onClose = { onCloseTask(task) })
        }
    }
}