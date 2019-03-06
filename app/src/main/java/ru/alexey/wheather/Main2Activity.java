package ru.alexey.wheather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textCityName;
    private TextView textCell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String cityName = getIntent().getExtras().getString(MainActivity.CITY, "empty search");

        textCityName = findViewById(R.id.text_view_city_name);
        textCityName.setText(cityName);

        textCell = findViewById(R.id.linear_layout_cell);
        textCell.setText(DataWeather.getTemperature());
        getAddData();

    }


    private void getAddData(){
        boolean [] showAddData;
                showAddData = getIntent().getExtras().getBooleanArray(MainActivity.ADDDATA);
        for (int i = 0 ; i < showAddData.length; i++){
            if (showAddData[i] && i == 0) {
                textCell.append("\n " + DataWeather.getWind() + ",  " + DataWeather.getWindDirection());
            }
            if (showAddData[i] && i == 1) {
                textCell.append("\n " + DataWeather.getHumidity());
            }
            if (showAddData[i] && i == 02) {
                textCell.append("\n " + DataWeather.getPressure());
            }
        }
    }
}
