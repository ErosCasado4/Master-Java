import java.util.Scanner;

public class EjercicioSentenciaNotasClase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double media = 0.0;
        double mediaAlta = 0.0;
        double mediaBaja = 0.0;
        double nota = 0.0;
        int contAlta = 0;
        int contBaja = 0;
        double notas = 0.0;
        int notas1 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Añade la nota del alumno:");
            nota = s.nextDouble();
            if (nota >= 1 && nota <= 7) {
                notas += nota;
            }
            if (nota > 5 && nota <= 7){
                mediaAlta += nota;
                contAlta++;
            }
            if (nota < 4 && nota >= 1) {
                mediaBaja += nota;
                contBaja++;
            }
            if (nota == 1){
                notas1++;
            }
            else if (nota == 0) {
                System.out.println("Error, nota no conclusa.");
                break;
            }
        }
        media = notas / 20;
        mediaBaja = mediaBaja / contBaja;
        mediaAlta = mediaAlta / contAlta;
        System.out.println("Nota media = " + media);
        System.out.println("Media alta = " + mediaAlta + " numero de alumnos con notas superior a 5: " + contAlta);
        System.out.println("Media baja = " + mediaBaja + " numero de alumnos con notas inferior a 4: " + contBaja);
        System.out.println("Cantidad de alumnos con notas de 1: " + notas1);
    }
}
