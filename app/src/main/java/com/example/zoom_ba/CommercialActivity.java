package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CommercialActivity extends AppCompatActivity {
private ImageView Commercial_IMG_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial);
        findViews();
        Commercial_IMG_back.setOnClickListener(click);
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
        Commercial_IMG_back = findViewById(R.id.Commercial_IMG_back);
    }


}