/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibero.crudmongo.service;

import com.ibero.crudmongo.model.Persona;
import com.ibero.crudmongo.model.api.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar
 */
@Service
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona() {
        return personaRepository.findAll();
    }
    
    @Override
    public Optional<Persona> getPersonaById(Long id) {
        return personaRepository.findById(id);
    }
    
    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }
    
    @Override
    public void deletePersonaById(Long id) {
        personaRepository.deleteById(id);
    }
}
