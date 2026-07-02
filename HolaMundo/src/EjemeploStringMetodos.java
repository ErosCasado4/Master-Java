public class EjemeploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Eros";
/*
Diferentes metodos. length saca la cantidad de caracteres de una cadena
upper y lower ya sabemos. al igual que los equals y los compare.
charAt sirve para extraer un caracter concreto, van recorriendo desde el indice.
subsrtring para coger desde un punto concreto, o desde hasta.
 */
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Eros\") = " + nombre.equals("Eros"));
        System.out.println("nombre.equals(\"eros\") = " + nombre.equals("eros"));
        System.out.println("nombre.equalsIgnoreCase(\"eros\") = " + nombre.equalsIgnoreCase("eros"));
        System.out.println("nombre.compareTo(\"Eros\") = " + nombre.compareTo("Eros"));
        System.out.println("nombre.compareTo(\"Dylan\") = " + nombre.compareTo("Dylan"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-2) = " + nombre.charAt(nombre.length()-2));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        String esternocleidomastoideo = "esternocleidomastoideo";
        System.out.println("esternocleidomastoideo.replace(\"e\", \".\") = " + esternocleidomastoideo.replace("e", "."));
        System.out.println("esternocleidomastoideo = " + esternocleidomastoideo);
        System.out.println("esternocleidomastoideo.indexOf('n') = " + esternocleidomastoideo.indexOf('n'));
        System.out.println("esternocleidomastoideo.lastIndexOf('e') = " + esternocleidomastoideo.lastIndexOf('e'));
        System.out.println("esternocleidomastoideo.indexOf(\"nocle\") = " + esternocleidomastoideo.indexOf("nocle"));
        System.out.println("esternocleidomastoideo.contains(\"ideo\") = " + esternocleidomastoideo.contains("ideo"));
        System.out.println("esternocleidomastoideo.startsWith(\"es\") = " + esternocleidomastoideo.startsWith("es"));
        System.out.println("esternocleidomastoideo.endsWith(\"ea\") = " + esternocleidomastoideo.endsWith("ea"));
        System.out.println("     esternocleidomastoideo   ");
        System.out.println("     esternocleidomastoideo   .trim() = " + esternocleidomastoideo.trim());
        /*
        replace cambia un caracter por el que elgias. indexOf retorna el indice del caracter que buscas, lastIndexOf igual, pero del ultimo
        contains busca si existe dicha palabra o letra y devuelve el indice
        start y endswith devuelven true/false si lo que pasamos existe
        trim elimina espacios vacios y blancos a los lados
         */
    }
}
