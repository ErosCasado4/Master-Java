public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {
//Creamos la frase y la palabra
        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo.";
        String palabra = "trigo";
/*
Creamos variables que recogen el largo de la palabra y el de la frase menos maxP
 */
        int maxP = palabra.length();
        int maxF = frase.length() - maxP;
/*
cantidad es el cotnador. Cada vez que i sea menor o igual al maxF, incrementamos el valor de i.
Pero antes, entramos en otro for, en el que si j es menor a maxP, incrementa. Dentro de ese for,
si k con post incremento, que toma el valor de i(frase) es diferente al caracter de j(palabra) continua con el loop.
solo suma cantidad cuando k++ sea == a j, de esa forma incrementa cantidad
 */
        int cantidad = 0;
        char letra = 'r';
        buscar:
        for (int i = 0; i <= maxF;) {
            int k = i;
            for (int j = 0; j < maxP ; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxP;
        }
        System.out.println("Encontrado: " + cantidad + " veces la palabra '" + palabra +"' en la frase!");
    }
}
