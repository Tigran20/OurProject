package com.example.android.testchildren;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mSimpleLay;
    private LinearLayout mNotSimpleLay;

    private ImageView mNextAct;
    private ImageView mNextAct2;
    private ImageView mNextAct3;
    private ImageView mNextAct4;
    private ImageView mNextAct5;
    private ImageView mNextAct6;

    private ImageView mNextAct7;
    private ImageView mNextAct8;
    private ImageView mNextAct9;
    private ImageView mNextAct10;
    private ImageView mNextAct11;
    private ImageView mNextAct12;

    private Button mHideSimple;
    private Button mHideNotSimple;

    private boolean isBackBtnPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSimpleLay = findViewById(R.id.simple_lay);
        mNotSimpleLay = findViewById(R.id.not_simple_lay);

        mHideSimple = findViewById(R.id.hide_simple_btn);
        mHideNotSimple = findViewById(R.id.hide_not_simple_btn);

        mNextAct = findViewById(R.id.iv_1);
        mNextAct2 = findViewById(R.id.iv_2);
        mNextAct3 = findViewById(R.id.iv_3);
        mNextAct4 = findViewById(R.id.iv_4);
        mNextAct5 = findViewById(R.id.iv_5);
        mNextAct6 = findViewById(R.id.iv_6);

        mNextAct7 = findViewById(R.id.iv_7);
        mNextAct8 = findViewById(R.id.iv_8);
        mNextAct9 = findViewById(R.id.iv_9);
        mNextAct10 = findViewById(R.id.iv_10);
        mNextAct11 = findViewById(R.id.iv_11);
        mNextAct12 = findViewById(R.id.iv_12);

        mHideSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSimpleLay.setVisibility(View.GONE);
            }
        });

        mHideNotSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNotSimpleLay.setVisibility(View.GONE);
            }
        });

        mNextAct.setOnClickListener(this);
        mNextAct2.setOnClickListener(this);
        mNextAct3.setOnClickListener(this);
        mNextAct4.setOnClickListener(this);
        mNextAct5.setOnClickListener(this);
        mNextAct6.setOnClickListener(this);

        mNextAct7.setOnClickListener(this);
        mNextAct8.setOnClickListener(this);
        mNextAct9.setOnClickListener(this);
        mNextAct10.setOnClickListener(this);
        mNextAct11.setOnClickListener(this);
        mNextAct12.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        if (isBackBtnPressed) {
            finish();
        } else {
            isBackBtnPressed = true;
            Toast.makeText(this, "Нажмите еще раз для выхода", Toast.LENGTH_SHORT).show();

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isBackBtnPressed = false;
                }
            }, 2000);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
