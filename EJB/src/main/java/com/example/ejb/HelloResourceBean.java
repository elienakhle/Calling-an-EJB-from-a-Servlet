package com.example.ejb;
import javax.ejb.Stateless;
@Stateless
public class HelloResourceBean implements HelloResource {
    @Override
    public String hello() {
        return "HelloWorld from stateless session bean";
    }
}
