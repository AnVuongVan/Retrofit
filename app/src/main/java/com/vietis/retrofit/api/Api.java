package com.vietis.retrofit.api;

import com.vietis.retrofit.model.DefaultResponse;
import com.vietis.retrofit.model.LoginResponse;
import com.vietis.retrofit.model.UsersResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {
    @FormUrlEncoded
    @POST("createuser")
    Call<DefaultResponse> createUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("name") String name,
            @Field("school") String school
    );

    @FormUrlEncoded
    @POST("userlogin")
    Call<LoginResponse> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("allusers")
    Call<UsersResponse> getUsers();

    @FormUrlEncoded
    @POST("updateuser/{id}")
    Call<LoginResponse> updateUser(
            @Path("id") int id,
            @Field("email") String email,
            @Field("name") String name,
            @Field("school") String school
    );

    @FormUrlEncoded
    @POST("updatepassword")
    Call<DefaultResponse> updatePassword(
            @Field("currentPassword") String currentPassword,
            @Field("newPassword") String newPassword,
            @Field("email") String email
    );

    @POST("deleteuser/{id}")
    Call<DefaultResponse> deleteUser(@Path("id") int id);
}
