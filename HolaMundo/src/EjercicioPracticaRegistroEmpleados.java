import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjercicioPracticaRegistroEmpleados {
    public static void main(String[] args) {
        /*
        Buscamos crear un programa en el que registremos 10 empleados. Para cada uno, se solicita Nombre, Año de nacimiento y Salario Mensual.
        Validacione: Si salario es menor a 0, mensaje de error y finalizar programa. Igual con el año de nacimiento, si es mayor al actual, salir.
        Clasificaciones: Segun edad. < 30 -> Junior. Entre 30 y 49, Semi Senior. Mayor de eso, Senior.
        Luego, mopstrar edad media, salario medio, empleado con mayor salario. el mas joven, cantidad de cada clasificacion.
        Solanmente podemos usar Scanner, For, if, String, arrays, Date.
        Bonus: Al finalizar el programa, Preguntar si queremos buscar un empleado por nombre (booleano).
         */

        String[] nombreEmpleado = new String[10];
        int [] anioNacimiento = new int[10];
        double[] salarioMes = new double[10];
        Date fechaActual = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Scanner s = new Scanner(System.in);
        int empleadoJunior= 0, empleadoMid = 0, empleadoSenior = 0, empleadoJoven = 0;
        double salarioMedia = 0.0, maxSalario = 0.0;
        int edad = 0;
        double salario = 0.0;
        double edadMed = 0.0, edadMedia = 0;
        int indiceEmpleado = 0;
        int indiceMaxSalario = 0;
        String anioActualStr = format.format(fechaActual);
        int anioActual = Integer.parseInt(anioActualStr);

        for (int i = 0; i < 5; i++) {
            System.out.println("Registra a los empleados, su año de nacimiento y su salario mensual, por favor.");
            nombreEmpleado[i] = s.nextLine();
            System.out.println("Nombre añadido, añade su año de nacimiento.");
            anioNacimiento[i] = s.nextInt();
            System.out.println("Ingrese el salario del empleado.");
            salarioMes[i] = s.nextDouble();
            s.nextLine();

            salario += salarioMes[i];
            edad = anioActual - anioNacimiento[i];
            edadMed += edad;

            if (anioNacimiento[i] > anioActual || salarioMes[i] < 0){
                System.out.println("Fecha de nacimiento no valida. Se reinicia el programa");
                return;
            }
            if (edad < 30){
                System.out.println("Empleado Junior.");
                empleadoJunior++;
            } else if (edad >= 30 && edad < 50) {
                System.out.println("Empleado mid-senior.");
                empleadoMid++;
            } else if (edad >= 50) {
                System.out.println("Empleado senior.");
                empleadoSenior++;
            }
            if (maxSalario < salarioMes[i]){
                maxSalario = salarioMes[i];
                indiceMaxSalario = i;
            }
            if (empleadoJoven < anioNacimiento[i]) {
                indiceEmpleado = i;
                empleadoJoven = anioNacimiento[i];

            }
        }

        salarioMedia = salario / 5;
        edadMedia = edadMed / 5;


        System.out.println("Edad media: " + edadMedia);
        System.out.println("Salario medio " + salarioMedia);
        System.out.println("Empleado con mayor salario: " + maxSalario + " con nombre " + nombreEmpleado[indiceMaxSalario]);
        System.out.println("Empleado mas joven: " + empleadoJoven + " con nombre " + nombreEmpleado[indiceEmpleado]);
        System.out.println("Cantidad de Juniors: " + empleadoJunior);
        System.out.println("Cantidad de mid senior: " + empleadoMid);
        System.out.println("Cantidad de Senior: " + empleadoSenior);

    }
}
