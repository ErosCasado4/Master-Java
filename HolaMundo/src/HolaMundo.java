public class HolaMundo {
    public static void main(String[] args){ //Podemos llamar al main facilmente con las inciiales psvm
        /*Evidentemente, aunque ya lo sepa, pero aqui lo hacemos todo desde el inicio, podemos imprimir por pantalla todo, desde variables y su valor*/
        //System.out.println("Hola mundo, supongo.");
        String saludar = "Hola mundo, supongo." ;
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 89;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 4;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 24+numero2;
            System.out.println("numero2 = " + numero2);
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;
        nombre = "Eros";
        if(numero>10) {
            nombre = "Dylan";
        }
        System.out.println("nombre = " + nombre);
    }
}

