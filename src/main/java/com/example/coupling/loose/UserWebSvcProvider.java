package com.example.coupling.loose;

public class UserWebSvcProvider implements DataProvider {
    public String getUserDetails(){
        return "User Details: from web svc";
    }
}
