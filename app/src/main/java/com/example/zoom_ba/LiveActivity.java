package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LiveActivity extends AppCompatActivity {
private ImageView Live_IMG_live;
private ImageView Live_IMG_chat;
private ImageView Live_IMG_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        findViews();
        Live_IMG_back.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")) {
                finish();
            }
        }
    };

    private void findViews() {
        Live_IMG_live = findViewById(R.id.Live_IMG_live);
        Live_IMG_chat = findViewById(R.id.Live_IMG_chat);
        Live_IMG_back = findViewById(R.id.Live_IMG_back);
    }
}