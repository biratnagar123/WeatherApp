package curesoft.weather.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Prabin kumar mallick on 15-09-2017.
 */
//for retrofit instance
public class ApiClient
{
    final static private String BaseUrl="https://api.openweathermap.org/";
    public static Retrofit retrofit=null;
    public static Retrofit getApiclient()
    {
        if(retrofit==null){
         retrofit=new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
