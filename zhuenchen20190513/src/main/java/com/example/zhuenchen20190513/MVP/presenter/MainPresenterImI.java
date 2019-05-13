package com.example.zhuenchen20190513.MVP.presenter;
import com.example.zhuenchen20190513.MVP.model.MainModel;
import com.example.zhuenchen20190513.MVP.view.MainView;
/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/13 9:00
 * @Description：描述信息
 */
public class MainPresenterImI implements MainPresenter,MainModel.CallBackListener{
    private MainModel mainModel;
    private MainView mainView;
    public MainPresenterImI(MainModel mainModel, MainView mainView) {
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
