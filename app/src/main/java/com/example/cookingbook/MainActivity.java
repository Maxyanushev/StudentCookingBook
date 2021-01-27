package com.example.cookingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    ImageView ivMainLogo;
    TextView mainText;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.tvMain);
        btnStart = findViewById(R.id.btnStart);
        ivMainLogo = findViewById(R.id.ivLogo);

        anim = AnimationUtils.loadAnimation(this, R.anim.mycomboforimage);
        ivMainLogo.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.mycomboforbutton);
        btnStart.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.mycombofortext);
        mainText.startAnimation(anim);

        btnStart.setOnClickListener(v -> {
            startActivity();
        });

    }

    private void startActivity() {
        Intent intent = new Intent(this, ListOfRecipes.class);
        startActivity(intent);
        finish();
    }

}