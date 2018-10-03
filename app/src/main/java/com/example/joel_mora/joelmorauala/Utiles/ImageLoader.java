package com.example.joel_mora.joelmorauala.Utiles;

import android.widget.ImageView;

public interface ImageLoader {
    public void loadImage(String url, ImageView imageView);

    public void loadImage(String url, ImageView imageView, final ImageLoaderCallBack imageLoaderCallBack);
}
