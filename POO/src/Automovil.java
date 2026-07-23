public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    public String detalle(){
        StringBuilder sb = new StringBuilder();

        sb.append("Fabricante = " + this.fabricante);
        sb.append("\nModelo = " + this.modelo);
        sb.append("\nColor = " + this.color);
        sb.append("\nCilindrada = " + this.cilindrada);

        return sb.toString();
    }

}
