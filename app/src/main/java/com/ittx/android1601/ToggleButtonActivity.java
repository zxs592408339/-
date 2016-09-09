package com.ittx.android1601;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
    public ToggleButton mToggleBtn;
    public Switch mSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_layout);

        mToggleBtn = (ToggleButton) findViewById(R.id.widget_togglebtn);
        mSwitch = (Switch) findViewById(R.id.widget_switch);

        mToggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"打开",Snackbar.LENGTH_SHORT).show();
                }else {
                    Snackbar.make(buttonView, "关闭", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Snackbar.make(buttonView,"打开",Snackbar.LENGTH_SHORT).show();
                }else {
                    Snackbar.make(buttonView, "关闭", Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
