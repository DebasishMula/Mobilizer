package com.example.mobilizer.api;

import com.example.mobilizer.PojoClass.RegisterItem;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {

    @POST("szapi.php?action=getitemdetails")
    Call<List<RegisterItem>> getMasterList(
            @Body JsonObject dbname


    );
}
