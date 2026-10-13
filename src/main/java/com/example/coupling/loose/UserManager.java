package com.example.coupling.loose;

public class UserManager {
    private final DataProvider dataProvider;

    public UserManager(DataProvider dataProvider){
        this.dataProvider = dataProvider;
    }

    public void getUserInfo() {
        System.out.println(dataProvider.getUserDetails());

    }
}
