package com.example.imagesearchappclone.api

import com.example.imagesearchappclone.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)