package com.example.day19.presenter;

import com.example.day19.view.IView;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/10 14:20
 * @Description：描述信息
 */
public interface IPresenter {
    void onAttch(IView iView);
    void startRequest(String userName,String pwd);
    void onDeAttch();
}
