import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {
        /*
        Lo que aqui hacemos es crear un array. Si, no es lo mas optimo, pero asi practico. En el, recogeremos el nombre completo de 3 personas
        Posteriorment lo que haremos será separar por espacios cada nombre guardado en el array y vamos a buscar por el NOMBRE mas
        largo de todos, no el nombre completo.
         */

        String[] nombresCompletos = new String[3];
        nombresCompletos[0] = JOptionPane.showInputDialog("Añade tu nombre por aquí: ");
        nombresCompletos[1] = JOptionPane.showInputDialog("Añade tu nombre por aquí: ");
        nombresCompletos[2] = JOptionPane.showInputDialog("Añade tu nombre por aquí: ");

        String nombreLargo = (nombresCompletos[0].split(" ")[0].length() > nombresCompletos[1].split(" ")[0].length() ) ? nombresCompletos[0] : nombresCompletos[1];
        nombreLargo = (nombreLargo.split(" ")[0].length() > nombresCompletos[2].split(" ")[0].length() ) ? nombreLargo : nombresCompletos[2];

        System.out.println("El nombre mas largo es: " + nombreLargo);
    }
}
