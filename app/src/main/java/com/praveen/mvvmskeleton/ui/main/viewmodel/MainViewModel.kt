package com.praveen.mvvmskeleton.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.praveen.mvvmskeleton.ui.main.model.CovidCountryModel
import com.yaksha.android.network.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {

    var countryLiveData: MutableLiveData<CovidCountryModel> = MutableLiveData()

    fun getSampleText(): String? {
        return "Sample Text in ViewModel"
    }

    fun loadCountryData() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = RetrofitBuilder.apiService.getCountryData()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    println("--> Country Model : ${response.body()}")
                    println("--> Country Model toString(): ${response.body().toString()}")
                    countryLiveData.value = response.body()
//                    Utils.saveLoggedInUser(response.body())
//                    openHomePage()
                }
            }
        }
    }
}
