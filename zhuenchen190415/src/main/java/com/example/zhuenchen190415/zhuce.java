package com.example.zhuenchen190415;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/15 9:25
 * @Description：描述信息
 */
public class zhuce extends MainActivity{
    private Button button22;
    private Button button11;
    private EditText ed11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce);
        button22=findViewById(R.id.button22);
        button11=findViewById(R.id.button11);
        ed11=findViewById(R.id.ed11);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = ed11.getText().toString();
                if(txt.length() == 0) {
                    Toast.makeText(zhuce.this, "注册信息不能为空", Toast.LENGTH_LONG).show();    //弹出一个自动消失的提示框
                    return;
                }else {
                    Toast.makeText(zhuce.this,"注册失败",Toast.LENGTH_LONG).show();
                }

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(zhuce.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
