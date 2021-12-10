package com.example.progettofilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvfilm;
    String film[] = {"Spiderman" , "Batman" , "Titanic"};
    Button btnEsci;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm = (ListView)findViewById(R.id.lvFilm);
        btnEsci = (Button)findViewById(R.id.btnEsci);

        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film); // contesto corrente è il metodo this. Tutto questo permette di collegare  l'array con la listView

        //popolo la ListView con l'arrayAdapter
        lvfilm.setAdapter(aaFilm); // legare la ListView con il nostro ArrayAdapter

        // creo l'ascoltatore collegato al bottone btnEsci
        btnEsci.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Vuoi uscire", Toast.LENGTH_LONG).show();
            }
        });
    }
}