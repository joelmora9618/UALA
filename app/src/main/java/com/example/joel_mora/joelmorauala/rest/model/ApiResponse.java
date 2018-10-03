package com.example.joel_mora.joelmorauala.rest.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.joel_mora.joelmorauala.Model.LibroBean;
import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;


public class ApiResponse implements Parcelable
{
    @SerializedName("book")
    private ArrayList<LibroBean> book;

    protected ApiResponse(Parcel in) {
        book = in.createTypedArrayList(LibroBean.CREATOR);
    }

    public static final Creator<ApiResponse> CREATOR = new Creator<ApiResponse>() {
        @Override
        public ApiResponse createFromParcel(Parcel in) {
            return new ApiResponse(in);
        }

        @Override
        public ApiResponse[] newArray(int size) {
            return new ApiResponse[size];
        }
    };

    public ArrayList<LibroBean> getBook() {
        return book;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(book);
    }
}
