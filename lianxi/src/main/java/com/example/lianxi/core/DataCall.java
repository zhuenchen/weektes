package com.example.lianxi.core;

import com.example.lianxi.bean.Result;
/**
 * @author dingtao
 * @date 2019/4/25 11:43
 * qq:1940870847
 */
public interface DataCall<T> {
    void success(T result);
    void fail(Result result);
}
