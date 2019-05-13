package com.example.zhuenchen20190506;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/6 14:34
 * @Description：描述信息
 */
public class shouye extends Fragment {
    private EditText ed1;
    private Button button4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shouye, container, false);
        ed1=view.findViewById(R.id.ed1);
        button4=view.findViewById(R.id.button4);
        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"ssss",Toast.LENGTH_LONG).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),shousuo.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
