import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade");
        int idade = scan.nextInt();
        
        if( idade < 18 ) {
            System.out.println("Menor de idade");
        } else if( idade >= 18 && idade < 60 ) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Idoso");
        }

    }
}
