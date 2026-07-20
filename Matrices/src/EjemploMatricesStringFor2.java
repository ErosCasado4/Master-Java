public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = { {"Melissa","Eros","Dylan"}, {"Ayla","Viktor","Dennis"}, {"Charlotte","Pedro","Robert"} };

        for (String[] fila: nombres){

            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
