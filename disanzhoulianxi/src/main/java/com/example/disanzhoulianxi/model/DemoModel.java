package com.example.disanzhoulianxi.model;

import com.example.disanzhoulianxi.bena.Result;
import com.example.disanzhoulianxi.bena.User;
import com.example.disanzhoulianxi.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;

import java.lang.reflect.Type;

/**
 * @author dingtao
 * @date 2019/4/25 11:59
 * qq:1940870847
 * 请求数据，进行解析，封装成bean对象
 */
public class DemoModel {

    public static Result login(final String mobile, final String password) throws JSONException {
        String result = HttpUtil.getInstance().postByOKHttp(
//                "http://mobile.bwstudent.com/small/user/v1/login",
                "http://172.17.8.100/small/user/v1/login",
                new String[]{"phone","pwd"},
                new String[]{mobile,password});
        if (result!=null) {
//            JSONObject jsonObject = new JSONObject(result);
//            data.setStatus(jsonObject.getString("status"));
//            data.setMessage(jsonObject.getString("message"));
//            jsonObject.getJSONObject("result");
//            jsonObject.getJSONArray("result")
            Type type = new TypeToken<Result<User>>() {}.getType();
            Gson gson = new Gson();
            Result<User> data = gson.fromJson(result,type);
            return data;
        }
        return new Result();
    }

    public static Result register(final String mobile,final String password) throws JSONException {
        String result = HttpUtil.getInstance().postByOKHttp(
                "http://172.17.8.100/small/user/v1/register",
                new String[]{"phone","pwd"},
                new String[]{mobile,password});
        if (result!=null) {
            Type type = new TypeToken<Result<User>>() {}.getType();
            Gson gson = new Gson();
            Result<User> data = gson.fromJson(result,type);
            return data;
        }
        return new Result();
    }

}
