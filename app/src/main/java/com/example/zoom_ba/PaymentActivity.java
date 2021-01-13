package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    private ImageView Payment_IMG_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Payment_IMG_Back = findViewById(R.id.Payment_IMG_Back);
        Payment_IMG_Back.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")){
                finish();
            }
        }
    };
}