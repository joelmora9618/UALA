package com.example.joel_mora.joelmorauala.rest.service;


import com.example.joel_mora.joelmorauala.rest.model.ApiResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


public interface BookService
{
    @GET("test/books")
    void getBook(Callback<ApiResponse> callback);
}
