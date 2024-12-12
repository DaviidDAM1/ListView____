package com.example.listview____;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // Crear una lista de objetos para representar las películas
    ArrayList<Objeto> peliculas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Rellenar la lista con nombres y portadas de películas
        peliculas.add(new Objeto("El Padrino", R.drawable.the_godfather));
        peliculas.add(new Objeto("Star Wars", R.drawable.star_wars));
        peliculas.add(new Objeto("The Dark Knight", R.drawable.the_dark_knight));
        peliculas.add(new Objeto("2012", R.drawable.dosmildoce));

        listView = findViewById(R.id.listView);

        // Crear un adaptador y asignarlo al ListView
        CustomAdapter adapter = new CustomAdapter(this, peliculas);
        listView.setAdapter(adapter);
    }
}