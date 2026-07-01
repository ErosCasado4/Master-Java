public class ConversionDeTipos {
    public static void main(String[] args) {
        //Explicacion aunque no me sea necesario por si me da la neura de desviarme del sendero de dios y se me olvida
        //La conversion sirve para cambiar el tipo de dato de la variable asignada, todos son String en este caso al inicializar
        //Pero con el parse hecho al tipo al que queremos la conversion, modificamos su valor al que queremos.
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9876543";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "tRuE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        /*
        Explicacion de aqui pabajo. Asignamos un valor entero de 100, que mas adelante será pasado a cadeba
        al hacerle la conversion mediante otra variable. Asi mismo, luego asignamos otro valor a otroNumeroStr, que sera el ya asignado + 10
        Finalizamos haciendo un casting de doble a cadena, en el que ademas movemos la coma hacia otro lado. Y finalizamos dandole otro valor para que sea float
         */
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Vamos a hacer cast aqui abajo. Cast es convertir el tipo de variable asignado a otro tipo. No es posible hacer cast de todos los tipos
        //Por ejemplo, hay incompatibilidad de int a bool, o si la carga de bytes que soporta es inferior a la que hace el casteo,
        //Puede perder información.
        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
