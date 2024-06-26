package fes.aragon.controller;

import fes.aragon.model.ClienteEntity;
import fes.aragon.service.cliente.ClienteService;
import fes.aragon.util.Gmail;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Controller
@RequestMapping(value = "correo")
public class MandarCorreoController {
    @Autowired
    ClienteService clienteService;
    Gmail nuevo = new Gmail();
    int id;
    @GetMapping("mandar-correo/{id}")
    public String paginaMandarCorreo(@PathVariable("id") Integer ide, Model model) {
        id = ide; //transformando
        return "correo/mandar-correo";
    }

    @PostMapping("mandare-correo")
    public String saltoModificar(Model model,
                                 RedirectAttributes flash,
                                 @RequestParam("asunto") String asunto,
                                 @RequestParam("mensaje") String mensaje) {
        ClienteEntity cliente = clienteService.buscarClienteId(id);
        System.out.println(asunto);
        System.out.println(mensaje);
        nuevo.gmail(cliente,asunto,mensaje);
        flash.addFlashAttribute("success", "Se mandó el correo con éxito");
        return "redirect:/correo/mandar-correo/" +id;
    }

    /*
    private void gmail(ClienteEntity cliente, String asunto, String mensaje) {
        String gmail = "eajdemo30@gmail.com";
        String pswd = "zezl mpfb iauf skqm";
        Properties p = System.getProperties();
        p.setProperty("mail.smtps.host", "smtp.gmail.com");
        p.setProperty("mail.smtps.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        p.setProperty("mail.smtps.socketFactory.fallback", "false");
        p.setProperty("mail.smtp.port", "465");
        p.setProperty("mail.smtp.socketFactory.port", "465");
        p.setProperty("mail.smtps.auth", "true");
        p.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtps.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.ssl.quitwait", "false");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        String cadena = "<h2>" + mensaje + "</h2>" + f.format(new Date()) + "</br>";
        try {
            Session session = Session.getInstance(p, null);
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(cliente.getCorreo(), false));
            message.setSubject(asunto);
            message.setContent(cadena, "text/html");
            message.setSentDate(new Date());
            Transport transport = session.getTransport("smtps");
            transport.connect("smtp.gmail.com", gmail, pswd);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } */
}

    /*
    @GetMapping("mandar-correo/{id}")
    public String saltoModificar(@PathVariable("id") Integer id,
                                 Model model,
                                 RedirectAttributes flash) {
        ClienteEntity cliente = clienteService.buscarClienteId(id);
        System.out.println();
        System.out.println();
        //gmail(cliente);
        flash.addFlashAttribute("success","Se mando el correo con éxito");
        //return "redirect:/correo/mandar-correo";
        return "correo/mandar-correo";
    }

    private void gmail(ClienteEntity cliente) {
        //correo para pruebas
        String gmail="eajdemo30@gmail.com";
        String pswd="zezl mpfb iauf skqm";
        Properties p=System.getProperties();
        p.setProperty("mail.smtps.host","smpt.gmail.com");
        p.setProperty("mail.smtps.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        p.setProperty("mail.smtps.socketFactory.fallback","false");
        p.setProperty("mail.smtp.port","465");
        p.setProperty("mail.smtp.socketFactory.port","465");
        p.setProperty("mail.smtps.auth","true");
        p.setProperty("mail.smtp.ssl.trust","smtp.gmail.com");
        p.setProperty("mail.smtps.ssl.trust","smtp.gmail.com");
        p.setProperty("mail.smtp.ssl.quitwait","false");
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

        String cadena="<h2>Te mandamos un mensaje de prueba 2</h2>" //mensaje
                +f.format(new Date())+"</br>";
        try{
            Session session=Session.getInstance(p,null);
            MimeMessage message=new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(cliente.getCorreo(),false));
            message.setSubject("Se mando"); //asunto
            message.setContent(cadena,"text/html");
            message.setSentDate(new Date());
            Transport transport=(Transport)session.getTransport("smtps");
            transport.connect("smtp.gmail.com",gmail,pswd);
            transport.sendMessage(message,message.getAllRecipients());
            transport.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    */


