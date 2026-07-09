import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjercicioCalcularEdadDate {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese su fecha de nacimiento:");
        Date fechaNacimiento = format.parse(s.next());
        System.out.println("Fecha de nacimiento indicada = " + fechaNacimiento);
        Date fecha2 = new Date();
        System.out.println("Fecha actual: " + fecha2);

        long dif = fecha2.getTime() - fechaNacimiento.getTime();
        long edadActual = dif / 31536000000L;
        System.out.println("Su edad actual es = " + edadActual);
    }
}
