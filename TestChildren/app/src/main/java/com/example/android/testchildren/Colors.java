package com.example.android.testchildren;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Colors extends AppCompatActivity implements View.OnClickListener{

    private ImageView mNextAct;
    private ImageView mNextAct2;
    private ImageView mNextAct3;
    private ImageView mNextAct4;
    private ImageView mNextAct5;
    private ImageView mNextAct6;
    private ImageView mNextAct7;
    private ImageView mNextAct8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);

        mNextAct = findViewById(R.id.iv_1);
        mNextAct2 = findViewById(R.id.iv_2);
        mNextAct3 = findViewById(R.id.iv_3);
        mNextAct4 = findViewById(R.id.iv_4);
        mNextAct5 = findViewById(R.id.iv_5);
        mNextAct6 = findViewById(R.id.iv_6);
        mNextAct7 = findViewById(R.id.iv_7);
        mNextAct8 = findViewById(R.id.iv_8);

        mNextAct.setOnClickListener(this);
        mNextAct2.setOnClickListener(this);
        mNextAct3.setOnClickListener(this);
        mNextAct4.setOnClickListener(this);
        mNextAct5.setOnClickListener(this);
        mNextAct6.setOnClickListener(this);
        mNextAct7.setOnClickListener(this);
        mNextAct8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Colors.this, ColorCards.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Colors.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
