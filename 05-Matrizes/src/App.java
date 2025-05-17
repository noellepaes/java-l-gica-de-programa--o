public class App {
    public static void main(String[] args) throws Exception {
        
        
        double[][] notasPorAluno = new double[3][4];

        notasPorAluno[0][0] = 7.5;
        notasPorAluno[0][1] = 8.0;
        notasPorAluno[0][2] = 9.0;
        notasPorAluno[0][3] = 10.0;

        notasPorAluno[1][0] = 10.0;
        notasPorAluno[1][1] = 9.5;
        notasPorAluno[1][2] = 8.5;
        notasPorAluno[1][3] = 7.5;

        notasPorAluno[2][0] = 6.0;
        notasPorAluno[2][1] = 7.0;
        notasPorAluno[2][2] = 8.0;
        notasPorAluno[2][3] = 9.0;

        double soma;
        for(int i=0; i<notasPorAluno.length; i++){
            soma = 0;
           for(int j=0; j<notasPorAluno[i].length; j++){
                soma += notasPorAluno[i][j];
            }
            System.out.println("A média do aluno " + (i+1) + " é: " + (soma / notasPorAluno[i].length));
           }
        }

    }

