package com.example.joel_mora.joelmorauala.rest;

import com.example.joel_mora.joelmorauala.rest.service.BookService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;


public class RestClient
{
    private static final String BASE_URL = "https://qodyhvpf8b.execute-api.us-east-1.amazonaws.com/";
    private BookService apiService;

    public RestClient()
    {
        Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory(new ItemTypeAdapterFactory())
            .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .setConverter(new GsonConverter(gson))
                .build();

        apiService = restAdapter.create(BookService.class);
    }

    public BookService getBookService()
    {
        return apiService;
    }
}
