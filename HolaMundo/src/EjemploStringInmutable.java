public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        //De esta forma no cambiara el valor de curso debido a la inmutabilidad del objeto
        //curso.concat(profesor);
        String resultado = curso.concat(profesor); //De esta forma SI. Estamos creando un objeto nuevo.
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        /*curso.transform(c ->{
            return c + " con " +  profesor;
        });*/ //Esperas que curso devuelva aqui el valor del transform? ERROR!! No hay objeto creado que modifique.
        System.out.println("curso = " + curso);
        String resultado2 = curso.transform(c ->{
            return c + " con " +  profesor;
        }); /*PEEEERO aqui MAGIA! hacemos lo mismo que arriba, pero con la diferencia de pasarlo como objeto. Curso no pierde su valor. pero podemos transformarlo si antes lo hacemos por
        otro objeto!*/
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "AA");

        //Pruebas en las que veremos nuevamente COMO si no asignamos un nuevo objeto, seguira inmutable(de ahi su palabra)
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

        /*
        Comentario para que lo entendamos bien. No se cambia el valor de objeto. Curso, o resultado siguen teniendo el mismo valor que tenian inicialmente.
        Gracias a crear un nuevo objeto y usar los metodos transform, replace, etc, podemos coger el valor de resultado y modificarlo a gusto,
        pero ese valor no cambia el valor del objeto referenciado. Toma el valor de ese objeto, lo modifica y lo asigna a uno nuevo. Por eso mismo, los
        objetos String son inmutables.
         */

    }
}
