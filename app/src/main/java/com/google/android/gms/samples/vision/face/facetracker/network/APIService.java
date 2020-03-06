package com.google.android.gms.samples.vision.face.facetracker.network;
import com.google.android.gms.samples.vision.face.facetracker.model.User;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {

    @Headers( "Content-Type: application/json" )
    @POST("annotation_embd_mobile")
    Call<User> getUser(@Body RequestBody image);

}