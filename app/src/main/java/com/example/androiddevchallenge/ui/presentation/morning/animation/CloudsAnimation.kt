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
package com.example.androiddevchallenge.ui.presentation.morning.animation

import android.annotation.SuppressLint
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@SuppressLint("ComposableNaming")
@Composable
fun cloudsAnimation() {
    val infiniteTransition = rememberInfiniteTransition()
    val startPosition by infiniteTransition.animateFloat(
        initialValue = -360f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 40000
            },
            repeatMode = RepeatMode.Restart
        )
    )

    Image(
        painter = painterResource(R.drawable.cloudy),
        modifier = Modifier.scale(1.32f)
            .offset(startPosition.dp, y = 190.dp),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun cloudsAnimationPreview() {
    val infiniteTransition = rememberInfiniteTransition()
    val startPosition by infiniteTransition.animateFloat(
        initialValue = -360f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 40000
            },
            repeatMode = RepeatMode.Restart
        )
    )

    Image(
        painter = painterResource(R.drawable.cloudy),
        modifier = Modifier.scale(1.32f)
            .offset(startPosition.dp, y = 190.dp),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}
