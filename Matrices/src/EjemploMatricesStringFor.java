public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][3];
        nombres[0][0] = "Melissa";
        nombres[0][1] = "Eros";
        nombres[0][2] = "Dylan";

        nombres[1][0] = "Ayla";
        nombres[1][1] = "Viktor";
        nombres[1][2] = "Dennis";

        nombres[2][0] = "Charlotte";
        nombres[2][1] = "Pedro";
        nombres[2][2] = "Robert";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++) {

            for (int j = 0; j < nombres[i].length ; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\nIterando con foreach: ");
        for (String[] fila: nombres){

            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
