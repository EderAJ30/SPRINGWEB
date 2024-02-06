package fes.aragon.service;

import fes.aragon.model.Persona;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements PersonaService{
    private ArrayList<Persona> personas = new ArrayList<>();
    @Override
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }
    @Override
    public List<Persona> getLista() {
        return null;
    }
    @Override
    public void setLista(List<Persona> lista) {

    }
    @Override
    public ArrayList<Persona> obtenerPersonas() {
        return this.personas;
    }
    @Override
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}