public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "siuuu_imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.lentgh()-4) = " + archivo.substring(i+1));
    }
}
