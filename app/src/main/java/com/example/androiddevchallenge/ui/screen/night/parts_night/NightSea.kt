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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@SuppressLint("ComposableNaming")
@Composable
fun seaNight() {
    Image(
        modifier = Modifier.fillMaxWidth()
            .offset(y = 434.dp),
        painter = painterResource(R.drawable.sea_night),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(70.dp)
            .height(7.dp)
            .offset(x = 190.dp, y = 490.dp),
        painter = painterResource(R.drawable.flow_night1),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(60.dp)
            .height(4.dp)
            .offset(x = 50.dp, y = 510.dp),
        painter = painterResource(R.drawable.flow_night2),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(160.dp)
            .height(5.dp)
            .offset(x = 120.dp, y = 520.dp),
        painter = painterResource(R.drawable.flow_night3),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = 170.dp, y = 470.dp),
        painter = painterResource(R.drawable.flow_night4),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = 290.dp, y = 460.dp),
        painter = painterResource(R.drawable.flow_night5),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(5.dp)
            .offset(x = 280.dp, y = 440.dp),
        painter = painterResource(R.drawable.flow_night6),
        contentDescription = null
    )
    Image(
        modifier = Modifier.width(100.dp)
            .height(7.dp)
            .offset(x = 70.dp, y = 478.dp),
        painter = painterResource(R.drawable.flow_night7),
        contentDescription = null
    )
    Image(
        modifier = Modifier.wrapContentWidth()
            .height(7.dp)
            .offset(x = 10.dp, y = 450.dp),
        painter = painterResource(R.drawable.flow_night8),
        contentDescription = null
    )
}

@SuppressLint("ComposableNaming")
@Preview
@Composable
fun seaNightPreview() {
    Box(Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxWidth()
                .offset(y = 434.dp),
            painter = painterResource(R.drawable.sea_night),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(70.dp)
                .height(7.dp)
                .offset(x = 190.dp, y = 490.dp),
            painter = painterResource(R.drawable.flow_night1),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(60.dp)
                .height(4.dp)
                .offset(x = 50.dp, y = 510.dp),
            painter = painterResource(R.drawable.flow_night2),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(160.dp)
                .height(5.dp)
                .offset(x = 120.dp, y = 520.dp),
            painter = painterResource(R.drawable.flow_night3),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = 170.dp, y = 470.dp),
            painter = painterResource(R.drawable.flow_night4),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = 290.dp, y = 460.dp),
            painter = painterResource(R.drawable.flow_night5),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(5.dp)
                .offset(x = 280.dp, y = 440.dp),
            painter = painterResource(R.drawable.flow_night6),
            contentDescription = null
        )
        Image(
            modifier = Modifier.width(100.dp)
                .height(7.dp)
                .offset(x = 70.dp, y = 478.dp),
            painter = painterResource(R.drawable.flow_night7),
            contentDescription = null
        )
        Image(
            modifier = Modifier.wrapContentWidth()
                .height(7.dp)
                .offset(x = 10.dp, y = 450.dp),
            painter = painterResource(R.drawable.flow_night8),
            contentDescription = null
        )
    }
}
