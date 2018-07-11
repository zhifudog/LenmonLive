/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2018/7/8 22:43
 * Description: user
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.User.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈user〉
 *
 * @author Administrator
 * @create 2018/7/8
 * @since 1.0.0
 */
public class User {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String id;
    private String email;
    private String phoneNumber;
    private String userName;
    private String passWd;
    private String sex;


}