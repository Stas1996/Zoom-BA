package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SupplierActivity extends AppCompatActivity {



    private TextView supplier_LBL_Title;
    private LinearLayout supplier_LAY_liner1;
    private ImageView supplier_IMG_hand;
    private RelativeLayout supplier_LAY_relfirst;
    private TextView supplier_LBL_name;
    private LinearLayout supplier_LAY_liner2;
    private ImageView supplier_IMG_hand1;
    private RelativeLayout supplier_LAY_relsecond;
    private TextView supplier_LBL_name1;
    private LinearLayout supplier_LAY_liner3;
    private ImageView supplier_IMG_hand2;
    private RelativeLayout supplier_LAY_relthird;
    private TextView supplier_LBL_name3;
    private LinearLayout supplier_LAY_liner4;
    private ImageView supplier_IMG_hand4;
    private RelativeLayout supplier_LAY_fourth;
    private TextView supplier_LBL_name4;
    private LinearLayout supplier_LAY_liner5;
    private ImageView supplier_IMG_hand5;
    private RelativeLayout supplier_LAY_fifth;
    private TextView supplier_LBL_name5;
    private ImageView supplier_IMG_back;
    private Button training_BTN_addSupply;
    private Intent intent;
    private TextView Nutritionist_LBL_commercial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        findViews();

        supplier_LBL_name.setOnClickListener(click);
        supplier_LBL_name1.setOnClickListener(click);
        supplier_LBL_name3.setOnClickListener(click);
        supplier_LBL_name4.setOnClickListener(click);
        supplier_LBL_name5.setOnClickListener(click);
        supplier_IMG_back.setOnClickListener(click);
        Nutritionist_LBL_commercial.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("name")){
                intent = new Intent(SupplierActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name1")){
                intent = new Intent(SupplierActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name3")){
                intent = new Intent(SupplierActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name4")){
                intent = new Intent(SupplierActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name5")){
                intent = new Intent(SupplierActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("back")){
                finish();
            }else if(view.getTag().toString().equals("commercial")){
                intent = new Intent(SupplierActivity.this,CommercialActivity.class);
                startActivity(intent);
            }
        }
    };

    private void findViews() {
        supplier_LBL_Title = findViewById(R.id. supplier_LBL_Title);
        supplier_LAY_liner1 = findViewById(R.id. supplier_LAY_liner1);
        supplier_IMG_hand = findViewById(R.id. supplier_IMG_hand);
        supplier_LAY_relfirst = findViewById(R.id. supplier_LAY_relfirst);
        supplier_LBL_name = findViewById(R.id. supplier_LBL_name);
        supplier_LAY_liner2 = findViewById(R.id. supplier_LAY_liner2);
        supplier_IMG_hand1 = findViewById(R.id. supplier_IMG_hand1);
        supplier_LAY_relsecond = findViewById(R.id. supplier_LAY_relsecond);
        supplier_LBL_name1 = findViewById(R.id. supplier_LBL_name1);
        supplier_LAY_liner3 = findViewById(R.id. supplier_LAY_liner3);
        supplier_IMG_hand2 = findViewById(R.id. supplier_IMG_hand2);
        supplier_LAY_relthird = findViewById(R.id. supplier_LAY_relthird);
        supplier_LBL_name3 = findViewById(R.id. supplier_LBL_name3);
        supplier_LAY_liner4 = findViewById(R.id. supplier_LAY_liner4);
        supplier_IMG_hand4 = findViewById(R.id. supplier_IMG_hand4);
        supplier_LAY_fourth = findViewById(R.id. supplier_LAY_fourth);
        supplier_LBL_name4 = findViewById(R.id. supplier_LBL_name4);
        supplier_LAY_liner5 = findViewById(R.id. supplier_LAY_liner5);
        supplier_IMG_hand5 = findViewById(R.id. supplier_IMG_hand5);
        supplier_LAY_fifth = findViewById(R.id. supplier_LAY_fifth);
        supplier_LBL_name5 = findViewById(R.id. supplier_LBL_name5);
        supplier_IMG_back = findViewById(R.id. supplier_IMG_back);
        training_BTN_addSupply = findViewById(R.id.training_BTN_addSupply);
        Nutritionist_LBL_commercial = findViewById(R.id.Nutritionist_LBL_commercial);
    }
}