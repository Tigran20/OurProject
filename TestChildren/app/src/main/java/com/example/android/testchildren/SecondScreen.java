package com.example.android.testchildren;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;


public class SecondScreen extends AppCompatActivity{

    private final static String TAG = "FB_SESOND_SCREEN";

    private FirebaseAnalytics mFirebaseAnalytics;
    private ImageView mAlphabet;
    private ImageView mDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mAlphabet = findViewById(R.id.iv_alphabet);
        mDraw = findViewById(R.id.iv_draw);

        mAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle params = new Bundle();
                params.putInt("ButtonID", v.getId());
                String btnName = "mAlphabetIntentBtn";

                Intent intent = new Intent(SecondScreen.this, Letters.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

                Log.d(TAG, "Button click logged " + btnName);
            }
        });

        mDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle params = new Bundle();
                params.putInt("ButtonID", v.getId());
                String btnName = "mDrawIntentBtn";

                Intent intent = new Intent(SecondScreen.this, Draw.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

                Log.d(TAG, "Button click logged " + btnName);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SecondScreen.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
