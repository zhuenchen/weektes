package com.example.zhuenchen190415.mvp.model;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/15 9:02
 * @Description：描述信息
 */
public interface MainModel {
    interface CallBackListener {
        void success(String data);
        void fail();
    }
    void getData(CallBackListener listener);
}

