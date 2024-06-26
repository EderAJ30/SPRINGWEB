package fes.aragon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Properties;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoP extends Persona {
    private String numTrabajador;
    private Properties actividades;

    @Override
    public String toString() {
        return "Empleado{" +
                "numTrabajador='" + numTrabajador + '\'' +
                "} " + super.toString();
    }

}
