package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {
    private EditText data_EDT_name;
    private EditText data_EDT_password;
    private EditText data_EDT_email;
    private Button data_BTN_save;
    private ImageView data_BTN_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        findViews();
        data_BTN_save.setOnClickListener(click);
        data_BTN_back.setOnClickListener(click);
    }
    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("save")){
                Toast.makeText(getBaseContext(), "Update successfully", Toast.LENGTH_LONG).show();
                finish();
            } else if(view.getTag().toString().equals("back")){
                finish();
            }

        }
    };

    private void findViews() {
        data_EDT_name = findViewById(R.id.data_EDT_name);
        data_EDT_password = findViewById(R.id.data_EDT_password);
        data_EDT_email = findViewById(R.id.data_EDT_email);
        data_BTN_save = findViewById(R.id.data_BTN_save);
        data_BTN_back = findViewById(R.id.data_BTN_back);
    }

}



