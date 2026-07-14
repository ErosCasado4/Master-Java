public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Por favor, ingresar una operacion" +
                    "(suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

         String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
          a = Integer.parseInt(args[1]);
          b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Cuidado, a y b deben de ser enteros.");
            System.exit(-1);
        }
         switch (operacion){
             case "suma":
                 resultado = a+b;
                 break;
             case "resta":
                 resultado = a-b;
                 break;
             case "multi":
                 resultado = a*b;
                 break;
             case "div":
                 if (b == 0){
                     System.out.println("No se puede dividir entre 0.");
                     System.exit(-1);
                 }
                 resultado = (double)a/b;
                 break;
             default:
                 resultado = a+b;
         }

        System.out.println("El resultado de la operacion '" + operacion + "' es: " + resultado);
         /*
         Para pasar por comando, usamos en el terminal javac + nombre archivo.java, luego java + nombre archivo y pasamos parametros.
         Si queremos que tenga tildes y simbolos que quizas el terminal no imprime bien, usar javac + archivo y -encoding utf8
          */
    }
}
