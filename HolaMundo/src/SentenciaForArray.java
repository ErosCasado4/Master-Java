import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {
        /*
        por dios llevaba tela sin hacer comentarios
        a ver, array de nombres. La idea es iterar sobre el largo del array. Luego, buscamos nombres
        si están en el array, lo muestra. Sino. dara, otro mensaje.
         */

        String[] nombres = {"Eros", "Melissa", "Dylan", "Ayla", "Croco", "Luffy", "Seraphim"};

        int count = nombres.length;
        for (int i = 0; i < count ; i++) {
            if (nombres[i].toLowerCase().contains("CROCO".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("LufFy".toLowerCase())) {
                continue;
            }
            System.out.println(i + " .-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresa un nombre. ejemplo\"Pedro\" o \"Maria\".");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
            } else {
                JOptionPane.showMessageDialog(null, buscar + " no existen registros de el.");
            }
        }
    }

