package curesoft.weather.Main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import curesoft.weather.R;
import curesoft.weather.model.Test;
import curesoft.weather.Rest.ApiClient;
import curesoft.weather.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tp;
    TextView tt;
    EditText pin;
    Button get;
    private static final String appid = "09172fa1587af1a0b73ffd9e3b051e9b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = (TextView) findViewById(R.id.place);
        tt = (TextView) findViewById(R.id.temper);
        pin = (EditText) findViewById(R.id.pincode);
        get = (Button) findViewById(R.id.getter);
        get.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v) {
        String pinGet = pin.getText().toString();
        String demo=    pinGet+",in";

        ApiInterface apiService = ApiClient.getApiclient().create(ApiInterface.class);
        Call<Test> call = apiService.getPlaceTemp(demo,"metric",appid);
        call.enqueue(new Callback<Test>() {
            @Override
            public void onResponse(Call<Test> call, Response<Test> response) {
                if (response.body() == null) {
                    Toast.makeText(getApplicationContext(), "enter the pincode nicely", Toast.LENGTH_SHORT).show();
                }else {
                    Test test = response.body();
                    //response.errorBody();
                   // int status = response.code();

                    tp.setText(test.getName());
                    tt.setText(test.getMain().getTemp() + "");
                }
            }
            @Override
            public void onFailure(Call<Test> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "enter the pincode ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
