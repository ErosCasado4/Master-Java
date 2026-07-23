public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int deposito = 45;

    public String detalle(){

        return "Fabricante = " + this.fabricante +
                "\nModelo = " + this.modelo +
                "\nColor = " + this.color +
                "\nCilindrada = " + this.cilindrada;

    }

    public String acelerar(int rpm){
        return "El vehiculo " + fabricante + " " + modelo + " está acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return "El vehiculo " + fabricante + " " + modelo + " está acelerando frenando!";
    }

    public String acelerarFrenar(){
        String acelerar = this.acelerar(3000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeDeposito){
        return km/(deposito*porcentajeDeposito);
    }
    public float calcularConsumo(int km, int porcentajeDeposito){
        return km/(deposito*(porcentajeDeposito/100f));
    }

}
