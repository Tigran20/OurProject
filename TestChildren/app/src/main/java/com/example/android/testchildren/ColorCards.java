package com.example.android.testchildren;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.testchildren.data.ColorsAdapter;

public class ColorCards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        ViewPager viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new ColorsAdapter(getSupportFragmentManager()));
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ColorCards.this, Colors.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
