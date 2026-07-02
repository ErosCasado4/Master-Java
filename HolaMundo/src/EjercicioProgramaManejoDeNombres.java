import java.util.Scanner;

public class EjercicioProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name1 = "";
        String name2 = "";
        String name3 = "";

        System.out.println("Añade los nombres de tu familiares o amigos: ");
        name1 = scanner.nextLine();
        System.out.println("Primer nombre: ".concat(name1));
        name2 = scanner.nextLine();
        System.out.println("Segundo nombre: ".concat(name2));
        name3 = scanner.nextLine();
        System.out.println("Tercer nombre: ".concat(name3));

        String newName1 = name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length()-2);
        String newName2 = name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length()-2);
        String newName3 = name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length()-2);

        String res = newName1 + "_" + newName2 + "_" + newName3;

        System.out.println("Perfecto, gracias. Esta es la segunda letra en mayuscula y sus ultimas dos letras: ".concat(res));
    }
}
