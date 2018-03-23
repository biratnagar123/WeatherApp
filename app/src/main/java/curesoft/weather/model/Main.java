package curesoft.weather.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Main {

    @SerializedName("humidity")
    private Long mHumidity;
    @SerializedName("pressure")
    private Long mPressure;
    @SerializedName("temp")
    private Double mTemp;
    @SerializedName("temp_max")
    private Long mTempMax;
    @SerializedName("temp_min")
    private Long mTempMin;

    public Long getHumidity() {
        return mHumidity;
    }

    public void setHumidity(Long humidity) {
        mHumidity = humidity;
    }

    public Long getPressure() {
        return mPressure;
    }

    public void setPressure(Long pressure) {
        mPressure = pressure;
    }

    public Double getTemp() {
        return mTemp;
    }

    public void setTemp(Double temp) {
        mTemp = temp;
    }

    public Long getTempMax() {
        return mTempMax;
    }

    public void setTempMax(Long tempMax) {
        mTempMax = tempMax;
    }

    public Long getTempMin() {
        return mTempMin;
    }

    public void setTempMin(Long tempMin) {
        mTempMin = tempMin;
    }

}
