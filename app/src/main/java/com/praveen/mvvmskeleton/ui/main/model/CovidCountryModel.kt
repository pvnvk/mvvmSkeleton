package com.praveen.mvvmskeleton.ui.main.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CovidCountryModel (
    var statewise: ArrayList<StateModel?>?
): Parcelable