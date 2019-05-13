package com.example.zuoyeliu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/23 21:09
 * @Description：描述信息
 */
public class liushi extends RelativeLayout {
    private Context context;
    private LinearLayout linearLayout_v;
    private LinearLayout linearLayout_h;

    public liushi(Context context) {
        super(context);
        init(context);
    }
    public liushi(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    //初始化视图
    private void init(Context context) {
        this.context=context;
        //第一步创建垂直的视图
        View view = View.inflate(context, R.layout.layout_v, null);
        linearLayout_v = view.findViewById(R.id.layout_all);
        addView(view);
    }
    //传递数据
    private List<String> lists = new ArrayList<>();
    public void setList(List<String> list) {
        lists = list;
        int len = 0;
        linearLayout_v.removeAllViews();
        linearLayout_h = (LinearLayout) View.inflate(context,R.layout.layout_hh,null);
        linearLayout_v.addView(linearLayout_h);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            len += s.length();
            if (len > 20) {
                linearLayout_h = (LinearLayout) View.inflate(context,R.layout.layout_hh,null);
                linearLayout_v.addView(linearLayout_h);
                len = 0;
            }
           final View layout_text=View.inflate(context,R.layout.layout_text,null);
            final TextView textView = layout_text.findViewById(R.id.textview);
            textView.setText(list.get(i));
            linearLayout_h.addView(layout_text);

            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout_text.getLayoutParams();
            layoutParams.rightMargin = 10;
            layoutParams.topMargin = 10;
            layoutParams.leftMargin = 10;
            layoutParams.weight = 1;
            layout_text.setLayoutParams(layoutParams);
            layout_text.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,textView.getText(),Toast.LENGTH_LONG).show();
                }
            });
            //长按删除
            layout_text.setOnLongClickListener(new OnLongClickListener() {
                        @Override
                        public boolean onLongClick(View v) {
                            String con = textView.getText().toString();//获取到内容
                            lists.remove(con);
                            setList(lists);
                            return true;
                }
            });
        }

    }

}
