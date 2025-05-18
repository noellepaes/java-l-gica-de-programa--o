public class App {
    public static void main(String[] args) throws Exception {
        
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 9.0;
        notas[3] = 10.0;
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("A média é: " + media);
        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
