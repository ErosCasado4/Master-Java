import java.util.Scanner;

public class PasarPorReferencia {
    public static void main(String[] args) {


        int[] edad = {10,15,20};

        System.out.println("Iniciamos el metodo main.");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test.");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main con los datos del array modificados.");
    }

    public static void test(int[] edadArray){

        Scanner s = new Scanner(System.in);

        System.out.println("Iniciamos el metodo test.");
        for (int i = 0; i < edadArray.length; i++) {
            System.out.println("Añade los nuevos valores:");
            edadArray[i] = s.nextInt();
        };
        System.out.println("Finaliza el metodo test.");
    }
}
