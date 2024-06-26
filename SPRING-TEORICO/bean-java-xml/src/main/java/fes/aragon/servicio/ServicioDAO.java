package fes.aragon.servicio;

import fes.aragon.repositorio.BaseDeDatosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ServicioDAO {
    @Autowired
    private BaseDeDatosDAO servicioDAO;

    public String archivoCSV(String carrera) {
        servicioDAO.getEstudiante(carrera).stream()
                .map(alm->alm.getMatricula()+";"+
                        (alm.getMaterias().stream()
                                .map(mat->(mat.getNombre()+";"+mat.getCreditos()))
                                .collect(Collectors.joining(";")))+";"+alm.getNombre())
                .collect(Collectors.joining("\n"));
        return carrera;
    }
}
