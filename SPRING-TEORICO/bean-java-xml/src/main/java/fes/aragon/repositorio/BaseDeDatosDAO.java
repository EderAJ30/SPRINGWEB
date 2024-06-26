package fes.aragon.repositorio;

import fes.aragon.model.Estudiante;

import java.util.List;

public interface BaseDeDatosDAO {
    List<Estudiante> getEstudiante(String carrera);
    Estudiante getEstudiante(String carrera, String matricula);
}
