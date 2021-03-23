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

data class DailyData(
    val stateName: StateName,
    val temperature: Int,
    val humidity: Int,
    val wind: Int,
    val probabilityOfRain: Int,
    val imageResId: Int
)

enum class StateName(val stateName: String, val timeState: TimeState) {
    SUNNY_AM("Sunny", TimeState.AM),
    CLOUDY_AM("Cloudy", TimeState.AM),
    RAINY_AM("Rainy", TimeState.AM),
    SNOWY_AM("Snowy", TimeState.AM),
    SUNNY_PM("Sunny", TimeState.PM),
    CLOUDY_PM("Cloudy", TimeState.PM),
    RAINY_PM("Rainy", TimeState.PM),
    SNOWY_PM("Snowy", TimeState.PM)
}

enum class TimeState {
    AM,
    PM
}
