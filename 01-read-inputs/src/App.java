import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade"); 
        int idade = scan.nextInt(); 

        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();    

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
}
