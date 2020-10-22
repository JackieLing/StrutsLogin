package com.linghu.controller;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class LoginTest implements Action {
    public String execute(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (("admin".equals(username))&&("12345").equals(password))
        {
            System.out.println("密码登录成功");
            return "OK";
        }else {
            System.out.println("登录失败");
            return "erro";
        }

    }
    @Override
    public Object getValue(String s) {
        return null;
    }

    @Override
    public void putValue(String s, Object o) {

    }

    @Override
    public void setEnabled(boolean b) {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
