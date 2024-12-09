package com.example.PaceSmartphone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView gmbr1, gmbr2, gmbr3, gmbr4;
    private ImageView gmbr5, gmbr6, gmbr7, gmbr8;
    private ImageView gmbr9, gmbr10, gmbr11, gmbr12;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(view -> {
            Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);

    }
}