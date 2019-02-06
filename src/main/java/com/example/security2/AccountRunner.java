package com.example.security2;

import com.example.security2.account.Account;
import com.example.security2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account ws = accountService.createAccount("woosang","1234");
        System.out.println("usernmae : " + ws.getUsername() + ", pw : " + ws.getPassword());
    }
}
