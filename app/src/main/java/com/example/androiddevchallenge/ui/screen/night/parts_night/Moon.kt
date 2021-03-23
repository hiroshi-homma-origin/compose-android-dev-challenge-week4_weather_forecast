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
package com.example.androiddevchallenge.ui.screen.night.parts_night

import android.annotation.SuppressLint
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@SuppressLint("ComposableNaming")
@Composable
fun moon() {
    val sunPositionY = 140f

    val sunPositionX = 250f

    val isFinished = remember { mutableStateOf(false) }
    val animePositionX by animateFloatAsState(
        targetValue = sunPositionX,
        animationSpec = keyframes {
            durationMillis = 1500
            -400.0f at 0 with LinearOutSlowInEasing
            sunPositionX at 1500 with LinearOutSlowInEasing
        }
    )
    val animePositionY by animateFloatAsState(
        targetValue = sunPositionY,
        animationSpec = keyframes {
            durationMillis = 1500
            600.0f at 0 with LinearOutSlowInEasing
            sunPositionY at 1500 with LinearOutSlowInEasing
        },
        finishedListener = {
            if (it == sunPositionY) {
                isFinished.value = true
            }
        }
    )

    Image(
        modifier = Modifier.size(120.dp)
            .offset(x = animePositionX.dp, y = animePositionY.dp),
        painter = painterResource(R.drawable.crescent_moon),
        contentDescription = null
    )
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun moonPreview() {
    Box(Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.size(120.dp)
                .offset(x = 250.dp, y = 140.dp),
            painter = painterResource(R.drawable.crescent_moon),
            contentDescription = null
        )
    }
}
