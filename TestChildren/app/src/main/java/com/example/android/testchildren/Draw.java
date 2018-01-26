package com.example.android.testchildren;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Draw extends AppCompatActivity{

    private TextView mDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_activity);

        mDraw = (TextView) findViewById(R.id.letter);
        mDraw.setText("А");
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Draw.this, SecondScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
