import java.util.Scanner;

public class SentencialIfElse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Añade tu nota promedio: ");
        float media = s.nextFloat();

        if (media >= 8) {
            System.out.println("Enhorabuena, tu nota es increíble");
        } else if (media >= 6.5) {
            System.out.println("Buena nota, felicidades.");
        } else if (media >= 5.5) {
            System.out.println("Has aprobado, pero puedes mejorar. Enhorabuena.");
        } else if (media >= 5.0) {
            System.out.println("Aprobado, pero no te duermas en los laureles!");
        } else {
            System.out.println("Estudia, estás suspenso.");
        }
    }
}
