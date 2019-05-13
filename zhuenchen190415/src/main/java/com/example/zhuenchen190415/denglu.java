package com.example.zhuenchen190415;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/15 9:36
 * @Description：描述信息
 */
public class denglu extends MainActivity{
    private TextView text01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denglu);
        text01=findViewById(R.id.text01);
        text01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(denglu.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
