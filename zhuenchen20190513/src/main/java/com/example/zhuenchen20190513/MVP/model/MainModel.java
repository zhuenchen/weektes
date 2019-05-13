package com.example.zhuenchen20190513.MVP.model;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/13 8:56
 * @Description：描述信息
 */
public interface MainModel {
    interface CallBackListener {
        void success(String data);
        void fail();
    }

    void getData(CallBackListener listener);
}
