package caixaeletronico;

public class Banco {

    String numBanc;
    String nomeBanc;

   void buscarBanco(String nb) {
        if (nb.equals("001")) {
            numBanc = nb;
            nomeBanc = "Banco do Brasil";
        } else if (nb.equals("047")) {
            numBanc = nb;
            nomeBanc = "Banco do Estado do Sergipe";
        } else if (nb.equals("037")) {
            numBanc = nb;
            nomeBanc = "Banco do estado do Pará";
        }
        else if (nb.equals("041")) {
            numBanc = nb;
            nomeBanc = "Banco do Estado do Rio Grande do Sul";
        }
        else if (nb.equals("004")) {
            numBanc = nb;
            nomeBanc = "Banco do Nordeste do Brasil";
        }
        else {
        numBanc = null;
         nomeBanc = null;
        }
   }
}
          
