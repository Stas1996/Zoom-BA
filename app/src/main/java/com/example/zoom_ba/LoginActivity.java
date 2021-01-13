package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button Login_BTN_Sup;
    private Button Login_BTN_Diet;
    private LinearLayout Login_Lay_down;
    private Button Login_BTN_Trainer;
    private Button Login_BTN_Coach;
    private LinearLayout Login_Lay_mid;
    private TextView Login_LBL_forgot;
    private Button Login_BTN_login;
    private EditText Login_EDT_pass;
    private EditText Login_EDT_username;
    private TextView Login_LBL_title;
    private LinearLayout Login_Lay_upper;
    private  Intent intent;
    private CheckBox Login_CBX_remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        Login_BTN_login.setOnClickListener(click);
        Login_BTN_Trainer.setOnClickListener(click);
        Login_BTN_Coach.setOnClickListener(click);
        Login_BTN_Sup.setOnClickListener(click);
        Login_BTN_Diet.setOnClickListener(click);
        Login_LBL_forgot.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("Login")){
                intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }else if(view.getTag().toString().equals("Coach")){

                intent = new Intent(LoginActivity.this, CoachRegActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("Trainer")){
                intent = new Intent(LoginActivity.this, TrainerRegActivity.class);
                startActivity(intent);

            }else if(view.getTag().toString().equals("Diet")){
                intent = new Intent(LoginActivity.this, NutritionistRegActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("Supplier")){
                intent = new Intent(LoginActivity.this, SupplierRegActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("Forget")){
                intent = new Intent(LoginActivity.this, ForgotPassActivity.class);
                startActivity(intent);
            }

        }
    };

    private void findViews() {
        Login_BTN_Sup = findViewById(R.id.Login_BTN_Sup);
        Login_BTN_Diet = findViewById(R.id.Login_BTN_Diet);
        Login_Lay_down = findViewById(R.id.Login_Lay_down);
        Login_BTN_Trainer = findViewById(R.id.Login_BTN_Trainer);
        Login_BTN_Coach = findViewById(R.id.Login_BTN_Coach);
        Login_Lay_mid = findViewById(R.id.Login_Lay_mid);
        Login_LBL_forgot = findViewById(R.id.Login_LBL_forgot);
        Login_BTN_login = findViewById(R.id.Login_BTN_login);
        Login_EDT_pass = findViewById(R.id.Login_EDT_pass);
        Login_EDT_username = findViewById(R.id.Login_EDT_username);
        Login_LBL_title = findViewById(R.id.Login_LBL_title);
        Login_Lay_upper = findViewById(R.id.Login_Lay_upper);
        Login_CBX_remember = findViewById(R.id.Login_CBX_remember);

    }
}