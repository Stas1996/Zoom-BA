package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CoachRegActivity extends AppCompatActivity {


private ImageView CoachReg_IMG_back;
private Button CoachReg_BTN_register;
private EditText CoachReg_EDT_Experience;
private EditText CoachReg_EDT_Description;
private EditText CoachReg_EDT_Phone;
private EditText CoachReg_EDT_email;
private EditText CoachReg_EDT_age;
private EditText CoachReg_EDT_LastName;
private EditText CoachReg_EDT_name;
private TextView CoachReg_LBL_title;
private Button CoachReg_BTN_Manual;
private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_reg);
        findViews();
        CoachReg_BTN_Manual.setOnClickListener(click);
        CoachReg_IMG_back.setOnClickListener(click);
        CoachReg_BTN_register.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getTag().toString().equals("register")) {
                Toast toast = Toast.makeText(CoachRegActivity.this, "User created Successfully", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            } else if (view.getTag().toString().equals("back")) {
                finish();

            } else if (view.getTag().toString().equals("regManual")) {
                intent = new Intent(CoachRegActivity.this,ManualActivity.class);
                startActivity(intent);
            }
        }
    };

    private void findViews() {
        CoachReg_IMG_back = findViewById(R.id. CoachReg_IMG_back);
        CoachReg_BTN_register = findViewById(R.id. CoachReg_BTN_register);
        CoachReg_EDT_Experience = findViewById(R.id. CoachReg_EDT_Experience);
        CoachReg_EDT_Description = findViewById(R.id. CoachReg_EDT_Description);
        CoachReg_EDT_Phone = findViewById(R.id. CoachReg_EDT_Phone);
        CoachReg_EDT_email = findViewById(R.id. CoachReg_EDT_email);
        CoachReg_EDT_age = findViewById(R.id. CoachReg_EDT_age);
        CoachReg_EDT_LastName = findViewById(R.id. CoachReg_EDT_LastName);
        CoachReg_EDT_name = findViewById(R.id. CoachReg_EDT_name);
        CoachReg_LBL_title = findViewById(R.id. CoachReg_LBL_title);
        CoachReg_BTN_Manual = findViewById(R.id.CoachReg_BTN_Manual);
    }
}