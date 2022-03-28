package com.example.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloResource {
    public String hello();
}