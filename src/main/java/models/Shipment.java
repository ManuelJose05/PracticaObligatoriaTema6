package models;

import appController.AppController;
import data.Estatus;

import java.io.Serializable;
import java.time.LocalDate;

public class Shipment implements Serializable {
    private int id;
    private LocalDate createDate;
    private LocalDate expectDate;
    private LocalDate deliveryDate;
    private boolean notifications;
    private String alternativeAddress;
    private int alternativePostalCode;
    private String alternativeCity;
    private String status;
    private double cost;
    private String emailUserNoRegister;
    private int idSender;
    private int idReciever;
    private String nameUserNoRegister;

    //CONSTRUCTOR FOR REGISTERED USER
    public Shipment(int id, int idSender, int idReciever, boolean notifications) {
        this.id = id;
        this.createDate = LocalDate.now();
        this.notifications = notifications;
        this.status = Estatus.sinAsignar;
        this.cost = 0;
        this.idSender = idSender;
        this.idReciever = idReciever;
        this.alternativePostalCode = -1;
    }
    public Shipment(Shipment shipment){
        this.id = shipment.getId();
        this.createDate = shipment.getCreateDate();
        this.expectDate = shipment.getExpectDate();
        this.deliveryDate = shipment.getDeliveryDate();
        this.notifications = shipment.isNotifications();
        this.status = shipment.getStatus();
        this.cost = shipment.getCost();
        this.idSender = shipment.getIdSender();
        this.idReciever = shipment.getIdReciever();
    }
    //CONSTRUCTOR FOR NO REGISTERED USER

    public Shipment(int id, boolean notifications, String alternativeAddress, int alternativePostalCode, String alternativeCity, String emailUserNoRegister, int idSender, String nameUserNoRegister) {
        this.id = id;
        this.createDate = LocalDate.now();
        this.expectDate = createDate.plusDays(4);
        this.notifications = notifications;
        this.alternativeAddress = alternativeAddress;
        this.alternativePostalCode = alternativePostalCode;
        this.alternativeCity = alternativeCity;
        this.status = Estatus.sinAsignar;
        this.emailUserNoRegister = emailUserNoRegister;
        this.idSender = idSender;
        this.nameUserNoRegister = nameUserNoRegister;
    }


    //GETTER AND SETTER


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getExpectDate() {
        return expectDate;
    }

    public void setExpectDate(LocalDate expectDate) {
        this.expectDate = expectDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public String getAlternativeAddress() {
        return alternativeAddress;
    }

    public void setAlternativeAddress(String alternativeAddress) {
        this.alternativeAddress = alternativeAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getEmailUserNoRegister() {
        return emailUserNoRegister;
    }

    public void setEmailUserNoRegister(String emailUserNoRegister) {
        this.emailUserNoRegister = emailUserNoRegister;
    }

    public int getIdSender() {
        return idSender;
    }

    public void setIdSender(int idSender) {
        this.idSender = idSender;
    }

    public String getNameUserNoRegister() {
        return nameUserNoRegister;
    }

    public void setNameUserNoRegister(String nameUserNoRegister) {
        this.nameUserNoRegister = nameUserNoRegister;
    }

    public int getAlternativePostalCode() {
        return alternativePostalCode;
    }

    public void setAlternativePostalCode(int alternativePostalCode) {
        this.alternativePostalCode = alternativePostalCode;
    }

    public int getIdReciever() {
        return idReciever;
    }

    public void setIdReciever(int idReciever) {
        this.idReciever = idReciever;
    }

    public String getAlternativeCity() {
        return alternativeCity;
    }

    public void setAlternativeCity(String alternativeCity) {
        this.alternativeCity = alternativeCity;
    }

    //PRINT SHIPMENT

    @Override
    public String toString() {
        return
                "\nId = " + id +
                "\nFecha creación: " + createDate +
                "\nFecha esperada de entrega: " + expectDate +
                "\nFecha de entrega: " + deliveryDate +
                "\nNotificaciones del envío: " + notifications +
                "\nDirección alternativa: " + alternativeAddress +
                "\nEstado del envío: " + status +
                "\nCoste: " + cost +
                "\nCorreo del usuario no registrado: " + emailUserNoRegister +
                        "\nNombre del recividor: " + nameUserNoRegister +
                "\nId del enviador: " + idSender;
    }
    public String chooseShipment(AppController appController){
        return "Nombre del recividor: ";
    }
}
