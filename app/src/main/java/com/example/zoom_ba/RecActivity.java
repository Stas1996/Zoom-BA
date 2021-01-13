package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecActivity extends AppCompatActivity {
private TextView Rec_LBL_title;
private ImageView Pay_IMG_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        findViews();
        Pay_IMG_back.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")){
                finish();
            }
        }
    };

    private void findViews() {
        Rec_LBL_title= findViewById(R.id.Rec_LBL_title);
        Pay_IMG_back= findViewById(R.id.Pay_IMG_back);
    }
}