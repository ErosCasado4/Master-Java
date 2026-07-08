import java.util.Scanner;

public class EjercicioSentenciaMultiplicacionSinSimbolo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Añade un numero: ");
        int num1 = s.nextInt();
        System.out.println("Añade un numero: ");
        int num2 = s.nextInt();
        boolean resNeg1 = false;
        boolean resNeg2 = false;


        int res = 0;

        if (num1 < 0){
            num1 = -num1;
            resNeg1 = true;
        }
        if (num2 < 0) {
            num2 = -num2;
            resNeg2 = true;
        }
        for (int i = 0; i < num1 ; i++) {
                res += num2;
        }
        if((!(resNeg1) && resNeg2) || (!(resNeg2) && resNeg1)){
            res = -res;
        }

        System.out.println("El resultado de la multplicacion es de: " + res);

    }
}
