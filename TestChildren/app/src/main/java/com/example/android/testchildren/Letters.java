package com.example.android.testchildren;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Letters extends AppCompatActivity implements View.OnClickListener{

    private ImageView mNextAct, mNextAct2, mNextAct3, mNextAct4, mNextAct5, mNextAct6,
                      mNextAct7, mNextAct8, mNextAct9, mNextAct10, mNextAct11, mNextAct12,
                      mNextAct13, mNextAct14, mNextAct15, mNextAct16, mNextAct17, mNextAct18,
                      mNextAct19, mNextAct20, mNextAct21, mNextAct22, mNextAct23, mNextAct24,
                      mNextAct25, mNextAct26, mNextAct27, mNextAct28, mNextAct29,
                      mNextAct30, mNextAct31,  mNextAct32, mNextAct33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.letters);

        init();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Letters.this, LetterCards.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Letters.this, SecondScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void init() {
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
        mNextAct13 = findViewById(R.id.iv_13);
        mNextAct14 = findViewById(R.id.iv_14);
        mNextAct15 = findViewById(R.id.iv_15);
        mNextAct16 = findViewById(R.id.iv_16);
        mNextAct17 = findViewById(R.id.iv_17);
        mNextAct18 = findViewById(R.id.iv_18);
        mNextAct19 = findViewById(R.id.iv_19);
        mNextAct20 = findViewById(R.id.iv_20);
        mNextAct21 = findViewById(R.id.iv_21);
        mNextAct22 = findViewById(R.id.iv_22);
        mNextAct23 = findViewById(R.id.iv_23);
        mNextAct24 = findViewById(R.id.iv_24);
        mNextAct25 = findViewById(R.id.iv_25);
        mNextAct26 = findViewById(R.id.iv_26);
        mNextAct27 = findViewById(R.id.iv_27);
        mNextAct28 = findViewById(R.id.iv_28);
        mNextAct29 = findViewById(R.id.iv_29);
        mNextAct30 = findViewById(R.id.iv_30);
        mNextAct31 = findViewById(R.id.iv_31);
        mNextAct32 = findViewById(R.id.iv_32);
        mNextAct33 = findViewById(R.id.iv_33);

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
        mNextAct13.setOnClickListener(this);
        mNextAct14.setOnClickListener(this);
        mNextAct15.setOnClickListener(this);
        mNextAct16.setOnClickListener(this);
        mNextAct17.setOnClickListener(this);
        mNextAct18.setOnClickListener(this);
        mNextAct19.setOnClickListener(this);
        mNextAct20.setOnClickListener(this);
        mNextAct21.setOnClickListener(this);
        mNextAct22.setOnClickListener(this);
        mNextAct23.setOnClickListener(this);
        mNextAct24.setOnClickListener(this);
        mNextAct25.setOnClickListener(this);
        mNextAct26.setOnClickListener(this);
        mNextAct27.setOnClickListener(this);
        mNextAct28.setOnClickListener(this);
        mNextAct29.setOnClickListener(this);
        mNextAct30.setOnClickListener(this);
        mNextAct31.setOnClickListener(this);
        mNextAct32.setOnClickListener(this);
        mNextAct33.setOnClickListener(this);
    }


}
