import java.util.Scanner;

public class EjercicioPracticaControlAcceso {
    public static void main(String[] args) {

        /*
         * Ejercicio de práctica sobre flujos de control.
         *
         * Simulación de un sistema de control de acceso a un evento donde,
         * en función de la edad, la entrada, el acceso VIP y el dinero
         * disponible, se determina si el usuario puede acceder o no.
         *
         * Conceptos practicados:
         * - Variables
         * - Scanner
         * - Operadores lógicos y relacionales
         * - if / else if / else
         * - Diseño de lógica condicional
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Indica tu nombre.");
        String name = s.nextLine();
        System.out.println("Bienvenido al festival " + name + ". Por favor, indica tu edad.");
        int edad = s.nextInt();
        boolean ticket = false;
        boolean vip = false;
        boolean dinero = false;

        if (edad == 18){
                System.out.println("Eres mayor de edad!");
            } else if (edad <= 17){
            System.out.println("Lo sentimos, no puedes pasar.");
            return;
            } else if (edad >=65){
                System.out.println("Tiene acceso preferente.");
            } else if (edad >= 18) {
            System.out.println("Perfecto, puede pasar. Antes de proceder, necesito verificar si tiene entrada.");
        }

        if (edad >= 18 && ticket == false) {
            System.out.println("¿Tienes entrada? Solo puede responder con TRUE o FALSE");
            ticket = s.nextBoolean();
        } if (ticket == true) {
            System.out.println("Bienvenido, " + name);
            ticket = true;
            return;
        } else if (ticket == false && vip == false){
            System.out.println("Lo sentimos mucho. ¿Tienes acceso vip?");
            vip = s.nextBoolean();
        } if (vip == true) {
            System.out.println("Bienvenido, " + name);
            return;
        }
        if (edad >= 18 && ticket == false && vip == false) {
            System.out.println("Está bien. Puede comprar la entrada, son 25. ¿Quieres una entrada?");
            dinero = s.nextBoolean();
        } if (edad >= 18 && ticket == false && vip == false && dinero == true) {
            System.out.println("Bienvenido, " + name);
            return;
        } else {
            System.out.println("Lo sentimos, acceso denegado.");
        }
    }
}
