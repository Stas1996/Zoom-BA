package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NutritionistRegActivity extends AppCompatActivity {

private TextView NutritionistReg_LBL_title;
private EditText NutritionistReg_EDT_name;
private EditText NutritionistReg_EDT_LastName;
private EditText NutritionistReg_EDT_age;
private EditText NutritionistReg_EDT_email;
private EditText NutritionistReg_EDT_Phone;
private EditText NutritionistReg_EDT_Description;
private Button NutritionistReg_BTN_Register;
private Button NutritionistReg_BTN_Manual;
private ImageView NutritionistReg_IMG_back;
private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritionist_reg);

        findViews();
        NutritionistReg_BTN_Manual.setOnClickListener(click);
        NutritionistReg_IMG_back.setOnClickListener(click);
        NutritionistReg_BTN_Register.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getTag().toString().equals("register")) {
                Toast toast = Toast.makeText(NutritionistRegActivity.this, "User created Successfully", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            } else if (view.getTag().toString().equals("back")) {
                finish();

            } else if (view.getTag().toString().equals("regManual")) {
                intent = new Intent(NutritionistRegActivity.this,ManualActivity.class);
                startActivity(intent);

            }
        }
    };

    private void findViews() {

        NutritionistReg_LBL_title = findViewById(R.id. NutritionistReg_LBL_title);
                NutritionistReg_EDT_name = findViewById(R.id. NutritionistReg_EDT_name);
        NutritionistReg_EDT_LastName = findViewById(R.id. NutritionistReg_EDT_LastName);
                NutritionistReg_EDT_age = findViewById(R.id. NutritionistReg_EDT_age);
        NutritionistReg_EDT_email = findViewById(R.id. NutritionistReg_EDT_email);
                NutritionistReg_EDT_Phone = findViewById(R.id. NutritionistReg_EDT_Phone);
        NutritionistReg_EDT_Description = findViewById(R.id. NutritionistReg_EDT_Description);
                NutritionistReg_BTN_Register = findViewById(R.id. NutritionistReg_BTN_Register);
        NutritionistReg_BTN_Manual = findViewById(R.id. NutritionistReg_BTN_Manual);

        NutritionistReg_IMG_back = findViewById(R.id. NutritionistReg_IMG_back);
    }
}