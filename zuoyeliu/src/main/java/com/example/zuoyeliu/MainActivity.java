package com.example.zuoyeliu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText ed_text;
    private Button btn_seach;
    private List<String> list = new ArrayList<>();
    private com.example.zuoyeliu.liushi liushi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_text = findViewById(R.id.ed_text);
        btn_seach = findViewById(R.id.btn_seach);
        liushi = findViewById(R.id.layout_view);
        btn_seach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String trim = ed_text.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    if (list.contains(trim)) {
                        list.remove(trim);
                    }
                    list.add(0, trim);
                    liushi.setList(list);
                }
            }
        });
    }
}
