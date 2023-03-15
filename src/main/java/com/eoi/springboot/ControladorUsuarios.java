package com.eoi.springboot;

import org.springframework.web.bind.annotation.RequestMapping;

public class ControladorUsuarios {


    @RequestMapping("/")
    String hellow(){
        return "Hello world!";
    }
    @RequestMapping("/hola")
    String hola(){
        return "Hola mundo!";
    }

    @RequestMapping("/mimedicacion")
    String mimedicacion(){
        return "Tomate las pastillas!";
    }
}
