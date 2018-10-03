package com.example.joel_mora.joelmorauala.app;

import android.app.Application;

import com.example.joel_mora.joelmorauala.rest.RestClient;

public class App extends Application
{
    private static RestClient restClient;

    @Override
    public void onCreate()
    {
        super.onCreate();

        restClient = new RestClient();
    }

    public static RestClient getRestClient()
    {
        return restClient;
    }
}
