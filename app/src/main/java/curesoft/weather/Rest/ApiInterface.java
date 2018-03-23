package curesoft.weather.Rest;

import curesoft.weather.model.Test;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Prabin kumar mallick on 15-09-2017.
 */

public interface ApiInterface {

    @GET("data/2.5/weather")

    Call<Test> getPlaceTemp(@Query("zip") String ab,@Query("units") String cd,@Query("appid") String ef);

}




