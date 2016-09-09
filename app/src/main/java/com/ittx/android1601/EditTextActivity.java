package com.ittx.android1601;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {
    public EditText mUserNameEdit, mZhangHaoEdit;
    public Button mLoginBtn;
    public TextView mShowMessgTxt;
    public RelativeLayout mZhanghaoLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_layout);
        mUserNameEdit = (EditText) findViewById(R.id.username_edit);
        mZhangHaoEdit = (EditText) findViewById(R.id.edit_zhanghao_edit);
        mLoginBtn = (Button) findViewById(R.id.login_btn);
        mShowMessgTxt = (TextView) findViewById(R.id.edit_show_message_txt);
        mZhanghaoLayout = (RelativeLayout) findViewById(R.id.edit_zhanghao_layout);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserNameEdit.getText().toString();
                if (userName.equals("admin")) {
                    mShowMessgTxt.setText("登录成功");
                } else {
                    mUserNameEdit.setError("用户名错误!");
                }
            }
        });

        mZhangHaoEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mZhanghaoLayout.setBackgroundResource(R.drawable.input_bar_bg_active);
                } else {
                    mZhanghaoLayout.setBackgroundResource(R.drawable.input_bar_bg_normal);
                }
            }
        });

        mUserNameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.println("beforeTextChanged s :" + s + " start :" + start + " count :" + count + " after :" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("onTextChanged s :" + s + " start :" + start + " before :" + before + " count :" + count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged s :" + s);
            }
        });
        mUserNameEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                System.out.println("hasFocus  :"+hasFocus);

            }
        });
    }
}
