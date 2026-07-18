import java.util.Scanner;

public class EjemploArrayNotasAlumnos {
    public static void main(String[] args) {

        double[] notasMates, notasLengua , notasHistoria ;
        notasMates = new double[7];
        notasLengua = new double[7];
        notasHistoria = new double[7];

        double aNotasMates = 0, aNotasLengua = 0, aNotasHistoria = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese las notas de matematicas.");
        for (int i = 0; i < notasMates.length; i++) {
            notasMates[i] = s.nextDouble();
            aNotasMates += notasMates[i];
        }
        System.out.println("Ingrese las notas de lengua.");
        for (int i = 0; i < notasLengua.length; i++) {
            notasLengua[i] = s.nextDouble();
            aNotasLengua += notasLengua[i];
        }
        System.out.println("Ingrese las notas de historia.");
        for (int i = 0; i < notasHistoria.length; i++) {
            notasHistoria[i] = s.nextDouble();
            aNotasHistoria += notasHistoria[i];
        }

        double promMates = (aNotasMates/notasMates.length);
        double promLengua = (aNotasLengua/notasLengua.length);
        double promHistoria = (aNotasHistoria/notasHistoria.length);
        double promTotal = ( (promMates+promLengua+promHistoria) /3 );

        System.out.println("Promedio de la clase de matemáticas: " + promMates);
        System.out.println("Promedio de la clase de lengua: " + promLengua);
        System.out.println("Promedio de la clase de historia: " + promHistoria);
        System.out.println("Promedio de la clase en las tres asignaturas: " + promTotal);

        System.out.println("Elige al alumno que quieres conocer sus notas. Elige un numero entre 0-6: ");
        int id = s.nextInt();
        double promedioAlumno = (notasMates[id] + notasHistoria[id] + notasLengua[id]) / 3;
        System.out.println("Promedio alumno nº " + id + " : " + promedioAlumno);
    }
}
