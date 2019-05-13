package com.example.day2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/12 9:04
 * @Description：描述信息
 */
public class wode extends Fragment {
    private TextView tx1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wode, container, false);


        return view;
    }
    private void initView(){

    }
}
