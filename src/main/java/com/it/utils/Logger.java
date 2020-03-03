package com.it.utils;

/**
 * 用於記錄日誌的工具類 提供了公共的代碼
 */
public class Logger {
    /**
     * 用於打印日誌 計畫讓其在切入點方法執行之前執行(切入點方法就是業務層方法)
     */
    public void printLog(){
        System.out.println("Logger類中的printLog方法開始記錄日誌了");
    }
}
