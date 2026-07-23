public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil mercedes = new Automovil();
       mercedes.fabricante = "Mercedes-Benz";
       mercedes.modelo = "GLC Coupe 43";
       mercedes.color = "Plata";
       mercedes.cilindrada = 3.5;

       Automovil bmw = new Automovil();
       bmw.fabricante = "BMW";
       bmw.modelo = "Serie M3";
       bmw.color = "Azul";
       bmw.cilindrada = 3.0;


        System.out.println(mercedes.detalle());
        System.out.println(bmw.detalle());


    }
}
