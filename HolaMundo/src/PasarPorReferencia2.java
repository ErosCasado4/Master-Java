import javax.swing.*;
import java.util.Scanner;

class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {


        Persona persona = new Persona();
        persona.modificarNombre("Eros");

        System.out.println("Iniciamos el metodo main.");
        System.out.println("El nombre inicial es " + persona.leerNombre());

        System.out.println("Antes de llamar al metodo test.");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("El nombre despues de usar el metodo test es " + persona.leerNombre());
        System.out.println("Finaliza el metodo main.");
    }

    public static void test(Persona persona){

        Scanner s = new Scanner(System.in);

        System.out.println("Iniciamos el metodo test.");
        persona.modificarNombre(JOptionPane.showInputDialog("Añade el nombre: "));
        System.out.println("Finaliza el metodo test.");
    }
}
