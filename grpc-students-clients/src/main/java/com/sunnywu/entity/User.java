package com.sunnywu.entity;/**
 * Created by sunny
 * 2019/3/23.
 */

/**
 *
 * @author
 * @create 2019-03-23 23:14
 **/
public class User {

    private int id;
    private String userName;
    private int userAge;
    private String mobile;
    private  String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
