package appController;

import config.Config;
import correos.Comunicaciones;
import correos.Pdf;
import correos.Plantilla;
import excel.Excel;
import models.*;
import data.Estatus;
import utils.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Properties;

public class AppController implements Serializable {
    private ArrayList<User> users;
    private ArrayList<Driver> drivers;
    private ArrayList<Admin> admins;
    private ArrayList<Shipment> shipmentsToAssign;
    private ArrayList<Shipment> shipmentsToNoRegisterUser;

    //CONSTRUCTOR
    public AppController() {
        Estatus.loadEstatus();
        users = Persistencia.loadUser();
        drivers = Persistencia.loadDriver();
        admins = Persistencia.loadAdmin();
        shipmentsToAssign = Persistencia.loadShipmentToAssign();
        shipmentsToNoRegisterUser = Persistencia.loadNoRegisterUserShipment();
    }
    //GETTER AND SETTER
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Shipment> getShipmentsToAssign() {
        return shipmentsToAssign;
    }

    public void setShipmentsToAssign(ArrayList<Shipment> shipmentsToAssign) {
        this.shipmentsToAssign = shipmentsToAssign;
    }

    public ArrayList<Shipment> getShipmentsToNoRegisterUser() {
        return shipmentsToNoRegisterUser;
    }

    public void setShipmentsToNoRegisterUser(ArrayList<Shipment> shipmentsToNoRegisterUser) {
        this.shipmentsToNoRegisterUser = shipmentsToNoRegisterUser;
    }

    //METHODS

    //LOGIN
    public Object login(String email, String pass){
        String action = "logIn;"; //TODO CAMBIAR A PROPERTIES
        for (User u:
        users){
            if (u.login(email,pass)){
                Persistencia.sessionLogs(u,action);
                return u;
            }
        }
        for (Driver d:
        drivers){
            if (d.login(email,pass)){
                Persistencia.sessionLogs(d,action);
                return d;
            }
        }
        for (Admin a:
        admins){
            if (a.login(email,pass)){
                Persistencia.sessionLogs(a,action);
                return a;
            }
        }
        Persistencia.sessionLogs(null,"logInError");
        return null;
    }
    public String getLastUserAccess(String name){
        Properties properties = new Properties();
        String fecha = "";
        try {
            properties.load(new FileReader(Config.PROPERTIES_PATH));
            fecha = properties.getProperty(name);
            Persistencia.lastAccessLog(name);
        } catch (IOException e) {
            return fecha;
        }
        return fecha;
    }

