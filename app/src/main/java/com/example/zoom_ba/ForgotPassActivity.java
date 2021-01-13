package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ForgotPassActivity extends AppCompatActivity {

private ImageView Forgot_IMG_back;
private MaterialButton Forgot_BTN_Send;
private EditText Forgot_EDT_Phone;
private EditText Forgot_EDT_email;
private TextView Forgot_LBL_forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        findViews();
        Forgot_IMG_back.setOnClickListener(click);
        Forgot_BTN_Send.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")){
                finish();
            }else if(view.getTag().toString().equals("send")){
                Toast toast = Toast.makeText(ForgotPassActivity.this, "email for reset password was sent", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        }
    };

    private void findViews() {
        Forgot_IMG_back = findViewById(R.id. Forgot_IMG_back);
        Forgot_BTN_Send = findViewById(R.id. Forgot_BTN_Send);
        Forgot_EDT_Phone = findViewById(R.id. Forgot_EDT_Phone);
        Forgot_EDT_email = findViewById(R.id. Forgot_EDT_email);
        Forgot_LBL_forgotPass = findViewById(R.id. Forgot_LBL_forgotPass);

    }
}