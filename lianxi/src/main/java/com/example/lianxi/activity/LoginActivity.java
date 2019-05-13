package com.example.lianxi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lianxi.R;
import com.example.lianxi.bean.Result;
import com.example.lianxi.bean.User;
import com.example.lianxi.core.DataCall;
import com.example.lianxi.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,
        DataCall<User> {

    private EditText mMobile,mPassword;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mMobile = findViewById(R.id.login_mobile);
        mPassword = findViewById(R.id.login_pas);

        findViewById(R.id.login_btn).setOnClickListener(this);
        findViewById(R.id.login_reg).setOnClickListener(this);
        findViewById(R.id.login_qq_btn).setOnClickListener(this);

        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.login_btn) {//点击登录按钮
            final String mobile = mMobile.getText().toString();
            final String password = mPassword.getText().toString();

            if (!StringUtil.isPhone(mobile)){
                Toast.makeText(this,"请输入正确手机号",Toast.LENGTH_LONG).show();
                return;
            }
//            if (password.length()<6){
//                Toast.makeText(this,"密码最少6位",Toast.LENGTH_LONG).show();
//                return;
//            }

            //登录请求
            loginPresenter.requestData(mobile,password);

        }else if (v.getId()==R.id.login_reg){//点击注册按钮
            Intent intent = new Intent(this,RegActivity.class);
            startActivity(intent);
        }else if(v.getId()==R.id.login_qq_btn){
        }

    }

    @Override
    public void success(User result) {
        Toast.makeText(this,result.getUserId()+"  "+result.getSessionId(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void fail(Result result) {
        Toast.makeText(this,"失败："+result.getMessage(),Toast.LENGTH_LONG).show();
    }
}
