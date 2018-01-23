package com.robert.ms.dto;

public class UserQueryDto extends BasePageDto{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
