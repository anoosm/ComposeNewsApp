package com.example.composenewsapp.presentation

import androidx.annotation.DrawableRes
import com.example.composenewsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf<Page>(
    Page(
        "lorem ipsum",
        "Hello this is the landing page. Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        R.drawable.onboarding1
    ),
    Page(
        "lorem ipsum",
        "Hello this is the landing page",
        R.drawable.onboarding2
    ),
    Page(
        "lorem ipsum",
        "Hello this is the landing page",
        R.drawable.onboarding3
    )
)
