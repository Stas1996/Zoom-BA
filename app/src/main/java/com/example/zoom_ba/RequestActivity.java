package com.example.zoom_ba;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RequestActivity extends AppCompatActivity {


    private TextView request_LBL_title;
    private CheckBox request_CHBOX_1;
    private MaterialButton request_BTN_add;
    private ImageView request_IMG_back;
    private String inputText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        findViews();

        request_IMG_back.setOnClickListener(click);
        request_BTN_add.setOnClickListener(click);
    }

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("back")){
                finish();
            }else if(view.getTag().toString().equals("add")){
                addText();
            }
        }
    };

    private void addText() {
        AlertDialog.Builder goalDialog = new AlertDialog.Builder(RequestActivity.this);
        goalDialog.setTitle("ADD NEW REQUEST");
        final EditText goalInput = new EditText(RequestActivity.this);
        goalDialog.setView(goalInput);
        goalDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                inputText = goalInput.getText().toString();
                LinearLayout requestLAY_linear = (LinearLayout) findViewById(R.id.requestLAY_linear);
                request_CHBOX_1 = new CheckBox(RequestActivity.this);
                request_CHBOX_1.setText(inputText);
                request_CHBOX_1.setTextSize(15);
                request_CHBOX_1.setClickable(true);

                requestLAY_linear.addView(request_CHBOX_1);
            }
        });

        goalDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        goalDialog.show();
    }




    private void findViews() {
        request_LBL_title = findViewById(R.id. request_LBL_title);
        request_CHBOX_1 = findViewById(R.id. request_CHBOX_1);
        request_BTN_add = findViewById(R.id. request_BTN_add);
        request_IMG_back = findViewById(R.id. request_IMG_back);



    }
}