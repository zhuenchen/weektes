package com.example.day07;

import android.animation.ObjectAnimator;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_py,btn_xz,btn_sf,btn_jb;
    MyView myView;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_py=findViewById(R.id.btn_py);
        btn_sf=findViewById(R.id.btn_sf);
        btn_xz=findViewById(R.id.btn_xz);
        btn_jb=findViewById(R.id.btn_jb);
        myView=findViewById(R.id.my_view);
        btn_py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"111",Toast.LENGTH_LONG).show();
                float translationX=myView.getTranslationX();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"translationX",0,200);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
            }
        });
        btn_sf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float scaleX = myView.getScaleX();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"scaleX",0.5f);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
            }
        });
        btn_xz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                float rotationX = myView.getRotationX();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"rotationX",360*i);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
            }
        });
        btn_jb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float alpha = myView.getAlpha();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"alpha",1,0);
                objectAnimator.setDuration(2000);
                objectAnimator.start();
            }
        });
    }
}
