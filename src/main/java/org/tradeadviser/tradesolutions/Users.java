package org.tradeadviser.tradesolutions;

class Users {
    String role;
    String Image;
    private String userName;

    public String getRole() {
        return role;
    }

    public String getImage() {
        return Image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsername() {
        return userName;

    }

    public void setUsername(String username) {
        this.userName = username;}

    public void setPassword(String text) {
        this.userName = text;

    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setImage(String image) {
        this.Image = image;}

    public void RememberMe(boolean selected) {
        if (selected) {
            System.out.println("Remember Me");
        }
    }

    public boolean isValid() {
        return userName!= null && userName.length() > 0;

    }
}
/*
 * Licensed to the Apache Software Foundation (ASF) under one
*/
