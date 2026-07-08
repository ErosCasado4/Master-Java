import javax.swing.*;

public class EjercicioAdministrarProductosSentencias {
    public static void main(String[] args) {

        int cont = 0;

      String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: \n1.- Actualizar. " +
                       "\n2.- Eliminar. \n3.- Agregar. \n 4.- Ordenar. \n5.- Salir");
      cont = Integer.parseInt(opcion);

            switch (cont){
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Usuario agregado correctamente.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Usuarios ordenado correctamente.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Has salido con éxito!");
                    break;
            }
            if (cont < 1 || cont > 5) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un registro válido, por favor.");
            } while (cont != 5);
        }
    }

