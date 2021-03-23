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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.TestData.sampleDailyDayDataList
import com.example.androiddevchallenge.data.TransitionState
import com.example.androiddevchallenge.transition
import com.example.androiddevchallenge.ui.theme.trans1
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@SuppressLint("ComposableNaming")
@Composable
fun nightDailySheet(offset: Float) {
    val screenSize = 1081.0f
    val lazyListState = rememberLazyListState()
    val positiveFloat = screenSize + 1 - lazyListState.firstVisibleItemScrollOffset
    val negativeFloat = -screenSize - lazyListState.firstVisibleItemScrollOffset

    val basePaddingInt = 60 // 40
    val currentNumber = lazyListState.firstVisibleItemIndex
    val padding1 = lazyListState.firstVisibleItemScrollOffset / 18 // 27
    val padding2 = basePaddingInt - lazyListState.firstVisibleItemScrollOffset / 18 // 27

    Column(
        modifier = Modifier.fillMaxWidth()
            .offset(y = offset.dp)
            .background(trans1)
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth()
                .scrollable(
                    orientation = Orientation.Horizontal,
                    state = rememberScrollableState { delta ->
                        delta
                    },
                ),
            state = lazyListState
        ) {
            items(sampleDailyDayDataList) { dailyData ->
                if (dailyData.stateName == sampleDailyDayDataList[currentNumber].stateName) {
                    Image(
                        modifier = Modifier.width(393.dp)
                            .height(600.dp)
                            .padding(start = padding1.dp, top = 80.dp, end = padding1.dp),
                        painter = painterResource(dailyData.imageResId),
                        alignment = Alignment.TopStart,
                        contentScale = ContentScale.Fit,
                        contentDescription = null
                    )
                } else {
                    Image(
                        modifier = Modifier.width(393.dp)
                            .height(600.dp)
                            .padding(start = padding2.dp, top = 80.dp, end = padding2.dp),
                        painter = painterResource(dailyData.imageResId),
                        alignment = Alignment.TopStart,
                        contentScale = ContentScale.Fit,
                        contentDescription = null
                    )
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier.padding(20.dp),
                onClick = { transition(lazyListState, TransitionState.NEGATIVE) }
            ) {
                Text(text = "back", color = Color.Black)
            }
            Button(
                modifier = Modifier.padding(20.dp),
                onClick = { transition(lazyListState, TransitionState.POSITIVE) }
            ) {
                Text(text = "next", color = Color.Black)
            }
        }
    }
    if (!lazyListState.isScrollInProgress) {
        transition(lazyListState, TransitionState.PENDING)
    }
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun nightDailySheetPreview() {
    val lazyListState = rememberLazyListState()
    val positiveFloat = 1082.0f - lazyListState.firstVisibleItemScrollOffset
    val negativeFloat = -1081.0f - lazyListState.firstVisibleItemScrollOffset

    val basePaddingInt = 40
    val currentNumber = lazyListState.firstVisibleItemIndex
    val padding1 = lazyListState.firstVisibleItemScrollOffset / 27
    val padding2 = basePaddingInt - lazyListState.firstVisibleItemScrollOffset / 27
    Column(
        modifier = Modifier.fillMaxWidth()
            .offset(y = 0.dp)
            .background(trans1)
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            state = lazyListState
        ) {
            items(sampleDailyDayDataList) { dailyData ->
                if (dailyData.stateName == sampleDailyDayDataList[currentNumber].stateName) {
                    Image(
                        modifier = Modifier.width(393.dp)
                            .height(600.dp)
                            .padding(start = padding1.dp, top = 80.dp, end = padding1.dp),
                        painter = painterResource(dailyData.imageResId),
                        alignment = Alignment.TopStart,
                        contentScale = ContentScale.Fit,
                        contentDescription = null
                    )
                } else {
                    Image(
                        modifier = Modifier.width(393.dp)
                            .height(600.dp)
                            .padding(start = padding2.dp, top = 80.dp, end = padding2.dp),
                        painter = painterResource(dailyData.imageResId),
                        alignment = Alignment.TopStart,
                        contentScale = ContentScale.Fit,
                        contentDescription = null
                    )
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier.padding(20.dp),
                onClick = {
                    CoroutineScope(Dispatchers.Main).launch {
                        lazyListState.animateScrollBy(negativeFloat)
                    }
                }
            ) {
                Text(text = "back", color = Color.Black)
            }
            Button(
                modifier = Modifier.padding(20.dp),
                onClick = {
                    CoroutineScope(Dispatchers.Main).launch {
                        lazyListState.animateScrollBy(positiveFloat)
                    }
                }
            ) {
                Text(text = "next", color = Color.Black)
            }
        }
    }
}
