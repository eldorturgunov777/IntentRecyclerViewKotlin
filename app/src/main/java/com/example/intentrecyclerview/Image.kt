package com.example.intentrecyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Eldor Turgunov
 * Project: Intent RecyclerView
 * Date: 04.03.2022
 * Time: 17:02
 */

@Parcelize
data class Image(
    val imageSrc : Int,
    val imageTitle: String,
    val imageDesc : String
) : Parcelable