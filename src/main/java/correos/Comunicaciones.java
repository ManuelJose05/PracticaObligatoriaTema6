package correos;

import config.Config;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.Properties;
import static jakarta.mail.Transport.send;

public class Comunicaciones {
    private static final String host = "smtp.gmail.com";
    private static final String user = "manueljoseliebana05@gmail.com";
    private static final String pass = "lzwn zxrg rtnj bwwy";

    public static boolean enviarMensaje(String destino, String asunto, String mensaje) {
        String contenido;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            //CREAMOS UN MENSAJE POR DEFECTO
            Message message = new MimeMessage(session);

            //ESTABLECEMOS EL RECEPTRO
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));

            //ESTABLECEMOS EL ASUNTO
            message.setSubject(asunto);

            //ESTABLECEMOS MENSAJE
            //message.setText(mensaje);
            message.setContent(mensaje, "text/html; charset=utf-8");
            //message.setContent(mensaje, "text/pdf");

            //INTENTAMOS MANDAR EL MENSAJE
            send(message);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public static boolean enviarPdf(String destino, String asunto,String mensaje) {
        String contenido;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            //CREAMOS UN MENSAJE POR DEFECTO
            Message message = new MimeMessage(session);

            //ESTABLECEMOS EL RECEPTRO
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));

            //ESTABLECEMOS EL ASUNTO
            message.setSubject(asunto);

            //ESTABLECEMOS MENSAJE
            //message.setText(mensaje);
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(mensaje, "text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            MimeBodyPart archivo = new MimeBodyPart();
            archivo.attachFile(new File(Config.pdfPath()));
            multipart.addBodyPart(archivo);

            message.setContent(multipart);

            //message.setContent(mensaje, "text/html; charset=utf-8");

            //INTENTAMOS MANDAR EL MENSAJE
            Transport.send(message);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
