package com.example.zoom_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TrainingActivity extends AppCompatActivity {

    private TextView training_LBL_Title;
    private LinearLayout training_LAY_liner1;
    private ImageView training_IMG_hand;
    private RelativeLayout training_LAY_relfirst;
    private TextView training_LBL_name;
    private LinearLayout training_LAY_liner2;
    private ImageView training_IMG_hand1;
    private RelativeLayout training_LAY_relsecond;
    private TextView training_LBL_name1;
    private LinearLayout training_LAY_liner3;
    private ImageView training_IMG_hand2;
    private RelativeLayout training_LAY_relthird;
    private TextView training_LBL_name3;
    private LinearLayout training_LAY_liner4;
    private ImageView training_IMG_hand4;
    private RelativeLayout training_LAY_fourth;
    private TextView training_LBL_name4;
    private LinearLayout training_LAY_liner5;
    private ImageView training_IMG_hand5;
    private RelativeLayout training_LAY_fifth;
    private TextView training_LBL_name5;
    private ImageView Training_IMG_back;
    private Button training_BTN_workOut;
    private Button training_BTN_feedback;
    private Button training_BTN_sort;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        findViews();
        training_LBL_name.setOnClickListener(click);
        training_LBL_name1.setOnClickListener(click);
        training_LBL_name3.setOnClickListener(click);
        training_LBL_name4.setOnClickListener(click);
        training_LBL_name5.setOnClickListener(click);
        Training_IMG_back.setOnClickListener(click);
        training_BTN_workOut.setOnClickListener(click);
        training_BTN_feedback.setOnClickListener(click);
        training_BTN_sort.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getTag().toString().equals("name")) {
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("name1")) {
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("name3")) {
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("name4")) {
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("name5")) {
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("back")) {
                finish();
            } else if (view.getTag().toString().equals("work")) {
                Intent intent = new Intent(TrainingActivity.this, ChooseActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("feedback")) {
                Intent intent = new Intent(TrainingActivity.this, FeedbackActivity.class);
                startActivity(intent);
            } else if (view.getTag().toString().equals("sort")) {
                String[] units = {"Type", "Price", "Equipment", "Difficulty"};
                unitSelection(units);
            }
        }
    };

    private void unitSelection(String[] choose) {


        AlertDialog.Builder builder = new AlertDialog.Builder(TrainingActivity.this);
        builder.setTitle("Choose an option");
        builder.setItems(choose, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }
    private void findViews() {

        training_LBL_Title = findViewById(R.id. training_LBL_Title);
        training_LAY_liner1 = findViewById(R.id. training_LAY_liner1);
        training_IMG_hand = findViewById(R.id. training_IMG_hand);
        training_LAY_relfirst = findViewById(R.id. training_LAY_relfirst);
        training_LBL_name = findViewById(R.id. training_LBL_name);
        training_LAY_liner2 = findViewById(R.id. training_LAY_liner2);
        training_IMG_hand1 = findViewById(R.id. training_IMG_hand1);
        training_LAY_relsecond = findViewById(R.id. training_LAY_relsecond);
        training_LBL_name1 = findViewById(R.id. training_LBL_name1);
        training_LAY_liner3 = findViewById(R.id. training_LAY_liner3);
        training_IMG_hand2 = findViewById(R.id. training_IMG_hand2);
        training_LAY_relthird = findViewById(R.id. training_LAY_relthird);
        training_LBL_name3 = findViewById(R.id. training_LBL_name3);
        training_LAY_liner4 = findViewById(R.id. training_LAY_liner4);
        training_IMG_hand4 = findViewById(R.id. training_IMG_hand4);
        training_LAY_fourth = findViewById(R.id. training_LAY_fourth);
        training_LBL_name4 = findViewById(R.id. training_LBL_name4);
        training_LAY_liner5 = findViewById(R.id. training_LAY_liner5);
        training_IMG_hand5 = findViewById(R.id. training_IMG_hand5);
        training_LAY_fifth = findViewById(R.id. training_LAY_fifth);
        training_LBL_name5 = findViewById(R.id. training_LBL_name5);
        Training_IMG_back = findViewById(R.id. Training_IMG_back);
        training_BTN_workOut = findViewById(R.id.training_BTN_workOut);
        training_BTN_feedback = findViewById(R.id.training_BTN_feedback);
        training_BTN_sort = findViewById(R.id.training_BTN_sort);
    }
}