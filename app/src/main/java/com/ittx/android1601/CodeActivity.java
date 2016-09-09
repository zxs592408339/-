package com.ittx.android1601;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LayoutInflater layoutInflater =  LayoutInflater.from(this);
//        LinearLayout view = (LinearLayout) layoutInflater.inflate(R.layout.activity_code_layout,null);
//        setContentView(view);

        setContentView(R.layout.activity_code_layout);
    }

    public void code() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        TextView textView = new TextView(this);
        textView.setText("代码实现布局");
        textView.setTextColor(Color.RED);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(textView);

        Button button = new Button(this);
        button.setTextColor(Color.DKGRAY);
        button.setText("按钮");
        button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(button);

        setContentView(linearLayout);

    }
}
