import java.util.Scanner;

public class SentenciaSwitchNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("En que mes estamos: ");
        int m = s.nextInt();
        System.out.println("En que año estamos: ");
        int a = s.nextInt();

        int d = 0;

        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                d = 31;
                System.out.println("Este mes tiene " + d + " dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                d = 30;
                System.out.println("Este mes tiene " + d + " dias.");
                break;
            case 2: if (a % 400 == 0 || ( (a %4 == 0) && !(a % 100 == 0)) ){
                    d = 29;
                    System.out.println("Este mes tiene " + d + " dias.");
                } else {
                    d = 28;
                    System.out.println("Este mes tiene " + d + " dias.");
            }
            break;
            default:
                System.out.println("Este mes no existe.");
        }
    }
}
