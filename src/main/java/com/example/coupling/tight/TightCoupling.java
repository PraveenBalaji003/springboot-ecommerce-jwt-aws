package com.example.coupling.tight;

public class TightCoupling {
    public static void main(String[] args){
        UserManager databaseProvider = new UserManager();
        databaseProvider.getUserInfo();
        //We can't able to call the web svc provider using the UserManager
    }
}
