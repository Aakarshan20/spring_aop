package com.it.service;

/**
 * 帳號的業務層接口
 */
public interface IAccountService {
    /**
     * 模擬保存帳戶
     */
    void saveAccount();

    /**
     * 模擬更新帳戶
     * @param i
     */
    void updateAccount(int i);

    /**
     * 刪除帳戶
     * @return
     */
    int deleteAccount();
}
