package com.example.android.testchildren;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private LinearLayout mSimpleLay, mNotSimpleLay;

    private ImageView mNextAct, mNextAct2, mNextAct3, mNextAct4, mNextAct5, mNextAct6,
            mNextAct7, mNextAct8, mNextAct9, mNextAct10, mNextAct11, mNextAct12;

    private ToggleButton mHideSimple, mHideNotSimple;

    private boolean isBackBtnPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mHideSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean on = ((ToggleButton) v).isChecked();

                if (on) {
                    mSimpleLay.setVisibility(View.GONE);
                } else {
                    mSimpleLay.setVisibility(View.VISIBLE);
                }
            }
        });

        mHideNotSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean on = ((ToggleButton) v).isChecked();

                if (on) {
                    mNotSimpleLay.setVisibility(View.GONE);
                } else {
                    mNotSimpleLay.setVisibility(View.VISIBLE);
                }
            }
        });

        mNextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        mNextAct5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Colors.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
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


    public void onToastClick(View view) {
        Toast.makeText(getApplicationContext(), "В разработке", Toast.LENGTH_SHORT).show();
    }

    public void init() {
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
    }
}
