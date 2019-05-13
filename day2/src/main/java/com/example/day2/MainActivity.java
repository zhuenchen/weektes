package com.example.day2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
    private ViewPager vp;
    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.vp);
        rg=findViewById(R.id.rg);
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new shouye());
        list.add(new wode());
        MyFragmentAdapter adapter=new MyFragmentAdapter(getSupportFragmentManager(),list);
        vp.setAdapter(adapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                rg.check(rg.getChildAt(i).getId());
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.dx1:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.dx2:
                        vp.setCurrentItem(1);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
