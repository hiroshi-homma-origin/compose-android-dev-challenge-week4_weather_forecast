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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

sealed class ScreenList(val route: String, val iconDayInt: Int, val iconNightInt: Int) {
    object SunnyScreen : ScreenList(
        "Sunny",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object CloudyScreen : ScreenList(
        "Cloudy",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object Sunset1Screen : ScreenList(
        "Sunset1",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object Sunset2Screen : ScreenList(
        "Sunset2",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object NightScreen : ScreenList(
        "Night",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object MidNightScreen : ScreenList(
        "MidNight",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )

    object SunriseScreen : ScreenList(
        "Sunrise",
        R.drawable.ic_weather_icons_1,
        R.drawable.ic_weather_icons_1
    )
}
