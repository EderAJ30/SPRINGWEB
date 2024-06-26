package fes.aragon.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }
}
