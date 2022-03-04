package com.api.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

    @Autowired
    ActorRepository actorRepository;

    @GetMapping("/actor/list")
    private List<Actor> listarActor(){
        
        return actorRepository.findAll() ;

    } 


    @GetMapping("/actor/apellido/{apellido}")
    private List<Actor> listarActor(@PathVariable("apellido") String apellido){        
        return actorRepository.buscarPorApellido(apellido) ;
    } 

    
}
