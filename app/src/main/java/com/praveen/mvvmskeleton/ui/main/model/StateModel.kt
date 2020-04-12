package com.praveen.mvvmskeleton.ui.main.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class StateModel(
    var state: String?,
    @SerializedName("statecode")
    var stateCode: String?,

    @SerializedName("lastupdatedtime")
    var lastUpdated: String?,
    var active: Int?,
    var confirmed: Int?,
    var recovered: Int?,
    var deaths: Int?,

    @SerializedName("deltaconfirmed")
    var confirmedDelta: Int?,
    @SerializedName("deltarecovered")
    var recoveredDelta: Int?,
    @SerializedName("deltadeaths")
    var deathsDelta: Int?

): Parcelable