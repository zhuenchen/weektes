package com.example.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        String url="http://172.17.8.100/images/movie/stills/ftfb3/ftfb(3)1.jpg";
        String ur="http://172.17.8.100/images/movie/stills/hjxd/hjxd1.jpg";
        String urs="http://172.17.8.100/images/movie/stills/ws/ws1.jpg";
        String ur4="http://172.17.8.100/images/movie/stills/wbsys/wbsys1.jpg";
        Glide.with(this).load(url).into(image1);
        Glide.with(this).load(ur).into(image2);
        Glide.with(this).load(urs).into(image3);
        Glide.with(this).load(urs).into(image3);
        Glide.with(this).load(ur4).into(image4);
    }
    private void initView() {
        image1 = findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
    }
}
