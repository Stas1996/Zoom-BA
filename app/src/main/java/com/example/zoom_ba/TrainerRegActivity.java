package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TrainerRegActivity extends AppCompatActivity {


private Button trainerReg_BTN_Register;
private EditText TrainerReg_EDT_Pay;
private EditText TrainerReg_EDT_Weight;
private EditText TrainerReg_EDT_Height;
private EditText TrainerReg_EDT_Phone;
private EditText TrainerReg_EDT_email;
private EditText TrainerReg_EDT_age;
private EditText TrainerReg_EDT_LastName;
private EditText TrainerReg_EDT_name;
private TextView TrainerReg_LBL_title;
private ImageView trainerReg_IMG_back;
private Button trainerReg_BTN_Manual;
private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_reg);

        findViews();
        trainerReg_BTN_Manual.setOnClickListener(click);
        trainerReg_IMG_back.setOnClickListener(click);
        trainerReg_BTN_Register.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getTag().toString().equals("register")) {
                Toast toast = Toast.makeText(TrainerRegActivity.this, "User created Successfully", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            } else if (view.getTag().toString().equals("back")) {
                finish();

            } else if (view.getTag().toString().equals("regManual")) {
                intent = new Intent(TrainerRegActivity.this,ManualActivity.class);
                startActivity(intent);
            }
        }
    };

    private void findViews() {
        trainerReg_BTN_Register = findViewById(R.id.trainerReg_BTN_Register);

        TrainerReg_EDT_Weight = findViewById(R.id.TrainerReg_EDT_Weight);
                TrainerReg_EDT_Height = findViewById(R.id.TrainerReg_EDT_Height);
        TrainerReg_EDT_Phone = findViewById(R.id.TrainerReg_EDT_Phone);
                TrainerReg_EDT_email = findViewById(R.id.TrainerReg_EDT_email);
        TrainerReg_EDT_age = findViewById(R.id.TrainerReg_EDT_age);
                TrainerReg_EDT_LastName = findViewById(R.id.TrainerReg_EDT_LastName);
        TrainerReg_EDT_name = findViewById(R.id.TrainerReg_EDT_name);
                TrainerReg_LBL_title = findViewById(R.id.TrainerReg_LBL_title);
        trainerReg_IMG_back = findViewById(R.id. trainerReg_IMG_back);
                trainerReg_BTN_Manual = findViewById(R.id. trainerReg_BTN_Manual);
    }
}