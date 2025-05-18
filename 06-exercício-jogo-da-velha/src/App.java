// Faça um programa para jogar o jogo da velha. O programa deve
// permitir que dois jogadores façam uma partida do jogo da velha,
// usando o computador para ver o tabuleiro. Cada jogador vai
// alternadamente informando a posição onde deseja colocar a sua
// peça (“O' ou “X”). O programa deve impedir jogadas inválidas e
// determinar automaticamente quando o jogo terminou e quem foi o
// vencedor (jogador] ou jogador2). A cada nova jogada, o programa
// deve atualizar a situação do tabuleiro na tela.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        char[][] tabuleiro = new char[3][3];

        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.println("Jogador 1: X");
        System.out.println("Jogador 2: O");
        

        boolean ganhou = false;
        int jogada =1;
        char sinal;
        int linha = 0, coluna = 0;

        // 1) Inicializa tabuleiro com espaços
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }


        //1 - defina quem é o jogaor com a divisao por 2
        while (!ganhou){
            boolean linhaValida = false;
            boolean colunaValida = false;

            if (jogada%2 == 1){

                System.out.println("Jogador 1, é sua vez!");
                sinal = 'X';
            } else {
                System.out.println("Jogador 2, é sua vez!");
                sinal = 'O';
            }

            //2- define a validade da jogada com as linhas inseridas

            while(!linhaValida) {
                System.out.println("Digite a linha (1, 2 ou 3) para jogar.");
                linha = scan.nextInt() - 1;

                if(linha >=0 && linha <= 2) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida! Tente novamente.");
                }

            }

             //3 - define a validade da jogada com as colunas inseridas

            while (!colunaValida) {
                 System.out.println("Digite a coluna (1, 2 ou 3) para jogar.");
                coluna = scan.nextInt() - 1;

                if(coluna >=0 && coluna <= 2) {
                    colunaValida = true;
                } else {
                    System.out.println("coluna inválida! Tente novamente.");
                }
            }

            //4 - verifica se a columa já está preenchida

            if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Essa posição já está ocupada! Tente novamente.");
            } else {
                tabuleiro[linha][coluna] = sinal;
                jogada++;

                //5- imprimir o tabuleiro
                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro.length; j++) {
                        System.out.print(tabuleiro[i][j] + " | ");
                    }
                    System.out.println();
                }
            }
        
            

            //6 - verificar se o jogador ganhou
            //ganhou por linha
            if ((tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') ||
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') ||
             //ganhou por coluna
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') ||
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') ||
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') ||
            //ganhou por diagonal
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') ||
                (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) {

                    System.out.println("Jogador 1 ganhou!");
                    ganhou = true;      
            } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||
                (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') ||
                (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') ||
             //ganhou por coluna
                (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') ||
                (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') ||
                (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') ||
            //ganhou por diagonal
                (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') ||
                (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
                    System.out.println("Jogador 2 ganhou!");
                    ganhou = true;
            } else if (jogada == 9) {
                System.out.println("Empate!");
                ganhou = true;
            }
        }
    }
}
