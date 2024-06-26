package fes.aragon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Persona {
    private String numTrabajador;
    private Actividades actividades;

    @Override
    public String toString() {
        return "Empleado{" +
                "numTrabajador='" + numTrabajador + '\'' +
                "} " + super.toString();
    }

}
