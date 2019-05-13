package com.example.day19.model;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/10 14:10
 * @Description：描述信息
 */
public interface IModel {
    //请求数据接口，并返回数据,接口回调方法
    void requestData(String userName, String pwd,Callback callback);
    interface  Callback{
        void setData(String info);
    }
}
