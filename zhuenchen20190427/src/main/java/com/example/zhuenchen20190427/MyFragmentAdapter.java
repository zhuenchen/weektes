package com.example.zhuenchen20190427;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/27 9:18
 * @Description：描述信息
 */
class MyFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    public MyFragmentAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
