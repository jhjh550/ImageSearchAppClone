package com.example.imagesearchappclone.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.imagesearchappclone.data.UnsplashRepository
import javax.inject.Inject

class GalleryViewModel @ViewModelInject constructor (
    private val repository: UnsplashRepository
): ViewModel() {
}