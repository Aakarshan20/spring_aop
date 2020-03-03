package com.it.test;

import com.it.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 測試AOP的配置
 */
public class AOPTest {
    public static void main(String[] args) {
        //1.獲取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.獲取對象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        //3.執行方法
        as.saveAccount();
        as.updateAccount(1);
        as.deleteAccount();
    }
}
