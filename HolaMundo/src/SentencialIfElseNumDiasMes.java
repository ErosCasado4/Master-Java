import java.util.Scanner;

public class SentencialIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("En que mes estamos: ");
        int m = s.nextInt();
        System.out.println("En que año estamos: ");
        int a = s.nextInt();

        int d = 0;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            d = 31;
            System.out.println("Este mes tiene " + d + " dias.");
        } else if (m == 4 || m == 6 || m == 9 || m == 11 ) {
            d = 30;
            System.out.println("Este mes tiene " + d + " dias.");
        } else if (m == 2) {
            if (a % 400 == 0 || ( (a %4 == 0) && !(a % 100 == 0)) ){
                d = 29;
                System.out.println("Este mes tiene " + d + " dias.");
            } else {
                d = 28;
                System.out.println("Este mes tiene " + d + " dias.");
            }
        }
    }
}
