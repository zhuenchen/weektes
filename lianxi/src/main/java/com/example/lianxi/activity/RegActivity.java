package com.example.lianxi.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lianxi.R;
import com.example.lianxi.bean.Result;
import com.example.lianxi.bean.User;
import com.example.lianxi.core.DataCall;
import com.example.lianxi.presenter.RegisterPresenter;

/**
 * @author dingtao
 * @date 2018/12/7 14:49
 * qq:1940870847
 */
public class RegActivity extends AppCompatActivity implements View.OnClickListener,DataCall<User> {

    private EditText mMobile,mPas;

    private RegisterPresenter presenter = new RegisterPresenter(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        mMobile = findViewById(R.id.reg_mobile);
        mPas = findViewById(R.id.reg_pas);
        findViewById(R.id.reg_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String mobile = mMobile.getText().toString();
        String pas = mPas.getText().toString();
        if (!StringUtil.isPhone(mobile)){
            Toast.makeText(this,"请输入正确手机号",Toast.LENGTH_LONG).show();
            return;
        }
        if (pas.length()<6){
            Toast.makeText(this,"密码最少6位",Toast.LENGTH_LONG).show();
            return;
        }
        presenter.requestData(mobile,pas);
    }

    @Override
    public void success(User data) {
        Toast.makeText(this,"注册成功，请登录",Toast.LENGTH_LONG).show();
        finish();
    }

    @Override
    public void fail(Result result) {
        Toast.makeText(this,result.getMessage(),Toast.LENGTH_LONG).show();
    }
}
