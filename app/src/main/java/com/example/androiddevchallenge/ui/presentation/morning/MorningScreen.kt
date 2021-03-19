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
package com.example.androiddevchallenge.ui.presentation.morning

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.presentation.common.sheet
import com.example.androiddevchallenge.ui.presentation.common.sheetPreview
import com.example.androiddevchallenge.ui.presentation.morning.animation.cloudsAnimation
import com.example.androiddevchallenge.ui.presentation.morning.animation.cloudsAnimationPreview
import com.example.androiddevchallenge.ui.presentation.morning.animation.sunAnimation
import com.example.androiddevchallenge.ui.presentation.morning.animation.sunAnimationPreview
import com.example.androiddevchallenge.ui.presentation.morning.parts.lands
import com.example.androiddevchallenge.ui.presentation.morning.parts.landsPreview
import com.example.androiddevchallenge.ui.presentation.morning.parts.sky
import com.example.androiddevchallenge.ui.presentation.morning.parts.skyPreview
import com.example.androiddevchallenge.ui.presentation.morning.parts.trees
import com.example.androiddevchallenge.ui.presentation.morning.parts.treesPreview

@SuppressLint("ComposableNaming")
@Composable
fun morningScreen() {
    sky()
    sunAnimation()
    cloudsAnimation()
    lands()
    trees()
    sheet()
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun morningScreenPreview() {
    skyPreview()
    sunAnimationPreview()
    cloudsAnimationPreview()
    landsPreview()
    treesPreview()
    sheetPreview()
}
