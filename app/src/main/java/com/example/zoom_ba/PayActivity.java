package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PayActivity extends AppCompatActivity {

private ImageView Pay_IMG_back;
private Button Pay_BTN_pay;
private EditText Pay_EDT_cvv;
private EditText Pay_EDT_date;
private EditText Pay_EDT_number;
private EditText Pay_EDT_id;
private TextView Pay_LBL_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        findViews();
        Pay_IMG_back.setOnClickListener(click);
        Pay_BTN_pay.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")){
                finish();
            }else if(view.getTag().toString().equals("pay")){
                Toast.makeText(PayActivity.this, "successful buy!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    };
    private void findViews() {
        Pay_IMG_back = findViewById(R.id. Pay_IMG_back);
                Pay_BTN_pay = findViewById(R.id. Pay_BTN_pay);
        Pay_EDT_cvv = findViewById(R.id. Pay_EDT_cvv);
                Pay_EDT_date = findViewById(R.id. Pay_EDT_date);
        Pay_EDT_number = findViewById(R.id. Pay_EDT_number);
                Pay_EDT_id = findViewById(R.id. Pay_EDT_id);
        Pay_LBL_title = findViewById(R.id. Pay_LBL_title);
    }
}