package fes.aragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class InicioController {
    @GetMapping("/")
    public String inicioPagina(Model model) {
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yy");
        model.addAttribute("mensaje","Hola spring web");
        model.addAttribute("fecha",format.format(new Date()));
        return "index";
    }
    @GetMapping("principal")
    public String principalPagina(Model model) {
        model.addAttribute("mensaje","Pagina de principal");
        return "principal";
    }
}
