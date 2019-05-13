package com.example.weektest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private RadioGroup rg;
    private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.rg);
        vp=findViewById(R.id.vp);
        List<Fragment>list=new ArrayList<Fragment>();
        list.add(new wode());
        list.add(new shouye());
        //创建适配器
        MyFragmentAdapter  adapter=new MyFragmentAdapter(getSupportFragmentManager(),list);
        //设置适配器
        //vp.setAdapter(adapter);

        //滑动切换
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                rg.check(rg.getChildAt(i).getId());
            }
            @Override
            public void onPageSelected(int i) {

            }
            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
        //点击切换
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
