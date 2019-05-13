package com.example.zhuenchen190415;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private EditText ed1;
    private EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"跳转到注册页面",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,zhuce.class);
                startActivity(intent);
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = ed1.getText().toString();
                if(txt.length() == 0){
                    Toast.makeText(MainActivity.this,"账号和密码不能输入为空",0).show();    //弹出一个自动消失的提示框
                    return;
                }else {
                    Toast.makeText(MainActivity.this,"跳转到登录页面",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(MainActivity.this,denglu.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
