/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ibero.crudmongo.model.api;

import com.ibero.crudmongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Cesar
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
