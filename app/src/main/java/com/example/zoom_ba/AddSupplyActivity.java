package com.example.zoom_ba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddSupplyActivity extends AppCompatActivity {
    private EditText data_EDT_kind;
    private EditText addWorkout_EDT_dateAndTime;
    private EditText addWorkout_EDT_trainerName;
    private EditText addWorkout_EDT_price;
    private Button data_BTN_submit;
    private ImageView data_BTN_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addworkout);
        findViews();
        data_BTN_submit.setOnClickListener(click);
        data_BTN_back.setOnClickListener(click);
    }
    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("save")){
                Toast.makeText(getBaseContext(), "submited", Toast.LENGTH_LONG).show();
                finish();
            } else if(view.getTag().toString().equals("back")){
                finish();
            }

        }
    };

    private void findViews() {
        data_EDT_kind = findViewById(R.id.data_EDT_kind);
        addWorkout_EDT_dateAndTime = findViewById(R.id.addWorkout_EDT_dateAndTime);
        addWorkout_EDT_trainerName = findViewById(R.id.addWorkout_EDT_trainerName);
        addWorkout_EDT_price = findViewById(R.id.addWorkout_EDT_price);
        data_BTN_back = findViewById(R.id.data_BTN_back);
    }

}



