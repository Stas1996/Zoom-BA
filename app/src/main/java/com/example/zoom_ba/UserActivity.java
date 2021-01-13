package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private LinearLayout User_LAY_up;
    private TextView User_LBL_title;
    private ImageView User_IMG_close;
    private LinearLayout User_LAY_mid;
    private ImageView User_IMG_face;
    private LinearLayout User_LAY_inner;
    private TextView User_LBL_name;
    private TextView User_LBL_edit;
    private TextView User_LBL_email;
    private TextView User_LBL_phone;
    private TextView User_LBL_notification;
    private TextView User_LBL_about;
    private TextView User_LBL_friends;
    private TextView User_LBL_logout;
    private ImageView User_IMG_back;
    private TextView User_LBL_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        findViews();
        User_LBL_logout.setOnClickListener(click);
        User_LBL_edit.setOnClickListener(click);
        User_IMG_back.setOnClickListener(click);

    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("data")){
                Intent intent = new Intent(UserActivity.this, DataActivity.class);
                startActivity(intent);
            }else if (view.getTag().toString().equals("logout")){
                Intent intent = new Intent(UserActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }else if (view.getTag().toString().equals("back")){
                finish();
            }
        }
    };

    private void findViews() {
        User_LAY_up = findViewById(R.id. User_LAY_up);
        User_LBL_title = findViewById(R.id. User_LBL_title);
        User_IMG_back = findViewById(R.id.User_IMG_back);
        User_LAY_mid = findViewById(R.id. User_LAY_mid);
        User_IMG_face = findViewById(R.id. User_IMG_face);
        User_LAY_inner = findViewById(R.id. User_LAY_inner);
        User_LBL_name = findViewById(R.id. User_LBL_name);
        User_LBL_edit = findViewById(R.id. User_LBL_edit);
        User_LBL_email = findViewById(R.id. User_LBL_email);
        User_LBL_phone = findViewById(R.id. User_LBL_phone);
        User_LBL_notification = findViewById(R.id. User_LBL_notification);
        User_LBL_about = findViewById(R.id. User_LBL_about);
        User_LBL_friends = findViewById(R.id. User_LBL_friends);
        User_LBL_logout = findViewById(R.id. User_LBL_logout);
        User_LBL_type = findViewById(R.id.User_LBL_type);
    }
}