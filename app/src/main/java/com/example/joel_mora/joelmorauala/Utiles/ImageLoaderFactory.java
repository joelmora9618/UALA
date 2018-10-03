package com.example.joel_mora.joelmorauala.Utiles;

import android.content.Context;

public class ImageLoaderFactory {

    public static ImageLoader getImageLoader(Context context){
        return new PicassoImageLoader(context);
    }

}
