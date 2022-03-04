package com.api.mysql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ActorRepository extends JpaRepository<Actor,Integer>{
    

    @Query(value = "SELECT * FROM actor WHERE last_name = :apellido", nativeQuery = true)
    List<Actor> buscarPorApellido(@Param("apellido") String apellido);

}
