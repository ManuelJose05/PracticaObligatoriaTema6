package models;

import appController.AppController;
import config.Config;
import utils.Utils;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

public class Persistencia implements Serializable { //TODO CAMBIAR EL GUARDADO DE LAS ESTRUCTURAS DE DATOS (NO GUARDAR, LEER LOS USUARIOS Y CONDUCTORES Y AÑADIR A LOS ENVIOS)
    private static Properties properties = new Properties();

    //SAVE USER DATA
    public static void saveUser(User user) { //TODO MIRAR GENERA MUCHOS FICHEROS
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(Config.dataUserPath() + "/" + user.getId() + ".dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(user);
            ous.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //LOAD USER DATA
    public static ArrayList<User> loadUser() {
        ArrayList<User> users = new ArrayList<>();
        File f = new File(Config.dataUserPath());
        try {
            if (f.list().length != 0 && f.exists()){
                for (int i = 0; i < f.list().length; i++) {
                    FileInputStream fis = new FileInputStream(f.listFiles()[i].getPath());
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    users.add((User) ois.readObject());
                    ois.close();
                }
            }
        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            return users;
        }
        return users;
    }

    //SAVE DRIVER DATA
    public static void saveDriver(Driver driver) { //TODO MIRAR GENERA MUCHOS FICHEROS
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(Config.dataDriverPath() + "/" + driver.getId() + ".dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(driver);
            ous.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //LOAD DRIVER DATA
    public static ArrayList<Driver> loadDriver() {
        ArrayList<Driver> drivers = new ArrayList<>();
        File f = new File(Config.dataDriverPath());
        try {
            if (f.list().length != 0) {
                for (int i = 0; i < f.list().length; i++) {
                    FileInputStream fis = new FileInputStream(f.listFiles()[i].getPath());
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    drivers.add((Driver) ois.readObject());
                    ois.close();
                }
            }
        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            return drivers;
        }
        return drivers;
    }

    //SAVE DRIVER DATA
    public static void saveAdmin(Admin admin) { //TODO MIRAR GENERA MUCHOS FICHEROS
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(Config.dataAdminPath() + "/" + admin.getId() + ".dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(admin);
            ous.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //LOAD ADMIN DATA
    public static ArrayList<Admin> loadAdmin() {
        ArrayList<Admin> admins = new ArrayList<>();
        File f = new File(Config.dataAdminPath());
        try {
            if (f.list().length != 0) {
                for (int i = 0; i < f.list().length; i++) {
                    FileInputStream fis = new FileInputStream(f.listFiles()[i].getPath());
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    admins.add((Admin) ois.readObject());
                    ois.close();
                }
            }
        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            return admins;
        }
        return admins;
    }

    //SAVE SHIPMENT TO ASSING
    public static void saveShipmentToAssign(Shipment shipment) { //TODO MIRAR GENERA MUCHOS FICHEROS
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(Config.shipmentToAssing() + "/" + shipment.getId() + ".dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(shipment);
            ous.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //LOAD SHIPMENTTOASSIGN DATA
    public static ArrayList<Shipment> loadShipmentToAssign() {
        ArrayList<Shipment> shipments = new ArrayList<>();
        File f = new File(Config.shipmentToAssing());

        try {
            if (f.listFiles().length != 0) {
                for (int i = 0; i < f.listFiles().length; i++) {
                    FileInputStream fis = new FileInputStream(f.listFiles()[i]);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    shipments.add((Shipment) ois.readObject());
                    ois.close();
                }
            }
        } catch (ClassNotFoundException | NullPointerException | IOException e) {
            return shipments;
        }
        return shipments;
    }
    //SAVE NO REGISTER USER SHIPMENT
    public static void saveNoRegisterUserShipment(Shipment shipment) { //TODO MIRAR GENERA MUCHOS FICHEROS
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(Config.shipmentNoRegisterUserPath() + "/" + shipment.getId() + ".dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(shipment);
            ous.close();
        } catch (FileNotFoundException ignored) {

        } catch (IOException ignored) {

        }

    }

    //LOAD SHIPMENTTOASSIGN DATA
    public static ArrayList<Shipment> loadNoRegisterUserShipment() {
        ArrayList<Shipment> shipments = new ArrayList<>();
        File f = new File(Config.shipmentNoRegisterUserPath());

        try {
            if (f.listFiles().length != 0) {
                for (int i = 0; i < f.listFiles().length; i++) {
                    FileInputStream fis = new FileInputStream(f.listFiles()[i]);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    shipments.add((Shipment) ois.readObject());
                    ois.close();
                }
            }
        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            return shipments;
        }
        return shipments;
    }

    //LOG DATA
    public static void sessionLogs(Object user, String action) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Config.logPath() + "/log.txt", true));

            if (user != null) {
                if (user instanceof User) bw.write(action + ((User) user).getName() + ";" + "user;" + Utils.dateFormatter(LocalDateTime.now()) + "\n");
                if (user instanceof Driver) bw.write(action + ((Driver) user).getName() + ";" + "driver;" + Utils.dateFormatter(LocalDateTime.now()) + "\n");
                if (user instanceof Admin) bw.write(action + ((Admin) user).getName() + ";" + "admin;" + Utils.dateFormatter(LocalDateTime.now()) + "\n");

            } else bw.write("noUserFound;logInError;" + Utils.dateFormatter(LocalDateTime.now()) + "\n");
            bw.close();
        } catch (IOException ignored) {
        }
    }
    public static void lastAccessLog(String name){
        try {
            properties.load(new FileReader(Config.PROPERTIES_PATH));

            properties.setProperty(name, Utils.dateFormatter(LocalDateTime.now()));
            properties.store(new FileWriter(Config.PROPERTIES_PATH),null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void newShipmentLog(Shipment shipment) { //TODO CAMBIAR A PROPERTIES
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Config.logPath() + "/log.txt", true));
            if (shipment != null)
                bw.write("newShipment;" + ((shipment.getIdReciever() == -1) ? "noRegisterUser" : shipment.getIdReciever()) + ";" + shipment.getIdSender() + ";" + Utils.dateFormatter(LocalDateTime.now()) + "\n");
            else bw.write("newShipmentError;emptyShipment");
            bw.close();
        } catch (IOException ignored) {

        }
    }

    public static void updateShipmentLog(Shipment shipment) { //TODO CAMBIAR A PROPERTIES
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Config.logPath() + "/log.txt", true));
            if (shipment != null)
                bw.write("updateShipment;" + shipment.getIdReciever() + ";" + shipment.getId() + ";" + shipment.getStatus() + ";" + Utils.dateFormatter(LocalDateTime.now()) + "\n");
            else bw.write("updateShipmentError;emptyShipment");
            bw.close();
        } catch (IOException ignored) {

        }
    }

    public static boolean segurityCopy(AppController appController, String ruta){
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(appController);
            oos.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public static void removeShipmenToAssing(int idShipment) {
        File f = new File(Config.shipmentToAssing() + "/" + idShipment + ".dat");
        f.delete();
    }
}