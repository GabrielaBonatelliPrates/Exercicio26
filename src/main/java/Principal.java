


import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Principal {

    public static void main(String[] args) {
  int qtde = 20;
        int vetor[] = new int[qtde];
     
        for (int i = 0; i < qtde; i++){
                    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
                            }
                for (int i = 0; i < qtde; i++){
               for (int j = i + 1; j < qtde; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;                    
                }
            }
        }
                for (int i=0; i<vetor.length; i++){
                        JOptionPane.showMessageDialog(null, vetor[i]);

                }
    }
}
    
