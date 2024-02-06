package fes.aragon.controller;

import fes.aragon.model.ClienteProyectoFinal;
import fes.aragon.service.ServiceProyectoFinal;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/proyecto")
@SessionAttributes("clientes")
public class ProyectoFinalController {
    @Autowired
    private ServiceProyectoFinal clienteProyectoFinalService;
    @GetMapping("/paginaUno")
    public String paginaUno(Model model) {
        model.addAttribute("cliente", new ClienteProyectoFinal());
        model.addAttribute("clientes", clienteProyectoFinalService.obtenerClientesPF());
        return "/paginas/paginaUno";
    }
    @GetMapping("/paginaDos")
    public String paginaDos(Model model) {
        model.addAttribute("clientes", clienteProyectoFinalService.obtenerClientesPF());
        return "/paginas/paginaDos";
    }
    @GetMapping("/almacenar")
    public String almacenar(Model model, SessionStatus status) {
        clienteProyectoFinalService.obtenerClientesPF().forEach((System.out::println));
        status.isComplete();
        model.addAttribute("clientes", clienteProyectoFinalService.obtenerClientesPF());
        return "redirect:/proyecto/paginaDos";
    }
    @PostMapping("/crear")
    public String registrar(@Valid @ModelAttribute("cliente") ClienteProyectoFinal cliente, BindingResult result) {
        if (result.hasErrors()) return "paginas/paginaUno";
        clienteProyectoFinalService.agregarClientePF(cliente);
        return "redirect:/proyecto/paginaUno";
    }
}

