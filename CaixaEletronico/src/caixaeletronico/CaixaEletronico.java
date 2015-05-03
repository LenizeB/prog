package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {

//        Boolean dcerto;
//        conta c = new conta();
//
//        c.abrir("0001", "123456", "Marcelo");
//        dcerto = c.deposito(10.0f);
//        if (dcerto == true) {
//            JOptionPane.showMessageDialog(null, "Deposito de R$ 10,00");
//        } else {
//            JOptionPane.showMessageDialog(null, "Operação não realizada");
//        }
//        dcerto = c.saque (20.00f);
//        if (dcerto == true) {
//            JOptionPane.showMessageDialog(null, "Saque de R$ 20,00");
//        } else {
//            JOptionPane.showMessageDialog(null, "Operação não realizada");
//        }
//        dcerto = c.saque(5.0f);
//        if (dcerto== true)
//        {
//            JOptionPane.showMessageDialog(null, "Saque de R$ 5,00");
//        } else {
//            JOptionPane.showMessageDialog(null, "Operação não realizada");
//        }
//        JOptionPane.showMessageDialog(null, "Saldo: " + c.retornarSaldo());
//    }
        Integer op = -1;
        conta c = new conta();
      while (op != 7) {
        op = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n1. Abrir conta "
                + "\n2. Consultar saldo "
                + "\n3. Depositar "
                + "\n4. Sacar "
                + "\n5. Consultar saldo final"
                + "\n6. Virificar qual banco é"
                + "\n7. Resumo"
                + "\n8. Fechar conta."));

        switch (op) {
            case 1:{
                String nome, agencia, numero;
                nome = JOptionPane.showInputDialog("Correntista: ");
                agencia = JOptionPane.showInputDialog("Agencia: ");
                numero = JOptionPane.showInputDialog("Numero");
                c.abrir(nome, agencia, numero);
                JOptionPane.showMessageDialog(null, "A conta foi aberta");
                 
                    break;
                }
            case 2: {
                JOptionPane.showMessageDialog(null, "Seu saldo é de:" + c.retornarSaldo());

                break;
            }
            case 3: {
                float vl = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
                boolean deucerto = c.deposito(vl);
                if (deucerto == true) {
                    JOptionPane.showMessageDialog(null, "Ok ");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel depositar. ");
                }
                break;
            }
            case 4: {
                float sq = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
                boolean certo = c.saque(sq);
                if (certo == true) {
                    JOptionPane.showMessageDialog(null, "Ok ");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel fazer o saque.");
                }
                break;
            }
            case 5: {
                JOptionPane.showMessageDialog(null, "Seu saldo final é de:" + c.retornarSaldo());
                break;
            }
            case 6: {
                String pc = "-1";
                Banco b = new Banco();

                pc = JOptionPane.showInputDialog("1. 001 "
                        + "\n2. 047 "
                        + "\n3. 037 "
                        + "\n4. 041 "
                        + "\n5. 004 ");
                b.buscarBanco(pc);
                JOptionPane.showMessageDialog(null, "O seu banco é " + b.nomeBanc);

                break;
            }
            case 7:{//resumo
                            JOptionPane.showMessageDialog(null, "Nome do correntista: " + c.nomeCorrentista + "\nAgencia: " + c.agencia + "\nNumero da conta: " + c.numeroConta);
               break; 
            }
            case 8: {
                c.fecharconta();

                JOptionPane.showMessageDialog(null, "A conta foi fechada");
                break;
            }
            default: {

            }
        }
    }
}
}