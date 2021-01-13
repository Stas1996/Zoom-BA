package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChooseActivity extends AppCompatActivity {

private ImageView choose_IMG_rec;
private ImageView choose_IMG_live;
private LinearLayout choose_LAY_mid;
private TextView choose_LBL_title;
private LinearLayout choose_LAY_up;
    private ImageView Choose_IMG_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        findViews();
        choose_IMG_rec.setOnClickListener(click);
        choose_IMG_live.setOnClickListener(click);
        Choose_IMG_back.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("rec")){
                Intent intent = new Intent(ChooseActivity.this,RecActivity.class);
                startActivity(intent);

            }else if(view.getTag().toString().equals("live")){
                Intent intent = new Intent(ChooseActivity.this,LiveActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("back")){
                finish();
            }
        }
    };

    private void findViews() {
        choose_IMG_rec = findViewById(R.id.choose_IMG_rec);
        choose_IMG_live = findViewById(R.id.choose_IMG_live);
        choose_LAY_mid = findViewById(R.id.choose_LAY_mid);
        choose_LBL_title = findViewById(R.id.choose_LBL_title);
        choose_LAY_up = findViewById(R.id.choose_LAY_up);
        Choose_IMG_back = findViewById(R.id.choose_IMG_back);
    }
}