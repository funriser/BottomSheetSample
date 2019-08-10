package com.funrisestudio.bottomsheetsample

import android.content.Context
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment

fun Context?.dip(dip: Int): Int {
    this?:return 0
    return dip * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
}

fun Context?.dip(dip: Float): Float {
    this?:return 0f
    return dip * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
}

fun Fragment.dip(dip: Int): Int {
    return context.dip(dip)
}

fun Fragment.dip(dip: Float): Float {
    return context.dip(dip)
}