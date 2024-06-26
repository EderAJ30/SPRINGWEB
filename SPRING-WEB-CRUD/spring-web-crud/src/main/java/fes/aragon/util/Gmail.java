package fes.aragon.util;

import fes.aragon.model.ClienteEntity;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Gmail {
    public void gmail(ClienteEntity cliente, String asunto, String mensaje) {
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
    }
}
