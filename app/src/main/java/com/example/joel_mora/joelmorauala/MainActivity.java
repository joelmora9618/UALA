package com.example.joel_mora.joelmorauala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.joel_mora.joelmorauala.Model.LibroBean;
import com.example.joel_mora.joelmorauala.adapter.LibrosAdapter;
import com.example.joel_mora.joelmorauala.app.App;
import com.example.joel_mora.joelmorauala.rest.model.ApiResponse;
import com.example.joel_mora.joelmorauala.ui.utils.VerticalDividerItemDecoration;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    private TextView functionality_title;
    private RecyclerView rvGenericFormData;
    private LibrosAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callServices();
    }

    private void initUI(List<LibroBean>librosBeans) {
        functionality_title = findViewById(R.id.functionality_title);
        this.rvGenericFormData = findViewById(R.id.family_questions_form);
        mAdapter = new LibrosAdapter(this, librosBeans);
        mAdapter.setmOnItemClickListener(new LibrosAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(LibroBean libroBean) {

            }
        });
        initializeFormFields(librosBeans.size());
    }

    private void initializeFormFields(int sizeList) {
        this.rvGenericFormData.addItemDecoration(new VerticalDividerItemDecoration(this));
        this.rvGenericFormData.setItemViewCacheSize(sizeList);
    }


    private void callServices(){
        

        App.getRestClient().getBookService().getBook(new Callback<ApiResponse>()
        {
            @Override
            public void success(ApiResponse apiResponse, Response response)
            {
                initUI(apiResponse.getBook());
            }

            @Override
            public void failure(RetrofitError error)
            {
                Log.e("TAG", "Error : " + error.getMessage());

            }
        });
    }

}
