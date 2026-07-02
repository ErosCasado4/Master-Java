public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
/*
Aqui empezamos con las validaciones en los if. Estamos verificando que de aqui en adelante el valor de curso sea el que esta asignado
y que veamos si el valor de curso tiene algun caracter escrito o no. Entonces, imprimiremos por pantalla los diferentes valores y entrara al
segundo if en caso de que esVacio o esVacio2 NO estén sin valor. Con un simple espacio, entraria en ese if y imprimiria Bienvenido al curso y ya
esNulo = true, pero los dos esVacio serian false, ya que al validar comprobamos que su valor no es vacio.
 */
        if(esNulo){
            curso = "";//"Programación Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        /*
        con este metodo podemos verificar que no existan elementos en blanco o con espacio. Es mas
        estricto que isEmpty, ya que tanto valida que no tenga valor como elementos que como el espacio no se
        vean a la percepcion humana.
         */
        boolean esVacio3 = curso.isBlank();

        if (!esVacio3/*!esVacio!esVacio2*/) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
