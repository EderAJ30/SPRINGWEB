package fes.aragon.model;

/*import fes.aragon.servicio.FabricaCoches;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import fes.aragon.servicio.FabricaCoches;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    private String nombre;
    private int edad;
    private FabricaCoches coche;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", coche=" + coche +
                '}';
    }
}