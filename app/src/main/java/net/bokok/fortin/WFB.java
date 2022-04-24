package net.bokok.fortin;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WFB extends WebView {
    public WFB(@NonNull Context context) {
        super(context);
    }

    public WFB(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        WeSeFB weSeFB = new WeSeFB(this);
        weSeFB.wesefb();
    }
}
