package fes.aragon.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona {
    @NotEmpty(message = "Nombre no debe ser vacío")

    private String nombre;
    @NotEmpty(message = "Correo no debe ser vacío")

    private String correo;
}
