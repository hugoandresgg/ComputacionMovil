package com.example.crudandroid.sinterface;

import com.example.crudandroid.model.Empleado;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CrudEmpleadoInterface {

    @GET("/consultar/{id}")
    Call<Empleado> searchEmployee(@Path("id") Long id);

    @GET("/consultarAll")
    Call<List<Empleado>> getAll();

    @POST("/guardar")
    Call<Empleado> createEmployee(@Body RequestBody body);

    @DELETE("/user/{id}")
    Call<Void> deleteEmployee(@Path("id") Long id);

    @PUT("/update/{id}")
    Call<Empleado> updateEmployee(@Path("id") Long id, @Body RequestBody body);
}


