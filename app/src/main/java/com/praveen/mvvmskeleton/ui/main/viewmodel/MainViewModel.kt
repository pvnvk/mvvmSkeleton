package com.praveen.mvvmskeleton.ui.main.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun getSampleText(): String? {
        return "Sample Text in ViewModel"
    }
}
