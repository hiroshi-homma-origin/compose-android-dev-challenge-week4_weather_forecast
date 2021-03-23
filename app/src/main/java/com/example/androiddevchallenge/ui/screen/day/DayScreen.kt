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
package com.example.androiddevchallenge.ui.screen.day

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.screen.day.parts.lands
import com.example.androiddevchallenge.ui.screen.day.parts.landsPreview
import com.example.androiddevchallenge.ui.screen.day.parts.mountains
import com.example.androiddevchallenge.ui.screen.day.parts.mountainsPreview
import com.example.androiddevchallenge.ui.screen.day.parts.sea
import com.example.androiddevchallenge.ui.screen.day.parts.seaPreview
import com.example.androiddevchallenge.ui.screen.day.parts.sun
import com.example.androiddevchallenge.ui.screen.day.parts.sunPreview

@SuppressLint("ComposableNaming")
@Composable
fun dayScreen() {
    // backGroundImage
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.drawable.bg1),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
    // customLayout
    sun()
    mountains()
    sea()
    lands()
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun dayScreenPreview() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.drawable.bg1),
        contentScale = ContentScale.FillHeight,
        contentDescription = null
    )
    // customLayout
    sunPreview()
    mountainsPreview()
    seaPreview()
    landsPreview()
}
