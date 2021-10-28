package com.example.prak4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FilmAdapter adapter;
    private ArrayList<Film> filmArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new FilmAdapter(filmArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        filmArrayList = new ArrayList<>();
        filmArrayList.add(new Film("Fast 9", "Tahun Rilis : 16 Juni 2021", "Laga / Family / Petualangan.",R.drawable.fast));
        filmArrayList.add(new Film("Sebelum Iblis Menjemput","Tahun Rilis : 9 Agustus 2018", "Horror.",R.drawable.iblis));
        filmArrayList.add(new Film("The Guys", "Tahun Rilis : 13 April 2017", "Komedi / Drama.",R.drawable.guys));
        filmArrayList.add(new Film("Wonder Woman 1984","Tahun Rilis : 16 Desember 2020", "Laga / Drama / Fiksi Pahlawan Super.",R.drawable.wonder));
        filmArrayList.add(new Film("Gundala", "Tahun Rilis : 29 Agustus 2019", "Laga / Drama / Fiksi Pahlawan Super.", R.drawable.gundala));
        filmArrayList.add(new Film("Dune", "Tahun Rilis: 13 Oktober 2021", "Novel / Fiksi Ilmiah / Fiksi Fantasi.", R.drawable.dune));
        filmArrayList.add(new Film("5 cm", "Tahun Rilis : 12 Desember 2012", "Roman / Drama / Petualangan", R.drawable.cm));
    }
}
