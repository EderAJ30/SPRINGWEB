package fes.aragon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoC extends Persona {
    private String numTrabajador;
    private Collection<Actividades> actividades;

    @Override
    public String toString() {
        return "Empleado{" +
                "numTrabajador='" + numTrabajador + '\'' +
                "} " + super.toString();
    }

}
