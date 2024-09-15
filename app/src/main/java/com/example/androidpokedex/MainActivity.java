package com.example.androidpokedex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textUsername, textPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textUsername = findViewById(R.id.username);
        textPassword = findViewById(R.id.password);
        btnSubmit = findViewById(R.id.submit);

        btnSubmit.setOnClickListener(view -> {
          String username = textUsername.getText().toString();
          String password = textPassword.getText().toString();

          if(username.equals("ana") && password.equals("ana")){
              Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
              Intent intent = new Intent(this, Pokemon.class);
              startActivity(intent);
          }
          else{
              Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
          }
        });
    }
}