    //USER
    public int getShipmentPending(User user){ //METHOD WHICH COUNT TOTAL DELIVERIES WITHOUT DRIVER
        int cont = 0;
        for (Shipment s:
        user.getShipments()){
            if (!s.getStatus().equals(Estatus.entregado)) cont++;
        }
        return cont;
    }
    //FUNCTION WHICH GENERATES A ID FOR USER
    private int uniqueUserId(){
        int id;
        do {
            id = (int) (Math.random() * 100000);
        } while (searchUserById(id) != null);
        return id;
    }
    public User searchUserById(int id){ //METHOD WHICH SEARCH USER BY ID
        for (User u:
        users){
            if (u.getId() == id) return u;
        }
        return null;
    }
    public User searchUserByEmail(String email){ //METHOD WHICH SEARCH USER BY EMAIL
        for (User u:
        users){
            if (u.getEmail().equals(email)) return u;
        }
        return null;
    }
    public User searchUserByPhone(int phone){ //METHOD WHICH SEARCH USER BY PHONE
        for (User u:
                users){
            if (u.getPhone() == phone) return u;
        }
        return null;
    }
    public ArrayList<InfoShipmentDataClass> getShipmentsFromUser(User user) { //METHOD WHICH RETURN SHIPMENT SENDED BY USER
        ArrayList<InfoShipmentDataClass> shipments = new ArrayList<>();
        for (Shipment s:
                user.getShipments()){
            User reciever = searchUserById(s.getIdReciever());
            User sender = searchUserById(s.getIdSender());
            if (s.getIdSender() == user.getId()){
                if (reciever != null) shipments.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
                else shipments.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity()));
            }
        }
        Collections.sort(shipments,new AppController.SortByDate());
        return shipments;
    }
    public ArrayList<InfoShipmentDataClass> getShipmentsPendingToUser(int idUser){ //METHOD WHICH RETURN SHIPMENT DELIVERED TO USER
        User user = searchUserById(idUser);
        ArrayList<InfoShipmentDataClass> shipmentUser = new ArrayList<>();
        if (user == null) return null;
        for (Shipment s:
        shipmentsToAssign){
            User reciever = searchUserById(idUser);
            User sender = searchUserById(s.getIdSender());
            if (s.getIdReciever() == idUser){
                shipmentUser.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
            }
        }
        for (Driver d:
        drivers){
            for (Shipment s:
            d.getShipments()){
                User reciever = searchUserById(idUser);
                User sender = searchUserById(s.getIdSender());
                if (s.getIdReciever() == idUser) shipmentUser.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
            }
        }
        Collections.sort(shipmentUser,new AppController.SortByDate());
        return shipmentUser;
    }
    //METHOD WHICH REGISTER A USER
    public boolean addUser(String name, String surname,String email, int phone, String pass, String street,int num, String city, String state,
    int postalCode){
        User user = new User(uniqueUserId(),name,surname,email,pass,phone,street,num,city,state,postalCode);
        Persistencia.saveUser(user);
        return users.add(user);
    }
    public boolean changeDeliveryData(int idShipment, String address, int postalCode){ //METHOD WHICH CHANGE DELIVERY INFO
        Shipment shipment = searchShipmentById(idShipment);
        User user = searchUserById(shipment.getIdReciever());
        if (user == null){
            shipment.setAlternativePostalCode(postalCode);
            shipment.setAlternativeAddress(address);
            return true;
        }
        return true;
    }

    //DRIVER
    public Driver searchDriverById(int id){ //METHOD WHICH SEARCH DRIVER BY ID
        for (Driver d:
        drivers){
            if (d.getId() == id) return d;
        }
        return null;
    }
    public Driver searchDriverByEmail(String email){ //METHOD WHICH SEARCH DRIVER BY EMAIL
        for (Driver d:
        drivers){
            if (d.getEmail().equals(email)) return d;
        }
        return null;
    }
    //FUNCTION WHICH GENERATES A ID FOR DRIVER
    private int uniqueDriverId(){
        int id;
        do {
            id = (int) (Math.random() * 100000);
        } while (searchDriverById(id) != null);
        return id;
    }
    public boolean changeDriverInfo(String oldEmail, String newEmail, String pass){ //METHOD WHICH CHANGE DRIVER INFO
        Driver driver = searchDriverByEmail(oldEmail);

        if (driver != null){
            driver.setEmail(newEmail);
            driver.setPassword(pass);
            Persistencia.saveDriver(driver);
            return true;
        }
        return false;
    }
    public boolean addDriver(String name, String email, String pass){ //METHOD WHICH ADD DRIVER TO DRIVERS ARRAYLIST
        Driver driver = new Driver(uniqueDriverId(),name,email,pass);
        if (driver != null) Persistencia.saveDriver(driver);
        return drivers.add(driver);
    }
    public boolean addZoneToDriver(int idDriver,int newPostalCode){ //METHOD WHICH ADD POSTALCODE TO DRIVER ZONE ARRAYLIST
        Driver driver = searchDriverById(idDriver);
        if (driver != null){
            driver.addPostalCodeZone(newPostalCode);
            Persistencia.saveDriver(driver);
            return true;
        }
        return false;
    }
    public Driver searchBestDriverByPostalCode(int postalCode){ //METHOD WHICH RETURN BEST DRIVER FOR A SHIPMENT SEARCHED BY POSTALCODE
        for (Driver s:
        drivers){
            for (Integer i:
            s.getDeliveryZones()){
                if (i == postalCode) return s;
            }
        }
        return null;
    }
    public boolean setShipmentToDriver(int idShipment, int idDriver){ //METHOD WHICH ADD SHIPMENTO TO DRIVER SHIPMENT ARRAY LIST
        Driver driver = searchDriverById(idDriver);
        Shipment shipment = searchShipmentById(idShipment);
        User reciever = searchUserById(shipment.getIdReciever());
        User sender = searchUserById(shipment.getIdSender());
        if (driver != null){
            driver.addShipment(shipment);
            Pdf.generaPdf(shipment,this);
            if (shipment.isNotifications()) Comunicaciones.enviarPdf((reciever == null)?shipment.getEmailUserNoRegister():reciever.getEmail(),"Se ha asignado un nuevo conductor a su envío",
                    "Estimado usuario " + ((reciever == null)?shipment.getNameUserNoRegister():reciever.getName()) + ". Se ha asignado un nuevo conductor a su envío (" + driver.getName() + ")");
            Persistencia.saveDriver(driver);
        }
        for (User u:
                users){
            for (Shipment s:
                    u.getShipments()){
                if (s.getId() == idShipment) s.setStatus(Estatus.asignado);

            }
        }
        for (Shipment s:
                shipmentsToNoRegisterUser){
            if (s.getId() == idShipment){
                s.setStatus(Estatus.asignado);
                Persistencia.saveNoRegisterUserShipment(s);
                if (shipment.isNotifications()) Comunicaciones.enviarPdf(s.getEmailUserNoRegister(),"Se ha asignado un nuevo conductor a su envío","Estimado usuario " + s.getNameUserNoRegister() + ". Se ha asignado un nuevo conductor a su envío");
            }
        }
        for (int i = 0; i < shipmentsToAssign.size() ; i++) {
            if (shipmentsToAssign.get(i).getId() == idShipment){
                shipmentsToAssign.remove(i);
                Persistencia.removeShipmenToAssing(idShipment);
            }
        }
        if (reciever != null) Persistencia.saveUser(reciever);
        if (sender != null) Persistencia.saveUser(sender);
        return true;
    }
    public ArrayList<InfoShipmentDataClass> getShipmentPendingDriver(int id){ //METHOD WHICH RETURN DRIVER SHIPMENT NOT DELIVERED
        ArrayList<InfoShipmentDataClass> shipmentPending = new ArrayList<>();
        for (Driver d:
        drivers){
            if (d.getId() == id){
                for (Shipment s:
                        d.getShipments()){
                    User reciever = searchUserById(s.getIdReciever());
                    User sender = searchUserById(s.getIdSender());
                    if (!s.getStatus().equals(Estatus.entregado)){
                        if (reciever != null) shipmentPending.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
                        else shipmentPending.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity()));
                    }
                }
            }
        }
        Collections.sort(shipmentPending,new AppController.SortByDate());
        return shipmentPending;
    }
    public void changeDeliveryStatus(int idSelect, String newStatus){ //METHOD WHICH CHANGE DELIVERY STATUS
        Shipment shipment;
        User reciever,sender;
        for (Driver d:
                drivers){
            shipment = searchShipmentById(idSelect);
            reciever = searchUserById(shipment.getIdReciever());
            sender = searchUserById(shipment.getIdSender());
                d.updateShipmentStatus(newStatus,idSelect);
                shipment.setStatus(newStatus);
                Pdf.generaPdf(shipment,this);
                Persistencia.updateShipmentLog(shipment);
                if (newStatus.equals(Estatus.entregado)) shipment.setCost((getTotalNumDaysDelivery(idSelect) + 1) * 1.25);
                if (shipment.isNotifications()) Comunicaciones.enviarPdf((reciever == null)?shipment.getEmailUserNoRegister():reciever.getEmail(),"Se ha modificado el estado de su envío","Querido " + ((reciever == null)? shipment.getNameUserNoRegister():reciever.getName()) + ". El conductor ha modificado el estado de su envío. Revise dicho estado en el resumen de abajo");
                if (reciever != null) Persistencia.saveUser(reciever);
                if (sender != null) Persistencia.saveUser(sender);
                Persistencia.saveDriver(d);
        }
        for (User u:
        users){
            for (Shipment s:
            u.getShipments()){
                reciever = searchUserById(s.getIdReciever());
                sender = searchUserById(s.getIdSender());
                    if (s.getId() == idSelect){
                        s.setStatus(newStatus);
                        Persistencia.updateShipmentLog(s);
                        if (reciever != null) Persistencia.saveUser(reciever);
                        if (sender != null) Persistencia.saveUser(sender);
                    }
            }
        }
        for (Shipment s:
        shipmentsToNoRegisterUser){
            if (s.getId() == idSelect){
                s.setStatus(newStatus);
                Persistencia.updateShipmentLog(s);
                Persistencia.saveNoRegisterUserShipment(s);
                if (s.isNotifications()) Comunicaciones.enviarPdf(s.getEmailUserNoRegister(),"Se ha modificado el estado de su envío","Querido " + s.getNameUserNoRegister() + ". El conductor ha modificado el estado de su envío. Revise dicho estado en el resumen de abajo");
            }
        }
    }
    public int getTotalNumDaysDelivery(int idShipment){ //METHOD WHICH RETURN NUM OF DAYS BETWEEN 2 DATES
        Shipment shipment = searchShipmentById(idShipment);
        return  (int) ChronoUnit.DAYS.between(shipment.getCreateDate(),shipment.getDeliveryDate());
    }
    public ArrayList<InfoShipmentDataClass> getShipmentsFinisDriver(int id){ //METHOD WHICH RETURN FINISHED SHIPMENT DELIVERED BY DRIVER
        ArrayList<InfoShipmentDataClass> shipmentFinish = new ArrayList<>();

        for (Driver d:
                drivers){
            if (d.getId() == id){
                for (Shipment s:
                        d.getShipments()){
                    User reciever = searchUserById(s.getIdReciever());
                    User sender = searchUserById(s.getIdSender());
                    if (s.getStatus().equals(Estatus.entregado)){
                        if (reciever != null) shipmentFinish.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
                        else shipmentFinish.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity()));
                    }
            }
        }
    }
        Collections.sort(shipmentFinish,new AppController.SortByDate());
        return shipmentFinish;
    }
    //SHIPMENT
    public InfoShipmentDataClass searchShipmentByNoIdNoLogin(int id){ //METHOD WHICH RETURN SHIPMENT WITHOUT LOGIN
        InfoShipmentDataClass shipmentDataClass = null;
        for (Shipment s:
        shipmentsToAssign){
            User reciever = searchUserById(s.getIdReciever());
            User sender = searchUserById(s.getIdSender());
            if (s.getId() == id){
                if (reciever != null) shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity());
                else shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity());
            }
        }
        for (Shipment s:
        shipmentsToNoRegisterUser){
            User reciever = searchUserById(s.getIdReciever());
            User sender = searchUserById(s.getIdSender());
            if (s.getId() == id){
                if (reciever != null) shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity());
                else shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity());
            }
        }
        for (User u:
        users){
            for (Shipment s:
            u.getShipments()){
                User reciever = searchUserById(s.getIdReciever());
                User sender = searchUserById(s.getIdSender());
                if (s.getId() == id){
                    if (reciever != null) shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity());
                    else shipmentDataClass = new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity());
                }
            }
        }
        return shipmentDataClass;
    }
    public Shipment searchShipmentById(int id){ //METHOD WHICH RETURN SHIPMENT SEARCHED BY IDSHIPMENT
        for (Shipment s:
        shipmentsToAssign){
            if (s.getId() == id) return s;
        }
        for (Shipment s:
                shipmentsToNoRegisterUser){
            if (s.getId() == id) return s;
        }
        for (User u:
        users){
            for (Shipment s:
            u.getShipments()){
                if (s.getId() == id) return s;
            }
        }
        return null;
    }
    public int uniqueShipmentId(){ //METHOD WHICH GENERATE A ID FOR SHIPMENT
        int id;
        do {
            id = (int) (Math.random()* 10000);
        } while (searchShipmentById(id) != null);
        return id;
    }
    public Shipment addShiptment(int idUser,int idReciever,boolean notifications){ //ADD SHIPMENT FOR REGISTERED USER
        Shipment shipment = new Shipment(uniqueShipmentId(),idUser,idReciever,notifications);
        User user = searchUserById(idUser);
        User reciever = searchUserById(idReciever);
         shipmentsToAssign.add(shipment);
         user.addShipment(shipment);
         reciever.addShipment(shipment);
         Persistencia.saveShipmentToAssign(shipment);
         Persistencia.saveUser(user);
         Persistencia.saveUser(reciever);
         return shipment;
    }
    public Shipment addShiptmentToNoRegisterUser(int idUser, String email,int postalCode,String alternativeAddres, String name,boolean notification,String alternativeCity){ //ADD SHIPMENT FOR NO REGISTERED USER
        Shipment shipment = new Shipment(uniqueShipmentId(),notification,alternativeAddres,postalCode,alternativeCity,email,idUser,name);
        User sender = searchUserById(idUser);
        shipmentsToNoRegisterUser.add(shipment);
        sender.addShipment(shipment);
        Persistencia.saveNoRegisterUserShipment(shipment);
        Persistencia.saveUser(sender);
        return shipment;
    }
    public ArrayList<InfoShipmentDataClass> getShipmentsUnassigned(){ //METHOD WHICH GET UNASSIGNED SHIPMENTS
        ArrayList<InfoShipmentDataClass> shipmentDataClasses = new ArrayList<>();
        for (Shipment s:
        shipmentsToAssign){
            User reciever = searchUserById(s.getIdReciever());
            User sender = searchUserById(s.getIdSender());
            if (s.getStatus().equals(Estatus.sinAsignar)){
                if (reciever != null) shipmentDataClasses.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),reciever.getPostalCode(),s.getStatus(),sender.getName(),reciever.getName(),reciever.getAddres(),reciever.getCity()));
                else shipmentDataClasses.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity()));
            }
        }
        for (Shipment s:
        shipmentsToNoRegisterUser){
            User sender = searchUserById(s.getIdSender());
            if (s.getStatus().equals(Estatus.sinAsignar)) shipmentDataClasses.add(new InfoShipmentDataClass(s.getId(),s.getCreateDate(),s.getExpectDate(),s.getDeliveryDate(),s.getAlternativePostalCode(),s.getStatus(),sender.getName(),s.getNameUserNoRegister(),s.getAlternativeAddress(),s.getAlternativeCity()));
        }
        Collections.sort(shipmentDataClasses,new AppController.SortByDate());
        return shipmentDataClasses;
    }
    public void getShipmentNoRegisteredUser(String email){ //METHOD WHICH SEARCH SHIPMENT IN NOREGISTERUSER ARRAYLIST AND ADD TO NEW USER WHICH HAS GOT THIS EMAIL
        for (Shipment s:
        shipmentsToNoRegisterUser){
            User user = searchUserByEmail(email);
            if (s.getEmailUserNoRegister().equals(email)){
                user.addShipment(s);
                shipmentsToNoRegisterUser.remove(s);
            }
        }
    }

    //METHODS FOR ADMIN
    public int numUser(){ //RETURN TOTAL USERS
        return users.size();
    }
    public int numDriver(){ //RETURN TOTAL DRIVERS
        return drivers.size();
    }
    public int numNoRegisteredUserShipment(){ //RETURN TOTAL NO REGISTERED USER
        return shipmentsToNoRegisterUser.size();
    }
    public int deliveryDaysAverage(){ //RETURN AVERAGE OF DAY WHICH TOOK TO SEND A SHIPMENT
        int totalDays = 0,totalDeliveries = 0;
        for (Driver d:
        drivers){
            for (Shipment s:
            d.getShipments()){
                if (s.getStatus().equals(Estatus.entregado)){
                    totalDays += (int) ChronoUnit.DAYS.between(s.getCreateDate(),s.getDeliveryDate());
                    totalDeliveries++;
                }
            }
        }
        if (totalDeliveries == 0) return 0;
        return totalDays / totalDeliveries;
    }
    public Admin searchAdminByEmail(String email){ //METHOD WHICH SEARCH ADMIN BY EMAIL
        for (Admin a:
        admins){
            if (a.getEmail().equals(email)) return a;
        }
        return null;
    }
    public int numShipmentsPending(){ //RETURN TOTAL SHIPMENT PENDING TO DELIVER
        int cont = 0;
        for (Shipment s:
        shipmentsToAssign){
            if (!s.getStatus().equals(Estatus.entregado)) cont++;
        }
        for (Shipment s:
                shipmentsToNoRegisterUser){
            if (!s.getStatus().equals(Estatus.entregado)) cont++;
        }
        return cont;
    }
    public int numShipmetnsNoDriver(){ //RETURN TOTAL SHIPMENT WITHOUT DRIVER
        int cont = 0;
        cont += shipmentsToAssign.size();
        for (Shipment s:
                shipmentsToNoRegisterUser){
            if (s.getStatus().equals(Estatus.sinAsignar)) cont++;
        }
        return cont;
    }
    public boolean changeAdminInfo(Admin admin,String newEmail, String newPass){ //METHOD WHICH CHANGE ADMIN INFO
        for (Admin a:
                admins){
            if (a.login(admin.getEmail(),admin.getPassword())){
                a.setEmail(newEmail);
                a.setPassword(newPass);
                Persistencia.saveAdmin(a);
                return true;
            }
        }
        return false;
    }
    //SECURITY COPY METHOD
    public boolean makeCopy(String ruta){
        return Persistencia.segurityCopy(this,ruta);
    }
    public boolean guestMode(){
        return Config.guestMode();
    }
    public String printProperties(){
        return Config.printPropertiesInfo();
    }
    public void generateShipmentExcel() {
        ArrayList<Shipment> shipments = new ArrayList<>();
        for (Driver d:
        drivers){
            shipments.addAll(d.getShipments());
        }
        shipments.addAll(shipmentsToAssign);
        shipments.addAll(shipmentsToNoRegisterUser);
        Excel.generaExcel(shipments);
    }

    static class SortByDate implements Comparator<InfoShipmentDataClass> {

        @Override
        public int compare(InfoShipmentDataClass o1, InfoShipmentDataClass o2) {
            return o2.getCreateDate().compareTo(o1.getCreateDate());
        }
    }
}
