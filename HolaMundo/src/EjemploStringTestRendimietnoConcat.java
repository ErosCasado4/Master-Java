public class EjemploStringTestRendimietnoConcat {
    public static void main(String[] args) {
        //Ejercicio para comparar la diferencia y eficiencia de diferentes instancias y tiempos que tardan en cargarse.

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //1000 => 4ms 10000 => 124 100000 => 6750
            //c += a + b + "\n"; //1000 => 16ms 10000 => 70 100000 =>2508
            sb.append(a).append(b).append("\n"); //1000 => 1ms 10000 => 2 100000 => 13
        }
        //Esto es el recolector de basura. Sirve para reciclar instancias que no estamos utilizando. Optimo para cuando hay muchas instancias
        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
        /*Resumen
        el string builder es el mas rapido. El concat con elementos cortos merece la pena, pero a medida que subimos los elementos, pierde
        tiempo y gana valor la asignacion con suma
         */
    }
}
