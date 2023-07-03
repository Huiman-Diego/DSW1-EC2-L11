package com.example.DSW1EC2L11;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/ec2")
public class controller{

    @GetMapping(path="/idat")
    public String Home() {
        return "A19104002 - Diego Ñontol Huiman";
    }

    @GetMapping(path="/nombre")
    public String Nombre() {
        return "Diego Ñontol Huiman";
    }

    @GetMapping(path="/codigo")
    public String Codigo() {
        return "A19104002";
    }

}