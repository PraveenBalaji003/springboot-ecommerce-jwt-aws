package com.example.coupling.tight;

public class UserManager {
    private final UserDatabaseProvider userDatabaseProvider = new UserDatabaseProvider();

    public void getUserInfo(){
        System.out.println(userDatabaseProvider.getUserDetails());
    }
}
