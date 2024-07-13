package com.SibacodeAop.Aop.Service;


import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String mesajVer(String param) {
        System.out.println("Method mesaj verdi param: " + param);
        return param;
    }
}
