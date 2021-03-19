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
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@SuppressLint("ComposableNaming")
@Composable
fun sunAnimation() {
    val sunPositionY = 195f
    val sunPositionY1 = sunPositionY - 55f
    val sunPositionY2 = sunPositionY1 - 28f
    val sunPositionY3 = sunPositionY2 - 30f

    val sunPositionX = 151f
    val sunPositionX1 = sunPositionX - 55f
    val sunPositionX2 = sunPositionX1 - 28f
    val sunPositionX3 = sunPositionX2 - 30f

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

    val infiniteTransition = rememberInfiniteTransition()
    val alpha1 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2000
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val alpha2 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2100
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val alpha3 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2200
            },
            repeatMode = RepeatMode.Reverse
        )
    )

    Image(
        painter = painterResource(R.drawable.ic_sun4),
        modifier = Modifier.offset(x = sunPositionX3.dp, y = sunPositionY3.dp)
            .alpha(alpha3),
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
    Image(
        painter = painterResource(R.drawable.ic_sun3),
        modifier = Modifier.offset(x = sunPositionX2.dp, y = sunPositionY2.dp)
            .alpha(alpha2),
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
    Image(
        painter = painterResource(R.drawable.ic_sun2),
        modifier = Modifier.offset(x = sunPositionX1.dp, y = sunPositionY1.dp)
            .alpha(alpha1),
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
    Image(
        painter = painterResource(R.drawable.ic_sun1),
        modifier = Modifier.offset(x = animePositionX.dp, y = animePositionY.dp),
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun sunAnimationPreview() {
    val sunPositionY = 195f
    val sunPositionY1 = sunPositionY - 55f
    val sunPositionY2 = sunPositionY1 - 28f
    val sunPositionY3 = sunPositionY2 - 30f

    val sunPositionX = 151f
    val sunPositionX1 = sunPositionX - 55f
    val sunPositionX2 = sunPositionX1 - 28f
    val sunPositionX3 = sunPositionX2 - 30f

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

    val infiniteTransition = rememberInfiniteTransition()
    val alpha1 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2000
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val alpha2 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2100
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val alpha3 by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isFinished.value) 1f else 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2200
            },
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.ic_sun4),
            modifier = Modifier.offset(x = sunPositionX3.dp, y = sunPositionY3.dp)
                .alpha(alpha3),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Image(
            painter = painterResource(R.drawable.ic_sun3),
            modifier = Modifier.offset(x = sunPositionX2.dp, y = sunPositionY2.dp)
                .alpha(alpha2),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Image(
            painter = painterResource(R.drawable.ic_sun2),
            modifier = Modifier.offset(x = sunPositionX1.dp, y = sunPositionY1.dp)
                .alpha(alpha1),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Image(
            painter = painterResource(R.drawable.ic_sun1),
            modifier = Modifier.offset(x = animePositionX.dp, y = animePositionY.dp),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
    }
}
