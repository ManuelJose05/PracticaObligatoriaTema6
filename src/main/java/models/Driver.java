package models;

import data.Estatus;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Driver implements Serializable {
    private int id;
    private String name;
    private String email;
    private String password;
    private ArrayList<Integer> deliveryZones;
    private ArrayList<Shipment> shipments;

    //CONSTRUCTOR
    public Driver(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        deliveryZones = new ArrayList<>();
        shipments = new ArrayList<>();
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getDeliveryZones() {
        return deliveryZones;
    }

    public void setDeliveryZones(ArrayList<Integer> deliveryZones) {
        this.deliveryZones = deliveryZones;
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }

    //METHODS
    //METHOD WHICH CHECK THE LOGIN OF THE DRIVER
    public boolean login(String email,String password){ //METHOD WHICH CHECK IF LOGIN IS CORRECT
        return this.email.equals(email) && this.password.equals(password);
    }
    public Shipment searchShipmentById(int idShipments){ //METHOD WHICH SEARCH SHIPMENT BY ID
        for (Shipment s:
        getShipments()){
            if (s.getId() == idShipments) return s;
        }
        return null;
    }
    public void addShipment(Shipment shipment){ //METHOD WHICH ADD SHIPMENTO TO DRIVER
        shipments.add(shipment);
        shipment.setExpectDate(shipment.getCreateDate().plusDays(3));
        shipment.setStatus(Estatus.asignado);
    }
    public boolean updateShipmentStatus(String status, int idShipment){ //METHOD WHICH UPDATE SHIPMENT STATUS
        Shipment shipment = searchShipmentById(idShipment);
        if (shipment != null){
            shipment.setStatus(status);
            if (status.equals(Estatus.entregado)) shipment.setDeliveryDate(LocalDate.now());
            return true;
        }
        return false;
    }
    public boolean hasPostalCodeZone(int postalCode){ //METHOD WHICH CHECK IF USER HAS THIS POSTALCODE IN DELIVERYZONES
        for (Integer i:
        getDeliveryZones()){
            if (i == postalCode) return true;
        }
        return false;
    }
    public void addPostalCodeZone(int postalCode){ //METHOD WHICH ADD POSTALCODE TO DELIVERYZONES ARRAYLIST
        deliveryZones.add(postalCode);
    }
    public int numShipmentPending(){ //METHOD WHICH RETURN TOTAL SHIPMENT PENDING TO DELIVER
        int cont = 0;
        for (Shipment s:
        shipments){
            if (!s.getStatus().equals(Estatus.entregado)) cont++;
        }
        return cont;
    }

    //PRINT USER

    @Override
    public String toString() {
        return "===== Perfil de conductor =====" +
                "\nId = " + id +
                "\nNombre = " + name +
                "\n============================";
    }
    public String resumeForAdmin(){
         return "===== Perfil de conductor =====" +
                "\nId = " + id +
                "\nNombre = " + name +
                "\nEmail = " + email +
                "\nContraseña = " + password +
                "\n============================";
    }
}
