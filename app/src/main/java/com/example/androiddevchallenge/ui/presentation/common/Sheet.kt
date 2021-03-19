/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.presentation.common

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("ComposableNaming")
@Composable
fun sheet() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(230.dp)
            .offset(y = 530.dp),
        shape = RoundedCornerShape(28.dp),
        elevation = 8.dp
    ) {
    }
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun sheetPreview() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(280.dp)
            .offset(y = 530.dp),
        shape = RoundedCornerShape(28.dp),
        elevation = 8.dp
    ) {
    }
}
