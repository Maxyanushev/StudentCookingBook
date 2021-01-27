package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ListOfRecipes extends AppCompatActivity {

    Button btnForCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_recipes);

        btnForCheck = findViewById(R.id.btnForCheckBox);

        btnForCheck.setOnClickListener(v -> {
            startActivity();
        });

    }

    private void startActivity() {
        Intent intent = new Intent(this, CheckBoxRecipes.class);
        startActivity(intent);
        finish();
    }
}