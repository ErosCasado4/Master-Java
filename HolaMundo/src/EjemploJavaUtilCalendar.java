import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, 11, 31, 24, 00, 00);
        calendario.set(Calendar.YEAR, 2026);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 26);
        calendario.set(Calendar.HOUR, 10);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 24);
        calendario.set(Calendar.SECOND, 26);

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);
    }
}
