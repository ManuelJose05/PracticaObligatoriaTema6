package correos;

import appController.AppController;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import config.Config;
import models.Shipment;
import models.User;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class Pdf {
    public static void conviertePdf(String mensaje){
        File file = new File(Config.pdfPath());
        PdfWriter pdfWriter = null;
        try {
            pdfWriter = new PdfWriter(file);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph(mensaje);
            document.add(paragraph);
            document.close();
            pdfWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Document generaPdf(Shipment s, AppController appController){
        File file = new File(Config.pdfPath());
        PdfWriter pdfWriter = null;
        User sender = appController.searchUserById(s.getIdSender());
        User reciever = appController.searchUserById(s.getIdReciever());
        String men = "**** RESUMEN DEL ENVÍO ****\n" +
                "Id del envío: " + s.getId() + "\n" +
                "Estado del envío: " + s.getStatus() + "\n" +
                "Remitente: " + sender.getName() + "\n" +
                "Destinatario: " + ((reciever == null)?s.getNameUserNoRegister():reciever.getName()) + "\n" +
                "Fecha de creación del envío: " + s.getCreateDate() + "\n" +
                "Fecha estimada de envío: " + s.getExpectDate() + "\n" +
                "Fecha de entrega: " + s.getDeliveryDate() + "\n" +
                "Dirección: " + ((reciever == null)?s.getAlternativeAddress():reciever.getAddres()) + "\n" +
                "Código postal: " + ((reciever == null)?s.getAlternativePostalCode():reciever.getPostalCode()) + "\n" +
                "Ciudad: " + ((reciever == null)?s.getAlternativeCity():reciever.getCity()) + "\n" +
                "*******************************************";
        ;
        try {
            pdfWriter = new PdfWriter(file);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph(men);
            document.add(paragraph);
            document.close();
            pdfWriter.close();
            return document;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }