package com.example.progettofilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvfilm;
    String film[] = {"Spiderman" , ""}

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm = (ListView)findViewById(R.id.lvFilm);


    }
}