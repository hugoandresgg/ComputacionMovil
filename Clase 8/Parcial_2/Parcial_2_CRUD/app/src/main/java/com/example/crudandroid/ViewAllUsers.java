package com.example.crudandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.crudandroid.model.Empleado;
import com.example.crudandroid.sinterface.CrudEmpleadoInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ViewAllUsers extends AppCompatActivity {

    String URL ="http://172.16.160.86:8081/";
    List<Empleado> listEmpleado;
    CrudEmpleadoInterface crudempleado;
    ListView listVew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_users);
    }

    public void getAll(View view){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call = crudempleado.getAll();

        listEmpleado = new ArrayList<>();
        listVew = findViewById(R.id.ListUsers);
        /*ArrayAdapter<Empleado> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listEmpleado);
        listVew.setAdapter(adapter);*/
        call.enqueue(new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    /*listEmpleado.clear();
                    listEmpleado.addAll(response.body());
                    System.out.println(listEmpleado);*/
                    System.out.println(response.body());
                }else{
                    System.out.println(response.message());
                    System.out.println("Errro en la respuesta");
                }
            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                //System.out.println(t.getMessage());
                Log.e("Throw error: ",t.getMessage());
            }
        });


    }

}