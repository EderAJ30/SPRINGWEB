package fes.aragon.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ClienteProyectoFinal {
    @NotEmpty(message = "El campo es obligatorio")
    private String nombre;
    @NotEmpty(message = "El campo es obligatorio")
    private String apellido;
    @NotEmpty(message = "El campo es obligatorio")
    @Email(message = "El correo no es valido")
    private String email;
}