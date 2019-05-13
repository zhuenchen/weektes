package com.example.day19.presenter;

import com.example.day19.model.IModel;
import com.example.day19.model.RegisterImpl;
import com.example.day19.view.IView;
import java.util.List;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/10 14:21
 * @Description：描述信息
 */
public class RegistPresenter implements IPresenter{
    private IModel miModel;
    private IView miView;
    private List mlist;
    public RegistPresenter(IView iView){
        miModel=new RegisterImpl();
        this.miView=iView;
    }
    @Override
    public void onAttch(IView iView) {
        this.miView=iView;
    }

    @Override
    public void startRequest(String userName, String pwd) {
        miModel.requestData(userName, pwd, new IModel.Callback() {
            @Override
            public void setData(String info) {
                miView.getResponse(info);
            }
        });
    }
    @Override
    //防止内存泄漏
    public void onDeAttch() {
        if (miModel!=null){
            miModel=null;
        }if (miView!=null){
            miView=null;
        }
    }
}
