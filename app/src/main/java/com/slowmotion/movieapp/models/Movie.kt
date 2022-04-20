package com.slowmotion.movieapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    var poster : String?,

    @SerializedName("release_date")
    var release : String?,


) : Parcelable{
    constructor() : this("","","","")
}