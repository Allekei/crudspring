package com.example.examendiagnostico.Repository;

import com.example.examendiagnostico.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona,Integer> {
}
