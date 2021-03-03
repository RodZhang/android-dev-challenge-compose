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

data class Pet(
    val id: Int,
    val name: String,
    val pic: Int,
    val sex: String,
    val weight: Float,
    val desc: String
)

// Tony，Sam，Elina，Shef，Sunny，moon，Candy，jojo，Lisa，
val PETS = listOf(
    Pet(0, "Agumon", R.drawable.ic_agumon, "Female", 3.63F, "My name is Agumon . I am a Tan & White Female Mongrel and I was rescued by Inspectors. I am currently living in Hong Kong Centre, please come to see me and give me a home."),
    Pet(1, "Nefertiti", R.drawable.ic_nefertiti, "Female", 5.62F, "My name is Nefertiti . I am a Black Female Mongrel and I was rescued by Inspectors. I am currently living in Hong Kong Centre, please come to see me and give me a home."),
    Pet(2, "Momo", R.drawable.ic_momo, "Male", 2.63F, "My name is Momo . I am a Grey Female Dachshund Hound Cross (Spayed) and I was rescued by Inspectors. I am currently living in Hong Kong Centre, please come to see me and give me a home."),
    Pet(3, "Molly", R.drawable.ic_molly, "Female", 1.63F, "My name is Molly. I am a Tabby Female Domestic Short Hair (Spayed) and I was rescued by Inspectors. I am currently living in Hong Kong Centre, please come to see me and give me a home."),
    Pet(4, "Titus", R.drawable.ic_titus, "Male", 0.63F, "My name is Titus. I am a Green Male Red Eared Slider Terrapin and I was Abandoned by Owner. I am currently living in Kowloon Centre, please come to see me and give me a home."),
    Pet(5, "Rowan", R.drawable.ic_rowan, "Female", 0.33F, "My name is Rowan . I am a Green & Red Female Love Bird and I was Abandoned by Owner. I am currently living in Hong Kong Centre, please come to see me and give me a home."),
    Pet(6, "Geo", R.drawable.ic_geo, "Male", 2.33F, "My name is Geo . I am a Ginger Male Domestic Short Hair (Neutered) and I was rescued from Cat Colony Care Programme. I am currently living in Mong Kok Centre, please come to see me and give me a home."),
    Pet(7, "Dau Dau", R.drawable.ic_dau_dau, "Female", 5.33F, "My name is Dau Dau . I am a Cream Female Mongrel and I was rescued by Inspectors. I am currently living in Kowloon Centre, please come to see me and give me a home."),
)

fun getPetById(id: Int): Pet? {
    return PETS.find { it.id == id }
}
