package org.example;

import appController.AppController;
import correos.Comunicaciones;
import correos.Pdf;
import data.Estatus;
import excel.Excel;
import models.*;
import utils.Utils;

import java.util.Scanner;

public class Main {
    public static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        //CONTROLLER
        AppController appController = new AppController();
        //OBJECT
        Object user = null;
        //mock(appController);


        //MAIN PROGRAM
        printAppName();
        do {
            mainMenu(appController);
            try {
                switch (Integer.parseInt(S.nextLine())) {
                    case 1://LOGIN
                        user = login(appController);
                        break;
                    case 2://REGISTER
                        user = register(appController);
                        Utils.pulseToContinue();
                        break;
                    case 3://SEARCH SHIPMENT WITHOUT LOGIN
                        if (appController.guestMode()) tracking(appController);
                        else System.out.println("El tracking de envío no esta disponible");
                        Utils.pulseToContinue();
                        break;
                    case 4://POWER OFF
                        System.out.println("Closing system");
                        return;
                    default://ERROR OPTIONS
                        System.out.println("System Error");
                        break;
                } //END OF SWITCH
            } catch (NumberFormatException e) {
                System.out.println("Opción incorrecta");
            }
            if (user != null) {
                if (user instanceof User) userMenu(appController, (User) user);
                if (user instanceof Driver) driverMenu(appController, (Driver) user);
                if (user instanceof Admin) adminMenu(appController, (Admin) user);
            }
            user = null;
        } while (true); //END OF DO - WHILE
    }

    //MOCK
    public static void mock(AppController appController) {
        appController.addUser("Manuel Jose", "Liebana", "manueljoseliebana05@gmail.com", 609814777,
                "1234", "Paseo de la fuente Mayor", 4, "Jamilena", "Jaén", 23658);
        appController.addUser("Pedro", "Liebana", "themanu047@gmail.com", 609814777,
               "1234", "Paseo de la fuente Mayor", 4, "Jamilena", "Jaén", 23658);
       appController.addDriver("Pedro", "pedro@gmail.com", "1234");
    }

    //FUNCTION WHICH PRINTS SOFTWARE NAME
    public static void printAppName() {
        System.out.println("""
                 _  _  _  _  _     _  _  _  _  _     _  _  _  _        _           _           _           _           _     _  _  _  _             _                 _             _  _  _  _
                (_)(_)(_)(_)(_)   (_)(_)(_)(_)(_)   (_)(_)(_)(_) _    (_) _       (_)        _(_)_        (_) _       (_)   (_)(_)(_)(_)_         _(_)_             _(_)_         _(_)(_)(_)(_)_
                (_)               (_)               (_)         (_)   (_)(_)_     (_)      _(_) (_)_      (_)(_)_     (_)   (_)        (_)      _(_) (_)_         _(_) (_)_      (_)          (_)
                (_) _  _          (_) _  _          (_) _  _  _ (_)   (_)  (_)_   (_)    _(_)     (_)_    (_)  (_)_   (_)   (_) _  _  _(_)    _(_)     (_)_     _(_)     (_)_    (_)          (_)
                (_)(_)(_)         (_)(_)(_)         (_)(_)(_)(_)      (_)    (_)_ (_)   (_) _  _  _ (_)   (_)    (_)_ (_)   (_)(_)(_)(_)     (_) _  _  _ (_)   (_) _  _  _ (_)   (_)     _    (_)
                (_)               (_)               (_)   (_) _       (_)      (_)(_)   (_)(_)(_)(_)(_)   (_)      (_)(_)   (_)              (_)(_)(_)(_)(_)   (_)(_)(_)(_)(_)   (_)    (_) _ (_)
                (_)               (_) _  _  _  _    (_)      (_) _    (_)         (_)   (_)         (_)   (_)         (_)   (_)              (_)         (_)   (_)         (_)   (_)_  _  _(_) _
                (_)               (_)(_)(_)(_)(_)   (_)         (_)   (_)         (_)   (_)         (_)   (_)         (_)   (_)              (_)         (_)   (_)         (_)     (_)(_)(_)  (_)           
                """);
    }

    //FUNCTION WHICH PRINTS MAIN MENU
    public static void mainMenu(AppController appController) {
        System.out.printf("""
                ╔═════════════════════════════════════════════════╗
                ║                 Menú de inicio                  ║
                ╠═════════════════════════════════════════════════╣
                ║                    1. Login                     ║
                ╠═════════════════════════════════════════════════╣
                ║                 2. Registrarse                  ║
                ╠═════════════════════════════════════════════════╣
                ║ 3. Seguir un envío con el número de seguimiento ║
                ║                 %s                      ║
                ╠═════════════════════════════════════════════════╣
                ║                   4. Log out                    ║
                ╚═════════════════════════════════════════════════╝
                Elija una opción: """,(appController.guestMode())? "Disponible" : "No disponible");
    }

    //FUNCTION WHICH PRINTS USER MENU
    public static void printUserMenu(AppController appController, User user) {

        System.out.printf("""
                ╔═══════════════════════════════════════════════════════════╗
                ║ Bienvenido %5s.Tiene %d paquetes pendientes de entrega ║
                ╠═══════════════════════════════════════════════════════════╣
                ║     Su último acceso fue: %s           ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                   Menú de operaciones                     ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                   1. Realizar un envío                    ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                  2. Muestra información                   ║
                ╠═══════════════════════════════════════════════════════════╣
                ║     3. Modificar mis datos de entrega para un envío       ║
                ╠═══════════════════════════════════════════════════════════╣
                ║  4. Muestra información de los envíos que yo he realizado ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                     5. Ver mi perfil                      ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                  6. Modificar mis datos                   ║
                ╠═══════════════════════════════════════════════════════════╣
                ║                     7. Cerrar sesión                      ║
                ╚═══════════════════════════════════════════════════════════╝
                Elija una opción: """, user.getName(), appController.getShipmentPending(user),
                appController.getLastUserAccess(user.getName()));
    }

    //FUNCTION WHICH PRINTS DRIVER MENU
    public static void printDriverMenu(AppController appController, Driver driver) {
        System.out.printf("""
                ╔══════════════════════════════════════════════════════════════╗
                ║ Bienvenido: conductor. Tienes %d paquete pendiente de entrega║
                ╠══════════════════════════════════════════════════════════════╣                           
                ║       Su ultimo acceso fue: %s                    ║
                ╠══════════════════════════════════════════════════════════════╣
                ║                     Menú de operaciones:                     ║
                ╠══════════════════════════════════════════════════════════════╣
                ║        1. Información de envíos pendientes de entrega        ║
                ╠══════════════════════════════════════════════════════════════╣
                ║                2. Cambiar estado de un envío                 ║
                ╠══════════════════════════════════════════════════════════════╣
                ║        3. Ver el histórico de mis paquetes entregados        ║
                ╠══════════════════════════════════════════════════════════════╣
                ║          4. Añadir una zona de entrega a mi perfil           ║
                ╠══════════════════════════════════════════════════════════════╣
                ║                       5. Ver mi perfil                       ║
                ╠══════════════════════════════════════════════════════════════╣
                ║                    6. Modificar mis datos                    ║
                ╠══════════════════════════════════════════════════════════════╣
                ║                           7. Salir                           ║
                ╚══════════════════════════════════════════════════════════════╝
                Elija una opción: """, driver.numShipmentPending(),appController.getLastUserAccess(driver.getName()));
    }

    //FUNCTION WHICH PRINTS ADMIN MENU
    public static void printAdminMenu(AppController appController) { //TODO AÑADIR OPCION 7 PROPERTIES
        System.out.printf("""
                        ╔═══════════════════════════════════════════════════════╗
                        ║   Bienvenido Administrador. Usted es Administrador    ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║     Su ultimo acceso fue: %s               ║
                        ╠═══════════════════════════════════════════════════════╣                      
                        ║                Estadísticas de la App                 ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║               Números de usuarios: %d                 ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║               Números de conductores: %d               ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║      Números de envíos pendientes de entrega: %d       ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║          Números de envíos sin conductor: %d           ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║    Números de envíos a usuarios no registrados: %d     ║
                        ╠═══════════════════════════════════════════════════════╣
                        ║ Promedio de días que tardamos en entregar un envío: %d║
                        ╚═══════════════════════════════════════════════════════╝
                                        
                          ╔══════════════════════════════════════════════════╗
                          ║               Menú de operaciones:               ║
                          ╠══════════════════════════════════════════════════╣
                          ║          1. Ver los envíos sin asignar           ║
                          ╠══════════════════════════════════════════════════╣
                          ║        2. Asignar un envío a un conductor        ║
                          ╠══════════════════════════════════════════════════╣
                          ║  3. Ver un resumen de los usuarios registrados   ║
                          ╠══════════════════════════════════════════════════╣
                          ║ 4. Ver un resumen de los conductores registrados ║
                          ╠══════════════════════════════════════════════════╣
                          ║                 5. Ver mi perfil                 ║
                          ╠══════════════════════════════════════════════════╣
                          ║              6. Modificar mis datos              ║
                          ╠══════════════════════════════════════════════════╣
                          ║     7. Mostrar la configuración del sistema      ║
                          ╠══════════════════════════════════════════════════╣
                          ║            8. Registrar a un conductor           ║
                          ╠══════════════════════════════════════════════════╣
                          ║           9. Hacer copia de seguridad            ║
                          ╠══════════════════════════════════════════════════╣
                          ║             10. Exportar los envíos              ║
                          ╠══════════════════════════════════════════════════╣
                          ║                11. Cerrar sesión                 ║
                          ╠══════════════════════════════════════════════════╣
                          ║              12. Apagar el sistema               ║
                          ╚══════════════════════════════════════════════════╝
                          Elije una opción: """,appController.getLastUserAccess("admin"), appController.numUser(), appController.numDriver(), appController.numShipmentsPending(),
                appController.numShipmetnsNoDriver(), appController.numNoRegisteredUserShipment(), appController.deliveryDaysAverage());
    }

    //FUNCTION WHICH RETURN SHIPMENT INFO WITHOUT LOGIN
    public static void tracking(AppController appController) {
        try {
            System.out.print("Introduce el número de seguimiento del envío: ");
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
        InfoShipmentDataClass shipmentDataClass = appController.searchShipmentByNoIdNoLogin(Integer.parseInt(S.nextLine()));
        if (shipmentDataClass == null) System.out.println("No se ha encontrado el envío");
        else System.out.println(shipmentDataClass.forTracking());
    }

    //LOGIN
    public static Object login(AppController appController) {
        String email = "", pass = "", resultado = "";
        System.out.print("Introduce el correo electrónico: ");
        email = S.nextLine();
        System.out.print("Introduce la contraseña: ");
        pass = S.nextLine();

        return appController.login(email, pass);
    }

    //FUNCTION WHICH SEND A NUMBER TO USER EMAIL TO CONFIRM REGISTER
    public static boolean registerMessage(String correo, String name) {
        int numAleatorio = (int) (Math.random() * 10000);
        //Comunicaciones.enviarMensaje(correo, "Número de confirmación de registro", Plantilla.tokenRegistro(name, correo, numAleatorio));
        Pdf.conviertePdf("Querido " + name + ". Aquí tiene su número de confirmación de registro para verificar su cuenta en Fernanpaaq " + numAleatorio);
        Comunicaciones.enviarPdf(correo,"Número de confirmación de registro ","Querido " + name + " aqui tiene su número de confirmación de registro para verificar" +
                " su cuenta en FernanPaaq " + numAleatorio);
        int numTeclado = 0;
        do {
            try {
                System.out.print("Introduce el número de confirmación (-1 para salir): ");
                numTeclado = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número");
            }
            if (numTeclado != numAleatorio) System.out.println("Número de confirmación erroneo");
            if (numTeclado == -1) return false;
        } while (numTeclado != numAleatorio);
        return true;
    }

    //FUNCTION WHICH ASKS NAME, EMAIL AND PASSWORD TO REGISTER DRIVER IN SYSTEM
    public static void registerDriver(AppController appController) {
        String name = "", email = "", password = "";
        System.out.print("Introduce el nombre del conductor: ");
        name = S.nextLine();

        do {
            System.out.print("Introduce el email del conductor: ");
            email = S.nextLine();
            if (appController.searchDriverByEmail(email) != null || appController.searchUserByEmail(email) != null)
                System.out.println("Ya existe un conductor o usuario con ese email");

        } while (appController.searchDriverByEmail(email) != null || appController.searchUserByEmail(email) != null);

        System.out.print("Introduce la contraseña del email: ");
        password = S.nextLine();

        if (registerMessage(email, name)) {
            if (appController.addDriver(name, email, password)) {
                System.out.println("Se ha registrado el conductor " + name + " correctamente");
            } else System.out.println("No se ha podido completar el registro");
        }
    }

    //FUNCTION WHICH ASKS NAME,SURNAME,EMAIL,PASS,STREET,CITY,STATE,PHONE,POSTALCODE,NUM TO REGISTER USER IN SYSTEM
    public static User register(AppController appController) {
        String name = "", surname = "", email = "", password = "", city = "", state = "", street = "";
        int phone = 0, postaCode = 0, num = 0;

        System.out.print("Introduce el nombre del usuario: ");
        name = S.nextLine();
        System.out.print("Introduce el apellido del usuario: ");
        surname = S.nextLine();

        do {
            System.out.print("Introduce el email del usuario: ");
            email = S.nextLine();
            if (appController.searchUserByEmail(email) != null)
                System.out.println("Ya existe un usuario con ese email");
        } while (appController.searchUserByEmail(email) != null || appController.searchAdminByEmail(email) != null);

        System.out.print("Introduce la contraseña: ");
        password = S.nextLine();

        do {
            try {
                System.out.print("Introduce el número de teléfono del usuario: ");
                phone = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {

            }
            if (appController.searchUserByPhone(phone) != null)
                System.out.println("Ya existe un usuario con ese teléfono");
        } while (appController.searchUserByPhone(phone) != null);

        System.out.print("Introduce la calle del usuario: ");
        street = S.nextLine();
        try {
            System.out.print("Introduce el número de vivienda del usuario: ");
            num = Integer.parseInt(S.nextLine());
        } catch (NumberFormatException e) {

        }
        System.out.print("Introduce la localidad del usuario: ");
        city = S.nextLine();
        try {
            System.out.print("Introduce el código postal: ");
            postaCode = Integer.parseInt(S.nextLine());
        } catch (NumberFormatException e) {

        }
        System.out.print("Introduce la provincia del usuario: ");
        state = S.nextLine();

        if (registerMessage(email, name)) {
            if (appController.addUser(name, surname, email, phone, password, street, num, city, state, postaCode)) {
                appController.getShipmentNoRegisteredUser(email);
                System.out.println("Se ha registrado el ususario " + name + " correctamente");
                return appController.searchUserByEmail(email);
            }
        } else System.out.println("No se ha podido completar el registro");
        return null;
    }

    public static void userMenu(AppController appController, User user) { //FUNCTION WHICH EXECUTE USERMENU
        int op = 0;
        String action = "logOut;"; //TODO CAMBIAR A PROPERTIES
        do {
            printUserMenu(appController, user);
            try {
                op = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {

            }
            switch (op) {
                case 1:
                    addShiptment(appController, user); //ADD SHIPMENT TO USER AND RECIEVER
                    Utils.pulseToContinue();
                    break;
                case 2:
                    printRecieverDeliveries(appController, user); //PRINT SENDED SHIPMENT TO USER
                    Utils.pulseToContinue();
                    break;
                case 3:
                    changeDeliveryData(appController, user); //CHANGE ADDRESS SHIPMENT
                    Utils.pulseToContinue();
                    break;
                case 4:
                    printShipmentsFromUser(appController, user); //PRINT SHIPMENT SENDED BY USER
                    Utils.pulseToContinue();
                    break;
                case 5:
                    printUserInfo(user); //PRINT USER INFO
                    Utils.pulseToContinue();
                    break;
                case 6:
                    changeUserInfo(appController, user); //CHANGE USER INFO
                    Utils.pulseToContinue();
                    break;
                case 7:
                    System.out.println("Cerrando sesión"); //LOG OUT
                    Persistencia.sessionLogs(user,action);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (op != 7);
    }

    public static void changeUserInfo(AppController appController, User user) { //FUNCTION WHICH SHOW A MENÚ TO CHOOSE A OPTION AND CHANGE USER INFO
        int op = 0;
        try {
            System.out.print("""
                    ¿Qué deseas cambiar?
                    1. Nombre
                    2. Apellidos
                    3. Email
                    4. Contraseña
                    5. Dirección de entrega
                    6. Número de teléfono
                    Elige una opción: """);
            op = Integer.parseInt(S.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
        switch (op) {
            case 1:
                System.out.print("Introduce tu nuevo nombre: ");
                user.setName(S.nextLine());
                break;
            case 2:
                System.out.print("Introduce tus nuevos apellidos: ");
                user.setSurName(S.nextLine());
                break;
            case 3:
                System.out.print("Introduce tu nuevo correo: ");
                user.setEmail(S.nextLine());
                return;
            case 4:
                System.out.print("Introduce tu nueva contraseña: ");
                user.setPassword(S.nextLine());
                return;
            case 5:
                try {
                    System.out.println("Introduce tu nuevo código postal: ");
                    user.setPostalCode(Integer.parseInt(S.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
                System.out.println("Introduce tu nueva calle: ");
                user.setStreet(S.nextLine());
                try {
                    System.out.println("Introduce tu nuevo número de viviendo: ");
                    user.setNum(Integer.parseInt(S.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
                System.out.println("Introduce tu nueva ciudad: ");
                user.setCity(S.nextLine());
                System.out.println("Introduce tu nueva provincia: ");
                user.setState(S.nextLine());
                break;
            case 6:
                try {
                    System.out.print("Introduce tu nuevo número de teléfono: ");
                    user.setPhone(Integer.parseInt(S.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
        Persistencia.saveUser(user);
    }

    public static void printShipmentsFromUser(AppController appController, User user) { //FUNCTION WHICH PRINT SHIPMENT SENDED BY USER
        for (InfoShipmentDataClass i :
                appController.getShipmentsFromUser(user)) {
            System.out.println("====== Envío realizado por " + user.getName() + " ======");
            System.out.println(i);
        }
        if (appController.getShipmentsFromUser(user).isEmpty()) System.out.println("No has realizado ningún envío");
    }

    private static void changeDeliveryData(AppController appController, User user) { //FUNCTION WHICH ASK NEW ADDRESS, POSTALCODE AND UPDATE SHIPMENT DATA
        int postaCode = 0;
        String resultado = "";
        if (user.getShipments().isEmpty()) System.out.println("No hay ningún envío para poder modificar");
        else {
            for (Shipment s :
                    user.getShipments()) {
                if (!s.getStatus().equals(Estatus.entregado)) resultado += s;
            }
            if (resultado.equals("")) System.out.println("No hay ningún envío para poder modificar");
            else {
                System.out.println(resultado);
                System.out.print("Introduce el id del envío: ");
                int idShipment = Integer.parseInt(S.nextLine());
                System.out.print("Introduce la nueva dirección de envío: ");
                String address = S.nextLine();
                try {
                    System.out.print("Introduce el nuevo código postal: ");
                    postaCode = Integer.parseInt(S.nextLine());
                } catch (NumberFormatException e) {

                }

                if (appController.changeDeliveryData(idShipment, address, postaCode))
                    System.out.println("Datos modificados correctamente");
                else System.out.println("Ha ocurrido un error");
            }
        }
    }

    private static void printRecieverDeliveries(AppController appController, User user) { //PRINT SHIPMENT TO USER
        String resultado = "";
        for (InfoShipmentDataClass i :
                appController.getShipmentsPendingToUser(user.getId())) {
            resultado += "======= Envio para recibir =======";
            resultado += i;
        }
        if (resultado.equals("")) resultado += "No hay ningún envío pendiente";
        System.out.println(resultado);
    }

    private static void printUserInfo(User user) { //PRINT USER INFO
        System.out.println(user);
    }

    public static boolean addShiptment(AppController appController, User user) { //FUNCTION WHICH ADD SHIPMENT TO USER AND RECIEVER
        int alternativePostalCode = 0;
        User user1;
        String teclado;
        boolean notifications;

        do {
            System.out.print("¿Deseas recibir información?: (Si / No) ");
            teclado = S.nextLine().toLowerCase();
        } while (!teclado.equals("si") && !teclado.equals("no"));
        if (teclado.equals("si")) notifications = true;
        else notifications = false;

        System.out.print("Introduce el correo de la persona: ");
        String email = S.nextLine();
        user1 = appController.searchUserByEmail(email);

        if (user1 == null) {
            int phone = 0;
            try {
                System.out.print("No se ha encontrado al usuario por su correo." +
                        "\nIntroduce su número de teléfono: ");
                phone = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir digitos");
            }
            user1 = appController.searchUserByPhone(phone);
            if (user1 == null) {
                System.out.print("\nNo se ha encontrado su número de teléfono, asignaremos el envío a usuarios no registrados\n");
                System.out.print("Introduce el nombre de la persona: ");
                String alternativeName = S.nextLine();
                System.out.print("Introduce tu codigo Postal: ");
                alternativePostalCode = Integer.parseInt(S.nextLine());
                System.out.print("Introduce la dirección de entrega: ");
                String alternativeAddress = S.nextLine();
                System.out.print("Introduce la ciudad de entrega: ");
                String alternativeCity = S.nextLine();

                Shipment shipment = appController.addShiptmentToNoRegisterUser(user.getId(), email, alternativePostalCode, alternativeAddress, alternativeName, notifications, alternativeCity);
                Persistencia.newShipmentLog(shipment);
                System.out.println("Se ha creado el envío. Su número de seguimiento es: " + shipment.getId());
                return true;
            } else {
                Shipment shipment = appController.addShiptment(user.getId(), user1.getId(), notifications);
                Persistencia.newShipmentLog(shipment);
                System.out.println("Se ha creado el envío. Su número de seguimiento es: " + shipment.getId());
                return true;
            }
        } else {
            Shipment shipment = appController.addShiptment(user.getId(), user1.getId(), notifications);
            Persistencia.newShipmentLog(shipment);
            user1 = appController.searchUserById(shipment.getIdReciever());
            //Comunicaciones.enviarMensaje(user1.getEmail(), "Nuevo envío", Plantilla.correoEstado(user1.getName(), user1.getEmail(), user1.getAddres(), "Se acaba de crear un paquete", shipment.getId()));
            System.out.println("Se ha creado el envío. Su número de seguimiento es: " + shipment.getId());
            return true;
        }
    }

    //ADMIN FUNCTION
    public static void printUnassignedShipment(AppController appController) { //PRINT UNASSIGNEDSHIPMENT
        String resultado = "";
        for (InfoShipmentDataClass i :
                appController.getShipmentsUnassigned()) {
            resultado += i.toString();
        }
        if (resultado.equals("")) resultado += "No hay ningún envío pendiente de asignar";
        System.out.println(resultado);
    }

    public static void driverMenu(AppController appController, Driver driver) { //FUNCTION WHICH EXECUTE DRIVER MENU
        int op = 0;
        String action = "logOut;"; //TODO CAMBIAR A PROPERTIES
        do {
            printDriverMenu(appController, driver);
            try {
                op = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {

            }
            switch (op) {
                case 1:
                    printDriverShipmentPending(appController, driver); //PRINT DRIVER SHIPMENT PENDING TO DELIVER
                    Utils.pulseToContinue();
                    break;
                case 2:
                    changeDeliveryStatus(appController, driver); //PRINT DRIVER SHIPMENT PENDING TO DELIVER AND SHOW SOME OPTIONS TO UPDATE DELIVERY STATUS
                    Utils.pulseToContinue();
                    break;
                case 3:
                    printDriverShipmentDelivered(appController, driver); //PRINT SHIPMENT DELIVERED BY DRIVER
                    Utils.pulseToContinue();
                    break;
                case 4:
                    addZoneDelivery(appController, driver); //ADD POSTALCODE TO ZONEDELIVERIES ARRAYLIST
                    Utils.pulseToContinue();
                    break;
                case 5:
                    printDriverInfo(driver); //PRINT DRIVER INFO
                    Utils.pulseToContinue();
                    break;
                case 6:
                    changeDriverInfo(appController, driver); //CHANGE DRIVER INFO
                    Utils.pulseToContinue();
                    break;
                case 7:
                    System.out.println("Cerrando sesión"); //LOG OUT
                    Persistencia.sessionLogs(driver,action);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (op != 7);
    }

    public static void changeDriverInfo(AppController appController, Driver driver) { //FUNCTION WHICH ASK NEWEMAIL AND PASS FOR DRIVER AND UPDATE IT.
        System.out.print("Introduce tu nuevo correo: ");
        String newEmail = S.nextLine();
        System.out.print("Introduce tu nueva contraseña: ");
        String pass = S.nextLine();

        if (appController.changeDriverInfo(driver.getEmail(), newEmail, pass))
            System.out.println("Se ha cambiado la información del conductor correctamente");
        else System.out.println("No se ha podido cambiar la información del conductor");
    }

    public static void printDriverInfo(Driver driver) { //PRINT DRIVER INFNO
        System.out.println(driver);
    }

    public static void addZoneDelivery(AppController appController, Driver driver) { //FUNCTION WHICH ASK POSTALCODE AND ADD TO DRIVER DELIERIES ZONE
        int postalCode = 0;
        try {
            System.out.print("Introduce el nuevo código postal: ");
            postalCode = Integer.parseInt(S.nextLine());
        } catch (NumberFormatException e) {

        }
        appController.addZoneToDriver(driver.getId(), postalCode);
    }

    public static void printDriverShipmentDelivered(AppController appController, Driver driver) { //PRINT SHIPMENT DELIVERED BY DRIVER
        String resultado = "";
        for (InfoShipmentDataClass i :
                appController.getShipmentsFinisDriver(driver.getId())) {
            resultado += "=== Envíos entregados por el conductor ===";
            resultado += i;
        }
        if (resultado.equals("")) resultado += "No hay ningún envío";
        System.out.println(resultado);
    }

    public static void changeDeliveryStatus(AppController appController, Driver driver) { //UPDATE DELIVERY STATUS
        int id = 0;
        if (!appController.getShipmentPendingDriver(driver.getId()).isEmpty()) {
            try {
                printDriverShipmentPending(appController, driver);
                System.out.print("Introduce el envío a modificar: ");
                id = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error");
            }

            System.out.print("Estado del envío: " +
                    "\n1. En oficina de origen" +
                    "\n2. En reparto" +
                    "\n3. Entregado" +
                    "\nElige un estado: ");
            String newStatus = switch (Integer.parseInt(S.nextLine())) {
                case 1 -> Estatus.oficina;
                case 2 -> Estatus.enReparto;
                default -> Estatus.entregado;
            };

            appController.changeDeliveryStatus(id, newStatus);
            System.out.println("Se ha cambiado el estado del envío");
        } else System.out.println("No hay ningún envío para poder modificar");
    }

    public static void printDriverShipmentPending(AppController appController, Driver driver) {
        int cont = 1;
        String resultado = "";
        for (InfoShipmentDataClass i :
                appController.getShipmentPendingDriver(driver.getId())) {
            resultado += "==== Envío " + cont + " pendiente del conductor ====";
            resultado += i;
            cont++;
        }
        if (resultado.equals("")) resultado += "No hay ningún envío pendiente de entrega";
        System.out.println(resultado);
    }

    //ADMIN
    public static void adminMenu(AppController appController, Admin admin) { //FUNCTION WHICH EXECUTE ADMIN MENU
        int opMenu = 0;
        String action = "logOut;"; //TODO CAMBIAR A PROPERTIES

        do {
            try {
                printAdminMenu(appController);
                opMenu = Integer.parseInt(S.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes escribir un número");
            }
            switch (opMenu) {
                case 1:
                    printUnassignedShipment(appController); //PRINT UNASSIGNEDSHIPMENT
                    Utils.pulseToContinue();
                    break;
                case 2:
                    setDriverToDelivery(appController); //PRINT UNASSIGNEDSHIPMENT AND DRIVERS. ADMIN CHOOSE A SHIPMENT AND SET IT TO A DRIVER
                    Utils.pulseToContinue();
                    break;
                case 3:
                    printUserInfoForAdmin(appController); //PRINT A RESUME FOR ALL REGISTERED USERS IN SYSTEM
                    Utils.pulseToContinue();
                    break;
                case 4:
                    printDriverInfoForAdmin(appController); //PRINT A RESUME FOR ALL REGISTERED DRIVERS IN SYSTEM
                    Utils.pulseToContinue();
                    break;
                case 5:
                    printAdminInfo(appController, admin); //PRINT ADMIN INFNO
                    Utils.pulseToContinue();
                    break;
                case 6:
                    changeAdminInfo(appController, admin); //CHANGE ADMIN INFO
                    opMenu = 7;
                    Utils.pulseToContinue();
                    break;
                case 7:
                    printPropertiesInfo(appController); //PRINT ALL PROPERTIES FILE INFO
                    Utils.pulseToContinue();
                    break;
                case 8:
                    registerDriver(appController); //REGISTER A DRIVER
                    Utils.pulseToContinue();
                    break;
                case 9: //SEGURITY COPY
                    copy(appController);
                    break;
                case 10: //EXPORT SHIPMENTO TO XLS FILE
                    exportShipment(appController);
                    Utils.pulseToContinue();
                    break;
                case 11:
                    System.out.println("Cerrando sesión"); //LOG OUT
                    Persistencia.sessionLogs(admin,action);
                    Utils.pulseToContinue();
                    break;
                case 12:
                    System.out.println("Cerrando programa");
                    Persistencia.sessionLogs(admin,"closeSystem");
                    Utils.pulseToContinue();
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opMenu != 11);

    }

    private static void exportShipment(AppController appController) {
        try {
            appController.generateShipmentExcel();
            System.out.println("Se han importado los envíos al archivo xsls correctamente");
        } catch (Exception e) {
            System.out.println("Error. No se ha podido exportar las información de los envíos");
        }
    }

    private static void printPropertiesInfo(AppController appController) {
        System.out.println("*** Información del fichero properties ***");
        System.out.println(appController.printProperties());
        System.out.println("**********************");
    }

    public static void copy(AppController appController) {
        System.out.println("Para realizar la copia de seguridad debes introducir la ruta absoluta del archivo que vas a generar" +
                " (C:\\Users\\usuario\\copiaSeguridad\\copia.backup): ");
        String ruta = S.nextLine();
        if (appController.makeCopy(ruta)) System.out.println("Se ha realizado la copia de seguridad correctamente");
        else System.out.println("No se ha podido realizar la copia de seguridad");
    }

    private static void printUserInfoForAdmin(AppController appController) { //PRINT A INFO RESUME OF USER FOR ADMIN
        String resultado = "";
        for (User u :
                appController.getUsers()) {
            resultado += "==== Información de usuario ====";
            resultado += u.resumeForAdmin();
        }
        if (resultado.equals("")) resultado += "No hay ningún usuario registrado";
        System.out.println(resultado);
    }

    public static void changeAdminInfo(AppController appController, Admin admin) { //ASK NEW EMAIL AND PASSWORD FOR ADMIN.
        System.out.print("Introduce tu nuevo email: ");
        String email = S.nextLine();
        System.out.print("Introduce tu nueva clave: ");
        String pass = S.nextLine();

        if (appController.changeAdminInfo(admin, email, pass))
            System.out.println("Se ha cambiado la información correctamente");
        else System.out.println("Ha ocurrido un error");
    }

    public static void printAdminInfo(AppController appController, Admin admin) { //PRINT ADMIN INFO
        System.out.println(admin);
    }

    public static void printDriverInfoForAdmin(AppController appController) { //PRINT A INFO RESUME OF DRIVER FOR ADMIN
        String resultado = "";
        for (Driver d :
                appController.getDrivers()) {
            resultado += d.resumeForAdmin();
        }
        if (resultado.equals("")) resultado += "No hay ningún conductor registrado";
        System.out.println(resultado);
    }

    public static void setDriverToDelivery(AppController appController) { //SET A SHIPMENTO TO A DRIVER
        int idDriver, op;
        User reciever;
        Driver driver;

        if (appController.getShipmentsUnassigned().isEmpty()) System.out.println("No hay envíos pendientes de asignar");
        else {
            printUnassignedShipment(appController);
            System.out.print("Introduce el  envío a asignar: ");
            op = Integer.parseInt(S.nextLine()) - 1;
            Shipment shipment = appController.searchShipmentById(appController.getShipmentsUnassigned().get(op).getId());

            //CHECK IF SHIPMENT HAS BEEN SEND TO A REGISTER USER OR A NO REGISTER USER
            if (shipment.getAlternativePostalCode() == -1) {
                reciever = appController.searchUserById(shipment.getIdReciever());
                driver = appController.searchBestDriverByPostalCode(reciever.getPostalCode());
            } else {
                driver = appController.searchBestDriverByPostalCode(shipment.getAlternativePostalCode());
            }

            //CHECK IF BEST DRIVER FOR SHIPMENT IS NULL AND SET HIM TO SHIPMENT
            if (driver != null) {
                System.out.println(driver.resumeForAdmin());
                System.out.println("Se le ha asignado el conductor " + driver.getName());
                appController.setShipmentToDriver(shipment.getId(), driver.getId());
            } else {
                printDriverInfoForAdmin(appController);
                System.out.print("Elige al conductor: (Introduce el número de lista)");
                idDriver = Integer.parseInt(S.nextLine()) - 1;

                driver = appController.getDrivers().get(idDriver);

                if (appController.setShipmentToDriver(shipment.getId(), driver.getId())) System.out.println("Se le ha asignado el conductor " + driver.getName());
                else System.out.println("No se ha podido asignar el envio");
            }
        }
    }
}