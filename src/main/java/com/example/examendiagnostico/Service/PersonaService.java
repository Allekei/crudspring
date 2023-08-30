package com.example.examendiagnostico.Service;

import com.example.examendiagnostico.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> ConsultarPersona();
    public Persona CrearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminarPersona(int id);

}
