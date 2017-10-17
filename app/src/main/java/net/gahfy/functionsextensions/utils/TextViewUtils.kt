package net.gahfy.functionsextensions.utils

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView

object TextViewUtils {
    fun setTypefaceToTextView(context: Context, textView: TextView, assetPath: String) {
        textView.typeface = Typeface.createFromAsset(context.assets, assetPath)
    }
}
