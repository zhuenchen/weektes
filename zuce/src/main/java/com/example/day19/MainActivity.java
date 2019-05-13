package com.example.day19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day19.presenter.IPresenter;
import com.example.day19.presenter.RegistPresenter;
import com.example.day19.view.IView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IView {
    private EditText et_userName;
    private EditText et_password;
    private Button btn_register;
    private Button button;
    private IPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mPresenter = new RegistPresenter(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点上了",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,denglu.class);
                startActivity(intent);
                finish();
        }
        });
    }
    private void initView() {
        et_userName = (EditText) findViewById(R.id.et_userName);
        et_password = (EditText) findViewById(R.id.et_password);
        btn_register = (Button) findViewById(R.id.btn_register);
        button = (Button) findViewById(R.id.button);
        btn_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
            String phone=et_userName.getText().toString().trim();
            String pwd=et_password.getText().toString().trim();
            if (TextUtils.isEmpty(phone)||TextUtils.isEmpty(pwd)){
                Toast.makeText(this,"用户名和密码不能为空`",Toast.LENGTH_LONG).show();

            }else {
                mPresenter.startRequest(phone,pwd);
            }
            break;
        }
    }

    @Override
    public void getResponse(String data) {
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
    }
}
