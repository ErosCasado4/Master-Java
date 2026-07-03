import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "verdadero" : "falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double mates = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade tu nota de matemáticas: ");
        mates = scanner.nextDouble();
        System.out.println("Añade tu nota de ciencias: ");
        ciencias = scanner.nextDouble();
        System.out.println("Añade tu nota de historia: ");
        historia = scanner.nextDouble();

        System.out.println("Perfecto, estas son tus notas: " + mates + " " + ciencias
        + " " + historia );
        promedio = (mates + ciencias + historia) / 3;
        System.out.println("El promedio de tus notas es: " + promedio);

        estado = promedio >5.5 ? "Aprobado": "Suspenso";
        System.out.println(estado);
    }
}
