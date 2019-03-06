package ru.alexey.wheather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private SwitchCompat [] switchCompats = new SwitchCompat[3];
    final static String CITY = "CITY";
    final static String ADDDATA = "ADDDATA";
    private boolean [] showAddData = new boolean[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Задание к уроку 1. Просто вывести текст
        textView = findViewById(R.id.weather);
        textView.setText(getString(R.string.label));
        editText = findViewById(R.id.edit_text);
        switchCompats[0] = findViewById(R.id.show_wind);
        switchCompats[1] = findViewById(R.id.show_humidity);
        switchCompats[2] = findViewById(R.id.show_pressure);
    }


    public void onClickBtnSearch(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(CITY, editText.getText().toString());
        getDataFromswitchCompats();
        intent.putExtra(ADDDATA, showAddData);
        this.startActivity(intent);
    }

    public void getDataFromswitchCompats(){
        for (int i = 0; i < showAddData.length; i++){
                showAddData[i] = switchCompats[i].isChecked();
        }
    }
}
