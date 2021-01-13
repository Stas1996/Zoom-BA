package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ManualActivity extends AppCompatActivity {

private TextView Manual_LBL_txt1;
private TextView Manual_LBL_txt2;
private TextView Manual_LBL_txt3;
private ImageView Manual_IMG_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        findViews();
        Manual_IMG_back.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             if (view.getTag().toString().equals("back")) {
                finish();
            }
        }
    };

    private void findViews() {
        Manual_LBL_txt1 = findViewById(R.id. Manual_LBL_txt1);
                Manual_LBL_txt2 = findViewById(R.id. Manual_LBL_txt2);
        Manual_LBL_txt3 = findViewById(R.id. Manual_LBL_txt3);
                Manual_IMG_back = findViewById(R.id. Manual_IMG_back);


    }
}