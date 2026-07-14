import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"Rojo", "negro", "amarillo", "azul", "morado", "blanco"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);
//Hacemos cast a enteros, ya que sino es imposible poder extraer el indime random del array
        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);//Genera un numero entre 15 y 25, 25 inclusive
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
