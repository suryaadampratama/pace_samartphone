package com.example.PaceSmartphone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class CompareActivity extends AppCompatActivity {

    private Button NextProcessBtn;
    private Spinner spinner,spinner2;
    private ImageView image,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        NextProcessBtn = findViewById(R.id.next_btn);


        spinner = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        image = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        String [] animals = {"select phone","Iphone 13 Pro Max","Iphone 12","iPhone SE (2nd generation)","Iphone 12 mini"};

        String [] animals1 = {"select phone","Galaxy Note10 Lite","Galaxy A20s","Galaxy Z Fold3 5G","Samsung Galaxy A22"};

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,animals);
        spinner.setAdapter(adapter);

        ArrayAdapter<String>adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,animals1);
        spinner2.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 1:
                        image.setImageResource(R.drawable.iphone);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.iphone1);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.iphone2);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.iphone3);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 1:
                        image2.setImageResource(R.drawable.samsung1);
                        break;
                    case 2:
                        image2.setImageResource(R.drawable.samsung2);
                        break;
                    case 3:
                        image2.setImageResource(R.drawable.samsung3);
                        break;
                    case 4:
                        image2.setImageResource(R.drawable.samsung4);
                        break;
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        NextProcessBtn.setOnClickListener(view -> {
            Intent intent = new Intent(CompareActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
