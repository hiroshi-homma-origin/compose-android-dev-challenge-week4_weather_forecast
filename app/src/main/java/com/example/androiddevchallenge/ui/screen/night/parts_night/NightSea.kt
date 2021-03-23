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
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@SuppressLint("ComposableNaming")
@Composable
fun seaNight() {
    val startPosition1 by animateFloatAsState(
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 10000
                380.0f at 8000
                -300.0f at 8001
                10f at 10000
            },
            repeatMode = RepeatMode.Restart,
        )
    )

    val startPosition2 by animateFloatAsState(
        targetValue = 70f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 10000
                -100.0f at 10001
                69f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition3 by animateFloatAsState(
        targetValue = 280f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 500
                -100.0f at 501
                280f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition4 by animateFloatAsState(
        targetValue = 290f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 800
                -300.0f at 801
                290f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition5 by animateFloatAsState(
        targetValue = 170f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 8000
                -300.0f at 8001
                170f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition6 by animateFloatAsState(
        targetValue = 120f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 5000
                -120.0f at 5001
                120f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition7 by animateFloatAsState(
        targetValue = 50f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 8000
                -50.0f at 8001
                50f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition8 by animateFloatAsState(
        targetValue = 190f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 5000
                -190.0f at 5001
                190f at 20000
            }
        ),
        finishedListener = {}
    )

    Image(
        modifier = Modifier.fillMaxWidth()
            .offset(y = 433.dp),
        painter = painterResource(R.drawable.sea_night),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(70.dp)
            .height(7.dp)
            .offset(x = startPosition8.dp, y = 490.dp),
        painter = painterResource(R.drawable.flow_night1),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(60.dp)
            .height(4.dp)
            .offset(x = startPosition7.dp, y = 510.dp),
        painter = painterResource(R.drawable.flow_night2),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(160.dp)
            .height(5.dp)
            .offset(x = startPosition6.dp, y = 520.dp),
        painter = painterResource(R.drawable.flow_night3),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = startPosition5.dp, y = 470.dp),
        painter = painterResource(R.drawable.flow_night4),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = startPosition4.dp, y = 460.dp),
        painter = painterResource(R.drawable.flow_night5),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = startPosition3.dp, y = 440.dp),
        painter = painterResource(R.drawable.flow_night6),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(7.dp)
            .offset(x = startPosition2.dp, y = 478.dp),
        painter = painterResource(R.drawable.flow_night7),
        contentDescription = null
    )
    Image(
        modifier = Modifier.wrapContentWidth()
            .height(7.dp)
            .offset(x = startPosition1.dp, y = 450.dp),
        painter = painterResource(R.drawable.flow_night8),
        contentDescription = null
    )
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun seaNightPreview() {
    val startPosition1 by animateFloatAsState(
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 10000
                380.0f at 8000
                -300.0f at 8001
                10f at 10000
            },
            repeatMode = RepeatMode.Restart,
        )
    )

    val startPosition2 by animateFloatAsState(
        targetValue = 70f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 10000
                -100.0f at 10001
                69f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition3 by animateFloatAsState(
        targetValue = 280f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 5000
                -100.0f at 5001
                280f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition4 by animateFloatAsState(
        targetValue = 290f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 8000
                -300.0f at 8001
                290f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition5 by animateFloatAsState(
        targetValue = 170f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 8000
                -300.0f at 8001
                170f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition6 by animateFloatAsState(
        targetValue = 120f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 5000
                -120.0f at 5001
                120f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition7 by animateFloatAsState(
        targetValue = 50f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 8000
                -50.0f at 8001
                50f at 20000
            }
        ),
        finishedListener = {}
    )

    val startPosition8 by animateFloatAsState(
        targetValue = 190f,
        animationSpec = infiniteRepeatable(
            keyframes {
                durationMillis = 20000
                380.0f at 5000
                -190.0f at 5001
                190f at 20000
            }
        ),
        finishedListener = {}
    )

    Box(Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxWidth()
                .offset(y = 433.dp),
            painter = painterResource(R.drawable.sea_night),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(70.dp)
                .height(7.dp)
                .offset(x = startPosition8.dp, y = 490.dp),
            painter = painterResource(R.drawable.flow_night1),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(60.dp)
                .height(4.dp)
                .offset(x = startPosition7.dp, y = 510.dp),
            painter = painterResource(R.drawable.flow_night2),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(160.dp)
                .height(5.dp)
                .offset(x = startPosition6.dp, y = 520.dp),
            painter = painterResource(R.drawable.flow_night3),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = startPosition5.dp, y = 470.dp),
            painter = painterResource(R.drawable.flow_night4),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = startPosition4.dp, y = 460.dp),
            painter = painterResource(R.drawable.flow_night5),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = startPosition3.dp, y = 440.dp),
            painter = painterResource(R.drawable.flow_night6),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(7.dp)
                .offset(x = startPosition2.dp, y = 478.dp),
            painter = painterResource(R.drawable.flow_night7),
            contentDescription = null
        )
        Image(
            modifier = Modifier.wrapContentWidth()
                .height(7.dp)
                .offset(x = startPosition1.dp, y = 450.dp),
            painter = painterResource(R.drawable.flow_night8),
            contentDescription = null
        )
    }
}
