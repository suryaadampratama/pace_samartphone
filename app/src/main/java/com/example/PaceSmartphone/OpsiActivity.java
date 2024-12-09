package com.example.PaceSmartphone;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OpsiActivity extends AppCompatActivity {

    ImageView kanan,kiri;
    Animation animationkanan,animationkiri;
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsi);
        kanan = findViewById(R.id.kanan);
        kiri = findViewById(R.id.kiri);
        animationkanan = AnimationUtils.loadAnimation(this, R.anim.rightanim);
        animationkiri = AnimationUtils.loadAnimation(this, R.anim.leftanim);
        kanan.setAnimation(animationkanan);
        kiri.setAnimation(animationkiri);

        pindah = findViewById(R.id.btn_pindah);
        pindah.setOnClickListener(view -> {
            Intent intent = new Intent(OpsiActivity.this, CompareActivity.class);
            startActivity(intent);
        });
    }

}