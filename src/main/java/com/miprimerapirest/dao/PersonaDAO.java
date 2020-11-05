package com.miprimerapirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miprimerapirest.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
