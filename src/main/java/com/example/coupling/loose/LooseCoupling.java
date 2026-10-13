package com.example.coupling.loose;

public class LooseCoupling {
    public static void main(String[] args){
        DataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDatabaseProvider);
        userManager.getUserInfo();
        DataProvider userWebSvcProvider = new UserWebSvcProvider();
        userManager = new UserManager(userWebSvcProvider);
        userManager.getUserInfo();
    }
}
