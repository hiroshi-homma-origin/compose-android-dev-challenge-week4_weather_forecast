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
package com.example.androiddevchallenge

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.androiddevchallenge.ui.myAppContent
import com.example.androiddevchallenge.ui.myAppContentDayPreview
import com.example.androiddevchallenge.ui.myAppContentNightPreview
import com.example.androiddevchallenge.ui.theme.myTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.Transparent.toArgb()
        setContent {
            myTheme {
                myAppContent()
            }
        }
    }
}

@SuppressLint("ComposableNaming")
@Preview("Light Theme")
@Composable
fun lightPreview() {
    myTheme {
        myAppContentDayPreview()
    }
}

@SuppressLint("ComposableNaming")
@Preview("Dark Theme")
@Composable
fun darkPreview() {
    myTheme(darkTheme = true) {
        myAppContentNightPreview()
    }
}
