package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    Button btnBackResultActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnBackResultActivity = findViewById(R.id.btnBackForResult);

        btnBackResultActivity.setOnClickListener(v -> {
            startActivity();
        });
    }

    private void startActivity() {
        Intent intent = new Intent(this, CheckBoxRecipes.class);
        startActivity(intent);
        finish();
    }

}