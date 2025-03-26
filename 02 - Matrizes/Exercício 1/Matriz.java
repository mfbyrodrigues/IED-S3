/*
Crie 3 matrizes de tipos diferentes.
Em cada vetor crie o método de adicionar, remover por índice (diminuído o tamanho), remover por índice (mantendo o tamanho), exibir e tamanho.

1. Matriz inteiro;
2. Matriz string;
3. Matriz char.

*/

public class Matriz {

    // Declarações:
    private int[][] elementosI;
    private String[][] elementosS;
    private char[][] elementosC;
    private int linhas;
    private int colunas;

    // Construtor da classe:
    public Matriz(int linhas, int colunas) {

        this.linhas = linhas;
        this.colunas = colunas;
        this.elementosI = new int[linhas][colunas];
        this.elementosS = new String[linhas][colunas];
        this.elementosC = new char[linhas][colunas];
    }

    // FUNÇÕES PARA A MATRIZ DO TIPO INTEIRO:
    public void adicionarInteiro (int linha, int coluna, int elemento) { 

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosI[linha][coluna] = elemento;
        }
        else {
            System.out.println ("Ìndice inválido");
        } 
    }

    public void removerInteiroMantendo(int linha, int coluna) {

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosI[linha][coluna] = 0;
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void removerInteiroDiminuindo (int linha) { 

        if (linha >= 0 && linha < linhas) {
            
            int[][] novaMatriz = new int[linhas - 1][colunas];

            for (int i = 0, j = 0; i < linhas; i++) {
                if (i != linha) {
                    novaMatriz[j++] = elementosI[i];
                }
            }

            elementosI = novaMatriz;
            linhas--;
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void exibirInteiro() {

        for (int i = 0; i < elementosI.length; i++) {

            for (int j = 0; j < elementosI[i].length; j++) {
                System.out.print (elementosI[i][j] + " ");
            }

            System.out.println();
        }
    }

    public String tamanhoInteiro() { 
        return linhas + " x " + colunas;
    }

    // FUNÇÕES PARA A MATRIZ DO TIPO STRING:
    public void adicionarString (int linha, int coluna, String elemento) { 

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosS[linha][coluna] = elemento;
        }
        else {
            System.out.println ("Índice inválido.");
        } 
    }

    public void removerStringMantendo (int linha, int coluna) { 

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosS[linha][coluna] = null;
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void removerStringDiminuindo (int linha) { 

        if (linha >= 0 && linha < linhas) {

            String[][] novaMatriz = new String[linhas - 1][colunas];

            for (int i = 0, j = 0; i < linhas; i++) {
                if (i != linha) {
                    novaMatriz[j++] = elementosS[i];
                }
            }
            elementosS = novaMatriz;
            linhas--;
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void exibirString() {
        
        for (int i = 0; i < elementosS.length; i++) {

            for (int j = 0; j < elementosS[i].length; j++) {

                if (elementosS[i][j] != null) {
                    System.out.print (elementosS[i][j] + " ");
                }
                else {
                    System.out.print ("- ");
                }
            }

            System.out.println();
        }
    }

    public String tamanhoString() { 
        return linhas + " x " + colunas;
    }

    // FUNÇÕES PARA A MATRIZ DO TIPO CHAR:
    public void adicionarChar (int linha, int coluna, char elemento) { 

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosC[linha][coluna] = elemento;
        }
        else {
            System.out.println ("Índice inválido.");
        } 
    }

    public void removerCharMantendo(int linha, int coluna) {

        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            elementosC[linha][coluna] = '\u0000';
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void removerCharDiminuindo (int linha) { 

        if (linha >= 0 && linha < linhas) {

            char[][] novaMatriz = new char[linhas - 1][colunas];

            for (int i = 0, j = 0; i < linhas; i++) {
                if (i != linha) {
                    novaMatriz[j++] = elementosC[i];
                }
            }
            elementosC = novaMatriz;
            linhas--;
        }
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    public void exibirChar() {

        for (int i = 0; i < elementosC.length; i++) {

            for (int j = 0; j < elementosC[i].length; j++) {

                if (elementosC[i][j] != '\u0000') {
                System.out.print (elementosC[i][j] + " ");
                }
                else {
                    System.out.print ("- ");
                }
            }

            System.out.println();
        }
    }

    public String tamanhoChar() { 
        return linhas + " x " + colunas;
    }
    public static void main(String[] args) {
    
        // Matriz de inteiros
        Matriz elementosInteiro = new Matriz (3, 3);

        elementosInteiro.adicionarInteiro (0, 0, 1);
        elementosInteiro.adicionarInteiro (1, 1, 2);
        elementosInteiro.adicionarInteiro (2, 2, 3);

        System.out.println ("----------------------------------------");
        System.out.println ("Matriz de inteiros:");
        elementosInteiro.exibirInteiro();
        System.out.println ("Tamanho: " + elementosInteiro.tamanhoInteiro());
        System.out.println();

        elementosInteiro.removerInteiroDiminuindo(1);
        System.out.println ("Após remover linha:");
        elementosInteiro.exibirInteiro();
        System.out.println ("Tamanho: " + elementosInteiro.tamanhoInteiro());
        System.out.println();

        // Matriz de strings
        Matriz elementosString = new Matriz (3, 3);

        elementosString.adicionarString (0, 0, "Java");
        elementosString.adicionarString (1, 1, "C++");
        elementosString.adicionarString (2, 2, "Ruby");

        System.out.println ("----------------------------------------");
        System.out.println ("Matriz de strings:");
        elementosString.exibirString();
        System.out.println ("Tamanho: " + elementosString.tamanhoString());
        System.out.println();

        elementosString.removerStringDiminuindo (1);
        System.out.println ("Após remover linha:");
        elementosString.exibirString();
        System.out.println ("Tamanho: " + elementosString.tamanhoString());
        System.out.println();

        // Matriz de Chars
        Matriz elementosChar = new Matriz (3, 3);

        elementosChar.adicionarChar (0, 0, 'A');
        elementosChar.adicionarChar (1, 1, 'B');
        elementosChar.adicionarChar (2, 2, 'C');

        System.out.println ("----------------------------------------");
        System.out.println ("Matriz de chars:");
        elementosChar.exibirChar();
        System.out.println ("Tamanho: " + elementosChar.tamanhoChar());
        System.out.println();

        elementosChar.removerCharDiminuindo (1);
        System.out.println ("Após remover linha:");
        elementosChar.exibirChar();
        System.out.println ("Tamanho: " + elementosChar.tamanhoChar());
    }
}
