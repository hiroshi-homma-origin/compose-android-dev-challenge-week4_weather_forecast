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
package com.example.androiddevchallenge.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.screen.day.dayScreen
import com.example.androiddevchallenge.ui.screen.day.parts.dayDailySheet
import com.example.androiddevchallenge.ui.screen.night.nightScreen
import com.example.androiddevchallenge.ui.screen.night.parts_night.nightDailySheet
import timber.log.Timber

@SuppressLint("ComposableNaming")
@Composable
fun myAppContent() {
    val basePosition = 760f
    var offset by remember { mutableStateOf(basePosition) }
    Surface {
        Scaffold(
            modifier = Modifier.fillMaxSize()
                .scrollable(
                    orientation = Orientation.Vertical,
                    state = rememberScrollableState { delta ->
                        offset += delta / 4.0f
                        Timber.d("check_offset:$delta")
                        if (basePosition < offset) {
                            offset = basePosition
                        } else if (offset <= 0.0f) {
                            offset = 0.0f
                        }
                        delta
                    }
                )
        ) {
//            dayScreen()
            nightScreen()
//            dayDailySheet(offset = offset)
            nightDailySheet(offset = offset)
        }
    }
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun myAppContentDayPreview() {
    var offset by remember { mutableStateOf(0f) }
    Surface {
        Scaffold(
            modifier = Modifier.fillMaxSize()
                .scrollable(
                    orientation = Orientation.Vertical,
                    state = rememberScrollableState { delta ->
                        offset += delta
                        Timber.d("check_offset:$offset")
                        delta
                    }
                )
        ) {
            dayScreen()
//            nightScreen()
            dayDailySheet(offset = offset)
        }
//        dailySheet()
    }
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun myAppContentNightPreview() {
    var offset by remember { mutableStateOf(0f) }
    Surface {
        Scaffold(
            modifier = Modifier.fillMaxSize()
                .scrollable(
                    orientation = Orientation.Vertical,
                    state = rememberScrollableState { delta ->
                        offset += delta
                        Timber.d("check_offset:$offset")
                        delta
                    }
                )
        ) {
//            dayScreen()
            nightScreen()
        }
//        dailySheet()
    }
}
