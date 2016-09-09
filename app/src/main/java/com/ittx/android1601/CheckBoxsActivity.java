package com.ittx.android1601;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxs_layout);
    }

    public void onClickCheckBoxsListener(View v) {
        CheckBox checkBox = (CheckBox) v;
        switch (v.getId()) {
            case R.id.checkbox_lookbook:
                if(checkBox.isChecked()){
                    Snackbar.make(v,checkBox.getText()+"选中",Snackbar.LENGTH_SHORT).show();
                }else{
                    Snackbar.make(v,checkBox.getText()+"未选中",Snackbar.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_write:
                if(checkBox.isChecked()){
                    Snackbar.make(v,checkBox.getText()+"选中",Snackbar.LENGTH_SHORT).show();
                }else{
                    Snackbar.make(v,checkBox.getText()+"未选中",Snackbar.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_drawing:
                if(checkBox.isChecked()){
                    Toast.makeText(this,checkBox.getText()+"选中",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,checkBox.getText()+"未选中",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
