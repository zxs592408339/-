package com.ittx.android1601;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class ContentViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      findViewById(android.R.id.content).setBackgroundColor(Color.BLUE);

        View v = LayoutInflater.from(this).inflate(R.layout.activity_content_view_layout, null);
        setContentView(v);

        View sv = LayoutInflater.from(this).inflate(R.layout.subcontent_view, null);
        TextView text = (TextView) sv.findViewById(R.id.sub_textview);
        text.setBackgroundColor(Color.DKGRAY);

        addContentView(sv, new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.WRAP_CONTENT, LinearLayoutCompat.LayoutParams.WRAP_CONTENT));

    }

}
