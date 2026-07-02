public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        /*
        Explicacion rapida, hay dos formas de concatenar. Esta que vemos con suma, en la que usamos por detras la instancia builder
        Es mas enrevesada pese a parecer mas simple(mierdon absoluto)
         */
        String detalle = curso + " con el sensei " +  profesor;
        System.out.println(detalle);

        int numA = 10;
        int numB = 5;

        System.out.println(detalle + numA + numB);

        System.out.println(numA + numB + detalle);
        /*
        Y esta que usamos el metodo concat y punto antes(.). Mejor esta.
         */
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
