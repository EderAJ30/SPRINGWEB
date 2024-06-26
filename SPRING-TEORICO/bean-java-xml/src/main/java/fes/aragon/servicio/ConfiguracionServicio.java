package fes.aragon.servicio;

import fes.aragon.model.Estudiante;
import fes.aragon.model.Materia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource(locations = {"bean-configuration.xml"})
public class ConfiguracionServicio {
    @Bean(name = "estudiante")
    @Scope("prototype")
    public Estudiante servicioEstudiante() {
        Estudiante est=new Estudiante();
        est.setNombre("Raul");
        est.setEdad(23);
        Materia mat=Materia.builder().nombre("logica").creditos(10).build();
        est.getMaterias().add(mat);
        return est;
    }
}
