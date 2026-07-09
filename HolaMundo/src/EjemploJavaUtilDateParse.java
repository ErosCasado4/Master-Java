import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
/*
Formas de usar clase calendar, date, SimpleDateFormat y comparar fechas
 */
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingresa una fecha, ha de ser con formato dd-MM-yyyy");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            
            Date fecha2 = new Date();
            
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 es despues que fecha2(actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha1 es antes que fecha2(actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha1 es igual que fecha2(actual)");
            }
            
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 es despues que fecha2(actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha1 es antes que fecha2(actual)");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha1 es igual que fecha2(actual)");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
