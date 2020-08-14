package com.ualr.a03_resources;

import android.content.Context;

public class Utils {
    public static int getColorValue(Context context, int colorResourceId) {
        return context.getResources().getColor(colorResourceId);
    }
}
