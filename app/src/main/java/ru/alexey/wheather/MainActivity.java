package ru.alexey.wheather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textCell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Задание к уроку 1. Просто вывести текст
        textView = findViewById(R.id.weather);
        textView.setText(getString(R.string.label));

        //Задание к уроку 2.
        // В activity погодного приложения создайте пользовательский интерфейс
        // в виде вывода на экран погодных значений.
        textCell = findViewById(R.id.linear_layout_cell);
        textCell.setText(DataWeather.getData());

    }
}
