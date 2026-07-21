public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {545,69,958,356},
                {984,232,1998,1036},
                {987,623,145,34}
        };

        int elementoBuscar = 34;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizEnteros.length; i++) {
            for ( j = 0; j < matrizEnteros[i].length ; j++) {
                if(elementoBuscar == matrizEnteros[i][j]) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        } else {
            System.out.println("No se ha encontrado el elemento " + elementoBuscar + " en la busqueda.");
        }
    }
}
