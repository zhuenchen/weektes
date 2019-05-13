package com.example.zhuenchen20190506;

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
 * @Date：2019/5/6 14:34
 * @Description：描述信息
 */
public class gouwu extends Fragment {
    private Button button3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gouwu, container, false);
        button3=view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"竹恩晨",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
