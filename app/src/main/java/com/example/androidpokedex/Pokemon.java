package com.example.androidpokedex;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidpokedex.adapter.MyAdapter;
import com.example.androidpokedex.model.PokemonModel;

import java.util.List;

public class Pokemon extends AppCompatActivity {
    RecyclerView myRecyclerView;
    MyAdapter myAdapter;

    List<PokemonModel> pokemonList = List.of(
        new PokemonModel("JigglyPuff", R.drawable.jiggly, 1),
            new PokemonModel("Nidorina", R.drawable.nidorina, 2),
            new PokemonModel ("Meowth", R.drawable.meowth, 3)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_pokemon), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        myRecyclerView = findViewById(R.id.pokemonRecyclerView);
        myAdapter = new MyAdapter(pokemonList, this);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter(myAdapter);
    }
}