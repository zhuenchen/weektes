package com.example.day2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/12 9:04
 * @Description：描述信息
 */
public class shouye extends Fragment {
    private Button button1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shoye, container, false);
        button1=view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"账号或密码不正确",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
