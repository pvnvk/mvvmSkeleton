package com.praveen.mvvmskeleton.ui.main.model

data class StateModel(
    var state: String?,
    var stateCode: String?,
    var lastUpdated: String?,
    var active: Int?,
    var confirmed: Int?,
    var recovered: Int?,
    var deaths: Int?,

    var activeDelta: Int?,
    var confirmedDelta: Int?,
    var recoveredDelta: Int?,
    var deathsDelta: Int?

)