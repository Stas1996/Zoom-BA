package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NutritionistActivity extends AppCompatActivity {

private TextView Nutritionist_LBL_Title;
private LinearLayout Nutritionist_LAY_liner1;
private ImageView Nutritionist_IMG_hand;
private RelativeLayout Nutritionist_LAY_relfirst;
private TextView Nutritionist_LBL_name;
private LinearLayout Nutritionist_LAY_liner2;
private ImageView Nutritionist_IMG_hand1;
private RelativeLayout Nutritionist_LAY_relsecond;
private TextView Nutritionist_LBL_name1;
private LinearLayout Nutritionist_LAY_liner3;
private ImageView Nutritionist_IMG_hand2;
private RelativeLayout Nutritionist_LAY_relthird;
private TextView Nutritionist_LBL_name3;
private LinearLayout Nutritionist_LAY_liner4;
private ImageView Nutritionist_IMG_hand4;
private RelativeLayout Nutritionist_LAY_fourth;
private TextView Nutritionist_LBL_name4;
private LinearLayout Nutritionist_LAY_liner5;
private ImageView Nutritionist_IMG_hand5;
private RelativeLayout Nutritionist_LAY_fifth;
private TextView Nutritionist_LBL_name5;
private RelativeLayout Nutritionist_LAY_comBack;
private TextView Nutritionist_LBL_commercial;
private ImageView Nutritionist_IMG_back;
private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritionist);
        findViews();
        Nutritionist_LBL_name.setOnClickListener(click);
        Nutritionist_LBL_name1.setOnClickListener(click);
        Nutritionist_LBL_name3.setOnClickListener(click);
        Nutritionist_LBL_name4.setOnClickListener(click);
        Nutritionist_LBL_name5.setOnClickListener(click);
        Nutritionist_IMG_back.setOnClickListener(click);
        Nutritionist_LBL_commercial.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("name")){
                intent = new Intent(NutritionistActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name1")){
                intent = new Intent(NutritionistActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name3")){
                intent = new Intent(NutritionistActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name4")){
                intent = new Intent(NutritionistActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name5")){
                intent = new Intent(NutritionistActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("back")){
                finish();
            }else if(view.getTag().toString().equals("commercial")){
                Intent intent = new Intent(NutritionistActivity.this, CommercialActivity.class);
                startActivity(intent);
            }
        }
    };



    private void findViews() {
        Nutritionist_LBL_Title = findViewById(R.id. Nutritionist_LBL_Title);
                Nutritionist_LAY_liner1 = findViewById(R.id. Nutritionist_LAY_liner1);
        Nutritionist_IMG_hand = findViewById(R.id. Nutritionist_IMG_hand);
                Nutritionist_LAY_relfirst = findViewById(R.id. Nutritionist_LAY_relfirst);
        Nutritionist_LBL_name = findViewById(R.id. Nutritionist_LBL_name);
        Nutritionist_LAY_liner2 = findViewById(R.id. Nutritionist_LAY_liner2);
                Nutritionist_IMG_hand1 = findViewById(R.id. Nutritionist_IMG_hand1);
        Nutritionist_LAY_relsecond = findViewById(R.id. Nutritionist_LAY_relsecond);
        Nutritionist_LBL_name1 = findViewById(R.id. Nutritionist_LBL_name1);
                Nutritionist_LAY_liner3 = findViewById(R.id. Nutritionist_LAY_liner3);
        Nutritionist_IMG_hand2 = findViewById(R.id. Nutritionist_IMG_hand2);
                Nutritionist_LAY_relthird = findViewById(R.id. Nutritionist_LAY_relthird);
                Nutritionist_LBL_name3 = findViewById(R.id. Nutritionist_LBL_name3);
        Nutritionist_LAY_liner4 = findViewById(R.id. Nutritionist_LAY_liner4);
                Nutritionist_IMG_hand4 = findViewById(R.id. Nutritionist_IMG_hand4);
        Nutritionist_LAY_fourth = findViewById(R.id. Nutritionist_LAY_fourth);
        Nutritionist_LBL_name4 = findViewById(R.id. Nutritionist_LBL_name4);
                Nutritionist_LAY_liner5 = findViewById(R.id. Nutritionist_LAY_liner5);
        Nutritionist_IMG_hand5 = findViewById(R.id. Nutritionist_IMG_hand5);
                Nutritionist_LAY_fifth = findViewById(R.id. Nutritionist_LAY_fifth);
                Nutritionist_LBL_name5 = findViewById(R.id. Nutritionist_LBL_name5);
        Nutritionist_LAY_comBack = findViewById(R.id. Nutritionist_LAY_comBack);
        Nutritionist_LBL_commercial = findViewById(R.id. Nutritionist_LBL_commercial);
        Nutritionist_IMG_back = findViewById(R.id. Nutritionist_IMG_back);

    }
}