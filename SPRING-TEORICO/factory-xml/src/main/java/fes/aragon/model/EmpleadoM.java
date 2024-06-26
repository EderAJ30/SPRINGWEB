package fes.aragon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Map;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoM extends Persona {
    private String numTrabajador;
    private Map<String, Actividades> actividades;

    @Override
    public String toString() {
        return "Empleado{" +
                "numTrabajador='" + numTrabajador + '\'' +
                "} " + super.toString();
    }

}
