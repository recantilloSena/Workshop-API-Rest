package com.api.basica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

    @GetMapping("/api/hola")
    String holaMundoRest(){
        return "Hola Rest";
    }

    @GetMapping("/api/sumar/{n1}/{n2}")
    Integer sumarNumeros(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2){
        return n1 + n2;
    }



}
