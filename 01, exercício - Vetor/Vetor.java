/*
Crie 3 vetores de tipos diferentes.
Em cada vetor crie o método de adicionar, remover por índice (diminuindo o tamanho), remover por índice (mantendo o tamanho), exibir e tamanho.

1. Vetor inteiro 
2. Vetor string 
3. Vetor char
*/

public class Vetor {

    // Declaração de vetores:
    private int VetorInteiro[];
    private String VetorString[];
    private char VetorChar[];

    // Outras variáveis usadas, caso tenha:
    private int Tamanho;

    // Construtor:
    public Vetor(int Capacidade) {
        this.VetorInteiro = new int[Capacidade];
        this.VetorString = new String[Capacidade];
        this.VetorChar = new char[Capacidade];
        this.Tamanho = 0;
    }

    // ESPAÇO DEDICADO AO VETOR INTEIRO!!!
    // Função para adicionar do vetor inteiro:
    public void AdicionarVetorInteiro (int Elemento) {

        if (Tamanho < VetorInteiro.length) {
            VetorInteiro[Tamanho] = Elemento;
            Tamanho++;
        }
        
        else {
            System.out.println ("O vetor do tipo inteiro está cheio!");
        }
    }

    // Função para remover por índice, DIMINUINDO O TAMANHO do vetor inteiro:
    public void RemoverPorIndiceVetorInteiroDT (int indice) {

        if (indice >= 0 && indice < Tamanho) {
            for (int i = indice; i < Tamanho - 1; i++) {
                VetorInteiro[i] = VetorInteiro[i + 1];
            }

            Tamanho--;
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para remover por índice, MANTENDO O TAMANHO do vetor inteiro:
    public void RemoverPorIndiceVetorInteiroMT (int indice) {

        if (indice >= 0 && indice < Tamanho) {
            VetorInteiro[indice] = 0;
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para exibir o vetor inteiro:
    public void ExibirVetorInteiro () {

        System.out.print ("Vetor Inteiro: ");

        for (int i = 0; i < Tamanho; i++) {
            System.out.print (VetorInteiro[i] + " ");
        }
    }

    // Função para mostrar o tamanho do vetor inteiro:
    public int MostrarTamanhoVetorInteiro () {

        return Tamanho;
    }

    // ESPAÇO DEDICADO AO VETOR STRING!!!
    // Função para adicionar do vetor string:
    public void AdicionarVetorString (String Elemento) {

        if (Tamanho < VetorString.length) {
            VetorString[Tamanho] = Elemento;
            Tamanho++;
        }
        
        else {
            System.out.println ("O vetor do tipo string está cheio!");
        }
    }

    // Função para remover por índice, DIMINUINDO O TAMANHO do vetor string:
    public void RemoverPorIndiceVetorStringDT (int indice) {

        if (indice >= 0 && indice < Tamanho) {
            for (int i = indice; i < Tamanho - 1; i++) {
                VetorString[i] = VetorString[i + 1];
            }

            Tamanho--;
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para remover por índice, MANTENDO O TAMANHO do vetor string:
    public void RemoverPorIndiceVetorStringMT (int indice) {

        if (indice >= 0 && indice < Tamanho) {
            VetorString[indice] = null;
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para exibir o vetor string:
    public void ExibirVetorString () {

        System.out.print("Vetor String: ");

        for (int i = 0; i < Tamanho; i++) {
            System.out.print (VetorString[i] + " ");
        }
    }

    // Função para mostrar o tamanho do vetor string:
    public int MostrarTamanhoVetorString () {
        return Tamanho;
    }

    // ESPAÇO DEDICADO AO VETOR CHAR!!!
    // Função para adicionar do vetor char:
    public void AdicionarVetorChar (char Elemento) {

        if (Tamanho < VetorChar.length) {
            VetorChar[Tamanho] = Elemento;
            Tamanho++;
        }

        else {
            System.out.println ("O vetor do tipo char está cheio!");
        }
    }

    // Função para remover por índice, DIMINUINDO O TAMANHO do vetor char:
    public void RemoverPorIndiceVetorCharDT (int indice) {
        if (indice >= 0 && indice < Tamanho) {

            for (int i = indice; i < Tamanho - 1; i++) {
                VetorChar[i] = VetorChar[i + 1];
            }

            Tamanho--;
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para remover por índice, MANTENDO O TAMANHO do vetor char:
    public void RemoverPorIndiceVetorCharMT (int indice) {
        
        if (indice >= 0 && indice < Tamanho) {
            VetorChar[indice] = '\0';
        }
        
        else {
            System.out.println ("Índice inválido para remoção.");
        }
    }

    // Função para exibir o vetor char:
    public void ExibirVetorChar () {

        System.out.print ("Vetor Char: ");

        for (int i = 0; i < Tamanho; i++) {
            System.out.print (VetorChar[i] + " ");
        }
    }

    // Função para mostrar o tamanho do vetor string:
    public int MostrarTamanhoVetorChar () {

        return Tamanho;
    }



    // Main para testar a classe "Vetor":
    public static void main (String[] args) {

        Vetor vetor = new Vetor(3);

        // Teste do vetor do tipo inteiro:
        System.out.println ("\nVetor inteiro:");
        System.out.println("\n");

        vetor.AdicionarVetorInteiro(1);
        vetor.AdicionarVetorInteiro(2);
        vetor.AdicionarVetorInteiro(3);
        vetor.ExibirVetorInteiro();
        System.out.println ("\nTamanho normal: " + vetor.MostrarTamanhoVetorInteiro());

        vetor.RemoverPorIndiceVetorInteiroDT(1);  
        vetor.ExibirVetorInteiro();
        System.out.println ("\nTamanho diminuindo o tamanho: " + vetor.MostrarTamanhoVetorInteiro());

        vetor.RemoverPorIndiceVetorInteiroMT(0); 
        vetor.ExibirVetorInteiro();
        System.out.println ("\nTamanho mantendo o tamanho: " + vetor.MostrarTamanhoVetorInteiro());

        // Teste do vetor do tipo string:
        System.out.println ("\nVetor string:");
        System.out.println("\n");

        vetor.AdicionarVetorString("Robin");
        vetor.AdicionarVetorString("Zoro");
        vetor.AdicionarVetorString("Chopper");
        vetor.ExibirVetorString();
        System.out.println ("\nTamanho normal: " + vetor.MostrarTamanhoVetorString());

        vetor.RemoverPorIndiceVetorStringDT(1); 
        vetor.ExibirVetorString();
        System.out.println ("\nTamanho diminuindo o tamanho: " + vetor.MostrarTamanhoVetorString());

        vetor.RemoverPorIndiceVetorStringMT(0);  
        vetor.ExibirVetorString();
        System.out.println ("\nTamanho mantendo o tamanho: " + vetor.MostrarTamanhoVetorString());

        // Teste do vetor do tipo char:
        System.out.println("\nVetor char:");
        System.out.println("\n");

        vetor.AdicionarVetorChar('A');
        vetor.AdicionarVetorChar('B');
        vetor.AdicionarVetorChar('C');
        vetor.ExibirVetorChar();
        System.out.println ("\nVetor normal: " + vetor.MostrarTamanhoVetorChar());

        vetor.RemoverPorIndiceVetorCharDT(1); 
        vetor.ExibirVetorChar();
        System.out.println ("\nVetor diminuindo o tamanho: " + vetor.MostrarTamanhoVetorChar());

        vetor.RemoverPorIndiceVetorCharMT(0); 
        vetor.ExibirVetorChar();
        System.out.println ("\nVetor mantendo o tamanho: " + vetor.MostrarTamanhoVetorChar());
    }
}
