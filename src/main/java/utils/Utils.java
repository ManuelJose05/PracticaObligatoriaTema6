package utils;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class Utils {
    public static void pulseToContinue(){
        var s = new Scanner(System.in);
        System.out.print("Pulse any key: ");
        s.nextLine();
    }
    public static void loading(){
        System.out.print("Loading");
        for (int i = 0; i < 3 ; i++) {
            try {
                Thread.sleep(700);
                System.out.print(".");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
    public static String dateFormatter(LocalDateTime fecha){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss | dd/MM/yyyy");
        return fecha.format(f);
    }
    public static String deleteFormat(String file){
        return file.substring(0,file.indexOf('.'));
    }
    public static String dayFormatter(LocalDate fecha){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(f);
    }
}
