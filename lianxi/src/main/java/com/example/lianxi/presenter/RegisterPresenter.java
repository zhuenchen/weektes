package com.example.lianxi.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.lianxi.bean.Result;
import com.example.lianxi.core.DataCall;
import com.example.lianxi.model.DemoModel;

import org.json.JSONException;

/**
 * @author dingtao
 * @date 2019/4/25 11:42
 * qq:1940870847
 */
public class RegisterPresenter extends BasePresenter {

    public RegisterPresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    Result getModel(Object... args) throws Exception {
        return DemoModel.register((String)args[0],(String)args[1]);
    }
}
