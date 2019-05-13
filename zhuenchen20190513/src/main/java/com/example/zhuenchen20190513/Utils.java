package com.example.zhuenchen20190513;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author：竹恩晨
 * @E-mail：
 * @Date：2019/5/13 9:52
 * @Description：描述信息
 */
public class Utils {
    public static String getUrlConnect(String urlPath) {
        try {
            //创建URL
            URL url = new URL(urlPath);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            //设置连接
            httpURLConnection.connect();
            //判断响应码  200 代表成功
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream in = httpURLConnection.getInputStream();
                StringBuffer sb = new StringBuffer();
                byte[] buff = new byte[1024];
                int len = -1;
                while ((len = in.read(buff)) != -1) {
                    sb.append(new String(buff, 0, len, "utf-8"));
                }
                in.close();
                httpURLConnection.disconnect();
                return sb.toString();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

