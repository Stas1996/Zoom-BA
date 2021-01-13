package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {
    private TextView settings_LBL_units;
    private TextView settings_LBL_timer;
    private TextView settings_LBL_owner;
    private Switch settings_SWT_screenOn;
    private ImageView Pay_IMG_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        findViews();
        settings_LBL_timer.setOnClickListener(click);
        Pay_IMG_back.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("font")){
                String[] units = {"20", "22", "30", "40"};
                unitSelection(units);
            }else if(view.getTag().toString().equals("back")){
                finish();
            }
        }
    };
    private void unitSelection(String[] choose) {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose an option");
        builder.setItems(choose, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }

    private void findViews() {
        settings_SWT_screenOn = findViewById(R.id.settings_SWT_screenOn);
        settings_LBL_units = findViewById(R.id.settings_LBL_units);
        settings_LBL_timer = findViewById(R.id.settings_LBL_timer);
        settings_LBL_owner = findViewById(R.id.settings_LBL_owner);
        Pay_IMG_back = findViewById(R.id.Pay_IMG_back);
    }
}