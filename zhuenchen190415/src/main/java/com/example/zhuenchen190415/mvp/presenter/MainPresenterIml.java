package com.example.zhuenchen190415.mvp.presenter;

import com.example.zhuenchen190415.mvp.model.MainModel;
import com.example.zhuenchen190415.mvp.view.MainView;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/4/15 9:08
 * @Description：描述信息
 */
public class MainPresenterIml implements  MainPresenter,MainModel.CallBackListener{
    private MainModel mainModel;
    private MainView mainView;

    public MainPresenterIml(MainModel mainModel, MainView mainView) {
        this.mainModel = mainModel;
        this.mainView = mainView;
    }
    @Override
    public void success(String data) {
        mainView.success(data);
    }

    @Override
    public void fail() {
        mainView.fail();
    }

    @Override
    public void doData() {
        mainModel.getData(this);
    }
    //解决内存泄漏
    public void destroy() {
        if (mainView != null) {
            mainView = null;
        }
        if (mainModel != null) {
            mainModel = null;
        }
        System.gc();
    }
}
