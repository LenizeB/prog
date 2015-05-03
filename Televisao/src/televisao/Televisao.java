package televisao;

import javax.swing.JOptionPane;

public class Televisao {

    public static void main(String[] args) {
        Ator a = new Ator();
        Integer op = 0;

        JOptionPane.showInputDialog("digite\n1-Ator\n"
                + "2-Novela\n"
                + "3-Emissora\n"
                + "4-Apresentador\n"
                + "5-Sair");
        switch (op) {
            case 1: {

                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }
            case 4: {
                JOptionPane.showInputDialog("insira o cache, ganhos e salario mensal do apresentador");
                JOptionPane.showMessageDialog(null,Ator.class);
                break;
            }
            case 5: {
                JOptionPane.showMessageDialog(null, "Muito obrigado por usar o nosso sistema!!!\nvolte sempre!!!");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Opcao invalida!!!");
            }
        }
    }
}
