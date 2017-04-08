package com.example.android.newbumap;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*This is the image activity that is first created to post the building images. It creates and
* calls CustomSwipeAdapter that then controls the activity. It passes the spinner information to
* CustomSwipeAdapter.*/

public class ImageActivity extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    String spinner1,spinner2,spinner3,spinner4,spinner5,spinner6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        spinner1 = intent.getStringExtra("spinner1");
        spinner2 = intent.getStringExtra("spinner2");
        spinner3 = intent.getStringExtra("spinner3");
        spinner4 = intent.getStringExtra("spinner4");
        spinner5 = intent.getStringExtra("spinner5");
        spinner6 = intent.getStringExtra("spinner6");

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this,spinner1,spinner2,spinner3,spinner4,spinner5,spinner6);
        viewPager.setAdapter(adapter);
    }

}
