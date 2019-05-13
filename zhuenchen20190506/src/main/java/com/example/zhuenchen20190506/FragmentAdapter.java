package com.example.zhuenchen20190506;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/6 14:39
 * @Description：描述信息
 */
class FragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    public FragmentAdapter(FragmentManager fm, List<Fragment> list) {
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
