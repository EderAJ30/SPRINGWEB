package fes.aragon.controller;

import fes.aragon.model.ClienteEntity;
import fes.aragon.service.cliente.ClienteService;
import fes.aragon.util.RenderPagina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="principal")
public class PrincipalController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("alta-correo")
    public String paginaAltaCorreo(Model model){
        ClienteEntity cliente=new ClienteEntity();
        model.addAttribute("cliente",cliente);
        return "correo/alta-correo";
    }

    /*
    @GetMapping("baja-correo")
    public String paginaBajaCorreo(@RequestParam(name = "page",
            defaultValue = "0") int page, Model model){
        Pageable pagReq= PageRequest.of(page,1);
        Page<ClienteEntity> clientes=clienteService.listaCompleta(pagReq);
        RenderPagina<ClienteEntity> render=new RenderPagina<>("baja-correo",clientes);
        model.addAttribute("clientes",clientes);
        model.addAttribute("page",render);
        return "correo/baja-correo";
    }
    @GetMapping("modificar-correo")
    public String paginaModificarCorreo(Model model){
        return "correo/modificacion-correo";
    }*/

    @GetMapping("lista-correo")
    public String paginaListaCorreo(Model model){
        return "correo/lista-correo";
    }

    @GetMapping("mandar-correo")
    public String paginaMandarCorreo(Model model){
        return "correo/mandar-correo";
    }

}
