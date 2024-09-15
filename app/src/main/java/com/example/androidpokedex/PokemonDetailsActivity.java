package com.example.androidpokedex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PokemonDetailsActivity extends AppCompatActivity {
    TextView pokemonName, pokeId, pokemonDesc;
    ImageView pokemonImg, pokemonType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon_details);

        pokemonName = findViewById(R.id.pokemonName);
        pokemonImg = findViewById(R.id.pokemonImg);
        pokeId = findViewById(R.id.pokeId);
        pokemonType = findViewById(R.id.pokemonType);
        pokemonDesc = findViewById(R.id.pokemonDesc);

        pokemonImg.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
        });

    }
        @Override
        protected void onStart() {
            super.onStart();
            Intent intent = getIntent();
            int pokemonId = intent.getIntExtra("id", 0);

            switch (pokemonId) {
                case 1:
                    pokemonName.setText("JigglyPuff");
                    pokemonImg.setImageResource(R.drawable.jiggly);
                    pokeId.setText("#0039");
                    pokemonType.setImageResource(R.drawable.fairy);
                    pokemonDesc.setText("When its huge eyes waves, it sings a mysteriously soothing melody that lulls its enemies to sleep");
                    break;

                case 2:
                    pokemonName.setText("Nidorina");
                    pokemonImg.setImageResource(R.drawable.nidorina);
                    pokeId.setText("#0030");
                    pokemonType.setImageResource(R.drawable.poison);
                    pokemonDesc.setText("The horn on its head has atrophied. It's thought that this happens so Nidorina's children won't get poked while their mother is feeding them.");
                    break;

                case 3:
                    pokemonName.setText("Meowth");
                    pokemonImg.setImageResource(R.drawable.meowth);
                    pokeId.setText("#0052");
                    pokemonType.setImageResource(R.drawable.normal);
                    pokemonDesc.setText("All it does is sleep during the daytime. At night, it patrols its territory with its eyes aglow.");
                    break;

                default:
            }
        }
//
//        public void goBack() {
//        Intent intent = new Intent(this, Pokemon.class);
//        }
    }