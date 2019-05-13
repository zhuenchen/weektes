package com.example.disanzhoulianxi.presenter;

import android.os.Handler;
import android.os.Message;

import com.example.disanzhoulianxi.bena.Result;
import com.example.disanzhoulianxi.core.DataCall;
import org.json.JSONException;

/**
 * @author dingtao
 * @date 2019/4/25 11:42
 * qq:1940870847
 */
public abstract class BasePresenter {

    private DataCall dataCall;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Result result = (Result)msg.obj;
            if (result.getStatus().equals("0000")) {
                dataCall.success(result.getResult());
            }else{
                dataCall.fail(result);
            }
        }
    };

    public BasePresenter(DataCall dataCall){
        this.dataCall = dataCall;
    }

    public void requestData(final Object...args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = handler.obtainMessage();
                Result result;
                try {
                    result = getModel(args);
                } catch (Exception e) {
                    result = new Result();
                    result.setMessage(e.getMessage());
                }
                message.obj = result;
                handler.sendMessage(message);
            }
        }).start();
    }

    abstract Result getModel(Object...args) throws Exception;

    public void unBind(){
        dataCall = null;
    }
}
