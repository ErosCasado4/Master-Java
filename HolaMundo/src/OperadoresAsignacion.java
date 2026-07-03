public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5, j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; //Suma 2 al valor de i
        System.out.println("i = " + i);

        i += 5; //Suma 5 al valor de i(5 + 5)
        System.out.println("i = " + i);

        j -= 4; //Idem arriba pero en resta, creo que asi nos entendemos ya con ejemplitos
        System.out.println("j = " + j);

        j *= 3;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c"; //Podemos formar cadenas de texto como por ejemplo consultas sql
        sqlString = " where c.name = 'Eros'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
