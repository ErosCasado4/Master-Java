public class EjemploString {
    public static void main(String[] args) {
        /*Tenemos dos formas de poder crear Objetos String, la primera es implicita. la Segunda es explicita. Pese a tener el mismo valor
        son objetos totalmente diferentes, no en valor, sino en la forma de declararlos. Es por ello que si los comparamos nos dará false.*/
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        String curso3 = new String("programación java");
        String curso4 = "Programación Java";

        /*
        De estas dos formas de comparar, pese a parecer lo mismo son diferentes. Una compara y devuelve false por lo comentado antes. La forma
        de crear el objeto es diferente aunque almacene el mismo valor. La segunda, al usar el metodo equals SI compara el valor de ambos objetos,
        aun estando instanciados de maneras diferentes. Usaremos en nuestro dia a dia el metodo equals y sus variables
         */
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        /*
        Vamos a hacer un ejemplo para ver otros metodos de comparacion. con equalsIgnoreCase dará igual que haya diferencias en mayusuclas y minusculas
        compara el valor ignorando las diferencias mencionadas.
         */
        boolean esIgual2 = curso.equalsIgnoreCase(curso3);
        System.out.println("esIgual2 = " + esIgual2);
        //Al compartir el mismo valor, se asigna la referencia del primer objeto
        esIgual = curso == curso4;
        System.out.println("esIgual = " + esIgual);
    }
}
