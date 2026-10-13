package com.example.coupling.loose;

public class UserDatabaseProvider implements DataProvider{
    public String getUserDetails(){
        return "User Details: from postgres";
    }
}
