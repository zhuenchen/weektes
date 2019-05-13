package com.example.zhuenchen20190427;
import android.animation.ObjectAnimator;
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
 * @Date：2019/4/27 9:12
 * @Description：描述信息
 */
public class wode extends Fragment {
    private Button button1;
    private Button button2;
    MyView myView;
    int i=0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wode, container, false);
        button1=view.findViewById(R.id.button1);
        button2=view.findViewById(R.id.button2);
        myView=view.findViewById(R.id.my_view);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"这是属性动画",Toast.LENGTH_LONG).show();
                float translationY = myView.getTranslationY();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"translationY",0,200);
                objectAnimator.setDuration(3000);
                objectAnimator.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                float rotationX = myView.getRotationX();
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(myView,"rotationX",360*i);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
            }
        });
        return view;
    }
}
