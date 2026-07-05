import java.util.Scanner;

public class EjercicioCalculoGasolina {
    public static void main(String[] args) {

        double deposito = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Añade la medida actual del desosito de combustible: ");
        deposito = s.nextDouble();

        if (deposito == 70) {
            System.out.println("Deposito lleno.");
        } if (deposito >=60 && deposito < 70) {
            System.out.println("Deposito casi lleno.");
        } if (deposito >=40 && deposito < 60) {
            System.out.println("Deposito en 3/4.");
        } if (deposito >=35 && deposito < 40) {
            System.out.println("Medio deposito.");
        } if (deposito >=20 && deposito < 35) {
            System.out.println("Suficiente");
        } if (deposito >=1 && deposito < 20) {
            System.out.println("Insuficiente, llene cuanto antes.");
        } else {
            System.out.println("la capacidad máxima de su depósito es de 70 y usted ha marcado " +deposito + " , vuelva a intentarlo, por favor.");
        }
    }
}
