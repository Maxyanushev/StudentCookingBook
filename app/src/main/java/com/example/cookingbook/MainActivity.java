package com.example.cookingbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MAIN_ACTIVITY";

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

        btnStart.setOnClickListener(v -> {  // Изначальная кнопка для проекта
            startActivity();
        });
    }

    private void startActivity() {
        Intent intent = new Intent(this, ListOfRecipes.class);
        startActivity(intent);
        finish();
    }
}