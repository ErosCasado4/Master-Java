import java.util.Scanner;

public class EjemploArrayBuscarString {
    public static void main(String[] args) {

        String [] a = new String[4];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un nombre: ");
            a[i] = s.next();
        }
        System.out.println("\n\nIngrese un numero a buscar: ");
        String nombre = s.next();
        int i = 0;
        for (; i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {}

        if(i == a.length){
            System.out.println("Nombre no encontrado.");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}
