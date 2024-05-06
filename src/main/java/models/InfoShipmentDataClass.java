package models;

import java.time.LocalDate;
import java.util.List;

public class InfoShipmentDataClass {
    private int id;
    private LocalDate createDate;
    private LocalDate expectDate;
    private LocalDate deliveryDate;
    private int postalCode;
    private String status;
    private String sender;
    private String receiver;
    private String address;
    private String city;

    //CONSTRUCTOR
    public InfoShipmentDataClass(int id, LocalDate createDate, LocalDate expectDate, LocalDate deliveryDate, int postalCode, String status, String sender, String receiver, String address, String city) {
        this.id = id;
        this.createDate = createDate;
        this.expectDate = expectDate;
        this.deliveryDate = deliveryDate;
        this.postalCode = postalCode;
        this.status = status;
        this.sender = sender;
        this.receiver = receiver;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getExpectDate() {
        return expectDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "\nId: " + id +
                "\nFecha de creación de envío: " + createDate +
                "\nFecha estimada de entrega: " + ((expectDate == null)? "Aún se desconoce la fecha de entrega":expectDate) +
                "\nFecha de entrega: " + ((deliveryDate == null)? "Aún se desconoce la fecha de entrega":deliveryDate) +
                "\nEstado del paquete: " + status +
                "\nRecibidor: " + receiver +
                "\nDirección de envío: " + address +
                "\nCiudad: " + city + '\'' +
                "\nCódigo Postal: " + postalCode +
                "\nCreador del envío: " + sender +
                "\n==================================================\n";
    }
    public String forAdmin() {
        return "==== Envío sin asignar ====" +
                "\nId: " + id +
                "\nFecha de creación: " + createDate +
                "\nFecha estimada de entrega: " + ((expectDate == null)? "Aún se desconoce la fecha de entrega":expectDate) +
                "\nFecha de entrega: " + ((deliveryDate == null)? "Aún se desconoce la fecha de entrega":deliveryDate) +
                "\nCódigo Postal: " + postalCode +
                "\nEstado del envío: " + status +
                "\nCreador del envío: " + sender +
                "\nRecibidor: " + receiver +
                "\nDirección: " + address +
                "\nCiudad: " + city +
                "\n===================================";
    }
    public String forTracking(){
        return "===== Código del envío: " + id  + " =====" +
                "\nEstado: " + status + ". Será entregado en " + city + " ("+ postalCode + ")" +
                "\nFecha de creación del envío: " + createDate +
                "\nFecha estimada de entrega: " + ((expectDate == null)? "Aún se desconoce la fecha de entrega":expectDate) +
                "\n================================================\n";
    }
}
