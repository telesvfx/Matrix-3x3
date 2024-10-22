import javax.swing.JOptionPane;

public class ThiagoTelesSilva_Ag10_DS_I {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 3;
        int[][] numeros = new int[linhas][colunas];
        int soma = 0;

        JOptionPane.showMessageDialog(null, "Por favor, insira os valores da matriz 3x3.");

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                boolean validar = false;
                while (!validar) {
                    try {
                        String entrada = JOptionPane.showInputDialog("Matriz 3x3\n" + 
                            "Por favor, insira o valor para a linha " + (l + 1) + " - coluna " + (c + 1) + ":");
                        if (entrada == null) {
                            JOptionPane.showMessageDialog(null, "Entrada cancelada. Encerrando o programa.");
                            return;
                        }
                        numeros[l][c] = Integer.parseInt(entrada);
                        validar = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
                    }
                }
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                soma += numeros[l][c];
            }
        }

        JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é: " + soma);
    }
}