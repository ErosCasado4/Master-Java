public class SentenciaFor {
    public static void main(String[] args) {
        //Cada vez que i sea menor o igual que 10, valor de i suma 1
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        //Cada vez que i sea mayor o igual que 10, valor de i resta 1
        for (int i = 10; i >= 10; i--){
            System.out.println(i);
        }
        //Cada vez que i sea menor j, valor de i suma 1 y de j resta 1
        for (int i = 1, j = 10; i < j; i++,j--){
            System.out.println(i + " - " + j);
        }
        //Cada vez que i sea menor o igual que 10, valor de i  suma 1. Si i es par no imprime el valor de i
        for (int i = 0; i <= 10; i++){
            if ( !(i % 2 == 0) ){
                continue;
            }
            System.out.println(i);
        }
    }
}
