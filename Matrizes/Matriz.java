public class Matriz {

    // Declarações:
    private int matriz[][] elementos;
    private int linhas;
    private int colunas;

    // Construtor da classe:
    public Matriz (int indexlinha, int indexcoluna) {
        
        this.linhas = indexlinha;
        this.colunas = indexcoluna;
        this.elementos = new int [indexlinha][indexcoluna];
    }

    // Função para adicionar elementos na matriz:
    public void Adicionar (int indexlinha, int indexcoluna, int elementos) {

        if (indexlinha >= 0 && indexlinha < linhas && indexcoluna >= 0) {
            elementos[linha][coluna] = valor;
        }
        else {
            System.out.println ("Ìndice inválido");
        } 
    }

    // Função para exibir elementos:
    public void Exibir () {

        for (int x = 0; x < linhas; x++) { // Percorrer as linhas
            for (int y = 0; y < colunas; y++) { // Percorrer as colunas que ficam dentro das linhas 
                System.out.print (elementos[x][y]); // Mostrar os elementos da matriz
            }

        System.out.println();
        }
    }

    // Função para deletar elementos:
    public void Deletar (int indexlinha, int indexcoluna) {

        if (indexlinha >= 0 && indexlinha < linhas && indexcoluna >= 0) {
            elementos[linha][coluna] = 0;
        }
        else {
            System.out.println ("Ìndice inválido");
        } 
    }

    public static void main (String [] args) throws Exception { // "throws Exception" paranoia de erros! you aaaaaaaaaaare the only exception AAAAAAAAAAAAAAAAAAAA

        Matriz matriz = new Matriz(linha:3, coluna: 3);

        matriz.Adcionar (0, 0, 13);

        matriz.Exibir();

        matriz.Deletar (0, 0);
    }
}
