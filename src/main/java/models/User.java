package models;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private int id;
    private String name;
    private String surName;
    private String email;
    private String password;
    private int phone;
    private String street;
    private int num;
    private String city;
    private String state;
    private int postalCode;
    private ArrayList<Shipment> shipments = new ArrayList<>();

    //CONSTRUCTOR

    public User(int id, String name, String surName, String email, String password, int phone, String street, int num, String city, String state, int postalCode) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.street = street;
        this.num = num;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }
    //METHODS

    //METHOD WHICH CHECK THE LOGIN OF THE USER
    public boolean login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }
    public void addShipment(Shipment shipment){ //METHOD WHICH ADD SHIPMENT TO USER
        shipments.add(shipment);
    }
    public String getAddres(){ //METHOD WHICH RETURN NUM + STREET AS A UNIQUE STRING (ADDRESS)
        return num + " " + street + " ";
    }

    @Override
    public String toString() {
        return "==== Información del usuario ====" +
                "\nId = " + id +
                "\nNombre = " + name +
                "\nApellido = " + surName +
                "\nEmail = " + email +
                "\nContraseña = " + password +
                "\nTelefono = " + phone +
                "\nCalle = " + street +
                "\nNúmero = " + num +
                "\nCiudad = " + city +
                "\nProvincia = " + state +
                "\nCódigo Postal = " + postalCode +
                "\n===================================";
    }
    public String resumeForAdmin(){
        return "\nId = " + id +
                "\nNombre = " + name +
                "\nApellido = " + surName +
                "\nEmail = " + email +
                "\nContraseña = " + password +
                "\nCiudad = " + city +
                "\nProvincia = " + state +
                "\n===================================";
    }
}
