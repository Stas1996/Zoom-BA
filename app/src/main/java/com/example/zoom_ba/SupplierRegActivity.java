package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SupplierRegActivity extends AppCompatActivity {

   private Button SupplierReg_BTN_Register;
   private EditText SupplierReg_EDT_Description;
   private EditText SupplierReg_EDT_Company;
   private EditText SupplierReg_EDT_Phone;
   private EditText SupplierReg_EDT_email;
   private EditText SupplierReg_EDT_LastName;
   private EditText SupplierReg_EDT_name;
   private TextView SupplierReg_LBL_title;
   private ImageView SupplierReg_BTN_back;
    private Button SupplierReg_BTN_Manual;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_reg);

        findViews();
        SupplierReg_BTN_Manual.setOnClickListener(click);
        SupplierReg_BTN_back.setOnClickListener(click);
        SupplierReg_BTN_Register.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getTag().toString().equals("register")) {
                Toast toast = Toast.makeText(SupplierRegActivity.this, "User created Successfully", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            } else if (view.getTag().toString().equals("back")) {
                finish();

            } else if (view.getTag().toString().equals("regManual")) {
                intent = new Intent(SupplierRegActivity.this,ManualActivity.class);
                startActivity(intent);
            }
        }
    };

    private void findViews() {
        SupplierReg_BTN_Register = findViewById(R.id.SupplierReg_BTN_Register);
                SupplierReg_EDT_Description = findViewById(R.id.SupplierReg_EDT_Description);
        SupplierReg_EDT_Company = findViewById(R.id.SupplierReg_EDT_Company);
                SupplierReg_EDT_Phone = findViewById(R.id.SupplierReg_EDT_Phone);
        SupplierReg_EDT_email = findViewById(R.id.SupplierReg_EDT_email);
                SupplierReg_EDT_LastName = findViewById(R.id.SupplierReg_EDT_LastName);
        SupplierReg_EDT_name = findViewById(R.id.SupplierReg_EDT_name);
                SupplierReg_LBL_title = findViewById(R.id.SupplierReg_LBL_title);
        SupplierReg_BTN_back = findViewById(R.id.SupplierReg_BTN_back);
        SupplierReg_BTN_Manual = findViewById(R.id.SupplierReg_BTN_Manual);

    }
}