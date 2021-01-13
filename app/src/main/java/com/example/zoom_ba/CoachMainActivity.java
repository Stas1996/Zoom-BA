package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CoachMainActivity extends AppCompatActivity {
    private LinearLayout Main_LAY_upper;
    private ImageView Main_IMG_user;
    private TextView Main_LBL_title;
    private ImageView Main_IMG_settings;
    private LinearLayout Main_LAY_mid;
    private Button Main_BTN_workout;
    private Button Main_BTN_requests;
    private LinearLayout Main_LAY_bottom;
    private Button Main_BTN_nutritionist;
    private LinearLayout Main_LAY_back;
    private ImageView Main_IMG_back;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_main);
        findViews();
        Main_BTN_workout.setOnClickListener(click);
        Main_BTN_requests.setOnClickListener(click);
        Main_BTN_nutritionist.setOnClickListener(click);
        Main_IMG_settings.setOnClickListener(click);
        Main_IMG_user.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("workout")){
                intent = new Intent(CoachMainActivity.this,TrainingActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("requests")){
                intent = new Intent(CoachMainActivity.this,RequestActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("nutritionist")){
                intent = new Intent(CoachMainActivity.this,PaymentActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("settings")){
                intent = new Intent(CoachMainActivity.this,SettingsActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("user")){
                intent = new Intent(CoachMainActivity.this,UserActivity.class);
                startActivity(intent);
            }
        }
    };

    private void findViews() {
        Main_LAY_upper = findViewById(R.id. Main_LAY_upper);
        Main_IMG_user = findViewById(R.id. Main_IMG_user);
        Main_LBL_title = findViewById(R.id. Main_LBL_title);
        Main_IMG_settings = findViewById(R.id. Main_IMG_settings);
        Main_LAY_mid = findViewById(R.id. Main_LAY_mid);
        Main_BTN_workout = findViewById(R.id. Main_BTN_workout);
        Main_BTN_requests = findViewById(R.id. Main_BTN_requests);
        Main_LAY_bottom = findViewById(R.id. Main_LAY_bottom);
        Main_BTN_nutritionist = findViewById(R.id. Main_BTN_nutritionist);

    }

}