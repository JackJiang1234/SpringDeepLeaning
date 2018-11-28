package com.jack;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {
    public static void main(String[] args){
        User user = new User();

        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(user);
        bw.setPropertyValue("userName", "jack");
        System.out.println(user.getUserName());

        PropertyValue value = new PropertyValue("userName", "eric");
        bw.setPropertyValue(value);
        System.out.println(user.getUserName());
    }
}

class User{
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String userName;
}
