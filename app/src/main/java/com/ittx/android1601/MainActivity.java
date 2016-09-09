package com.ittx.android1601;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //将activity_main布局文件加载到activity界面上
    }

    public void onClickEventListener(View v) {
        Intent intent = new Intent(this, EventActivity.class);
        startActivity(intent);
    }

    public void onClickLinerLayoutListener(View v) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void onClickTextViewListener(View v) {
        Intent intent = new Intent(this, TextViewActivity.class);
        startActivity(intent);
    }

    public void onClickImageViewListener(View v) {
        Intent intent = new Intent(this, ImageViewActivity.class);
        startActivity(intent);
    }

    public void onClickButtonListener(View v) {
        Intent intent = new Intent(this, ButtonActivity.class);
        startActivity(intent);
    }

    public void onClickEditTextListener(View v) {
        Intent intent = new Intent(this, EditTextActivity.class);
        startActivity(intent);
    }
    public void onClickRadioButtonListener(View v) {
        Intent intent = new Intent(this, RadioButtonActivity.class);
        startActivity(intent);
    }
    public void onClickCheckBoxListener(View v) {
        Intent intent = new Intent(this, CheckBoxsActivity.class);
        startActivity(intent);
    }
    public void onClickToggleButtonListener(View v) {
        Intent intent = new Intent(this, ToggleButtonActivity.class);
        startActivity(intent);
    }
    public void onClickContentViewListener(View v) {
        Intent intent = new Intent(this, ContentViewActivity.class);
        startActivity(intent);
    }
    public void onClickCodeViewListener(View v) {
        Intent intent = new Intent(this, CodeActivity.class);
        startActivity(intent);
    }
}
