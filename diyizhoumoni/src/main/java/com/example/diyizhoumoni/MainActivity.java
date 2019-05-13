package com.example.diyizhoumoni;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"跳转登录页面",Toast.LENGTH_LONG).show();
               Intent intent=new Intent(MainActivity.this,denglu.class);
                startActivity(intent);
                finish();
           }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"跳转注册页面",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,zhuce.class);
                startActivity(intent);
            }
        });

    }
}
