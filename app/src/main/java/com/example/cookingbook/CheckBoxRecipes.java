package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CheckBoxRecipes extends AppCompatActivity {

    Button btnInCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_recipes);

        btnInCheckBox = findViewById(R.id.btnInCheckBox);

        btnInCheckBox.setOnClickListener(v -> {
            startActivity();
        });

    }

    private void startActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
        finish();
    }
}