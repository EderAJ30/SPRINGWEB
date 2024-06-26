package fes.aragon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class Estudiante {
    private String matricula;
    private String nombre;
    private int edad;
    private List<Materia> materias=new ArrayList<>();

    public Estudiante(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setMaterias(Materia ... materias) {
        this.materias = Arrays.asList(materias);
    }
}
