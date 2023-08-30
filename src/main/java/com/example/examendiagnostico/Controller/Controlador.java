package com.example.examendiagnostico.Controller;

import com.example.examendiagnostico.Entity.Persona;
import com.example.examendiagnostico.Service.PersonaServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUD")
public class Controlador {

    @Autowired
    private PSIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){
        try {
            List<Persona> listaPersona = this.impl.ConsultarPersona();
            return ResponseEntity.ok(listaPersona);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al consultar personas: " + e.getMessage());
        }

    }

    @PostMapping
    @RequestMapping(value = "CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersonas(@RequestBody Persona persona) {
        try {
            Persona personaCreada = this.impl.CrearPersona(persona);
            return ResponseEntity.status(HttpStatus.CREATED).body(personaCreada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al consultar personas: " + e.getMessage());
        }
    }
    @PutMapping
    @RequestMapping(value = "ModificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Persona persona){
            try{
                Persona personaModificada = this.impl.modificarPersona(persona);
                return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
            }
            catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al consultar personas: " + e.getMessage());
            }
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        try {
            Persona persona = this.impl.BuscarPersona(id);
            return ResponseEntity.ok(persona);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al consultar personas: " + e.getMessage());

        }

    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        try{
            this.impl.EliminarPersona(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al consultar personas: " + e.getMessage());
        }

    }


}
