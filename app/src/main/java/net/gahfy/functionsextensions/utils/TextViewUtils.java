package net.gahfy.functionsextensions.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.widget.TextView;

public class TextViewUtils {
    public static void setTypefaceToTextView(@NonNull Context context, @NonNull TextView textView, @NonNull String assetPath){
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), assetPath));
    }
}
