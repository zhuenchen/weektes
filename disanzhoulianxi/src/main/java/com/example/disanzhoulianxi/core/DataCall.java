package com.example.disanzhoulianxi.core;

import com.example.disanzhoulianxi.bena.Result;

/**
 * @author dingtao
 * @date 2019/4/25 11:43
 * qq:1940870847
 */
public interface DataCall<T> {
    void success(T result);
    void fail(Result result);
}
