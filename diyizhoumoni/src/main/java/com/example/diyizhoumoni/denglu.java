package com.example.diyizhoumoni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

import com.example.diyizhoumoni.fragment.shouye;
import com.example.diyizhoumoni.fragment.wode;

import java.util.ArrayList;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/13 10:07
 * @Description：描述信息
 */
public class denglu extends FragmentActivity {
    private ViewPager vp;
    private RadioGroup rg;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                    case R.id.dx11:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.dx22:
                        vp.setCurrentItem(1);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
