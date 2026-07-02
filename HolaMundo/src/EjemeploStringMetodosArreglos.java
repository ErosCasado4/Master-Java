public class EjemeploStringMetodosArreglos {
    public static void main(String[] args) {
/*
imprimimos el total de caracteres.
 */
        String esternocleidomastoideo = "esternocleidomastoideo";
        System.out.println("esternocleidomastoideo.length() = " + esternocleidomastoideo.length());
        System.out.println("esternocleidomastoideo.toCharArray() = " + esternocleidomastoideo.toCharArray());
/*
lo creamos como array e iteramos. En este primer for lo que hara es iterar el largo de la palabra. Como tiene 22, recorrerá 22 vueltas el if
 */
        char[] arreglo = esternocleidomastoideo.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("esternocleidomastoideo.split(\"a\") = " + esternocleidomastoideo.split("e"));
/*
creamos un array de cadena, pero con la diferencia de que aqui lo deparamos en bloques por cada vez
que se encuentgre la letra e. Es decir, lo que hará será entrar al for y recorrer cada vez que j sea menor que l,
l se incrementará. j retendrá el numero de bloques a la que corta la iteracion, es decir. Cortamos por la aparicion
de la letra e. con lo que la palabra se va a separar 4 veces. Justo ahi, j dejará de ser menor que l.
 */
        String[] arreglo2 = esternocleidomastoideo.split("e");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }
/*
Asi de esta forma hacemos lo mismo, a tener en cuenta. Si queremos obtener por punto, por ejemplo, debemos ponerlo
con \\ y entrecomillado. Al ser regex, de no ser asi no buscará correctamente.
Si queremos en este caso encontrar la extension, conociendo que va por punto, debemos hacerlo con [l(o el que sea) -1]
 */
        String archivo = "siuuu.imagen.jpg";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        for (int j = 0; j < l; j++) {
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
