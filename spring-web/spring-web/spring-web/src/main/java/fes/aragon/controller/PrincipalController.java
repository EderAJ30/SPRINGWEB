package fes.aragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="principal")
public class PrincipalController {
    @GetMapping("alta-correo")
    public String paginaAltaCorreo(Model model){
        return "correo/alta-correo";
    }

    @GetMapping("baja-correo")
    public String paginaBajaCorreo(Model model){
        return "correo/baja-correo";
    }

    @GetMapping("modificar-correo")
    public String paginaModificarCorreo(Model model){
        return "correo/modificar-correo";
    }

    @GetMapping("mandar-correo")
    public String paginaMandarCorreo(Model model){
        return "correo/mandar-correo";
    }

    @GetMapping("lista-correo")
    public String paginaListaCorreo(Model model){
        return "correo/lista-correo";
    }
}
