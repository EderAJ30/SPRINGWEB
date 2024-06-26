package fes.aragon.repositorio;

import fes.aragon.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BaseDeDatosDAO")
public class BaseDeDatosDAOImpl implements BaseDeDatosDAO{
    @Override
    public List<Estudiante> getEstudiante(String carrera) {
        return BaseDeDatos.carreras.get(carrera);
    }
    @Override
    public Estudiante getEstudiante(String carrera, String matricula) {
        return BaseDeDatos.carreras.get(carrera)
                .stream()
                .filter(est->est.getMatricula().equals(matricula))
                .findFirst().get();
    }
}
