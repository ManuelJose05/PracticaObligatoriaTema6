package data;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Estatus {
    private static final String PROPERTIESPATH = "src/main/java/config/config.properties";
    public static String enReparto = "";
    public static String entregado = "";
    public static String sinAsignar = "";
    public static String asignado = "";
    public static String oficina = "";
    private static Properties properties = new Properties();

    public static void loadEstatus(){
        try {
            FileReader fr = new FileReader(PROPERTIESPATH);
            properties.load(fr);
            enReparto = properties.getProperty("EN_REPARTO","EN_REPARTO");
            entregado = properties.getProperty("ENTREGADO","ENTREGADO");
            sinAsignar = properties.getProperty("SIN_ASIGNAR","SIN_ASIGNAR");
            asignado = properties.getProperty("ASIGNADO","ASIGNADO");
            oficina = properties.getProperty("OFICINA","OFICINA");
        } catch (IOException e) {
            entregado = "Entregado";
            enReparto = "En reparto";
            sinAsignar = "Sin asignar";
            asignado = "Asignado";
            oficina = "En oficina de origen";
        }
    }
}
