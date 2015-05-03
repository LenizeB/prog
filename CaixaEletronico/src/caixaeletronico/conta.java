package caixaeletronico;

import java.util.logging.Logger;

public class conta {

     private String agencia;
     private String numeroConta;
     private Cliente Correntista;
     private Float saldo;
     private Boolean ativa;

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCorrentista() {
        return Correntista;
    }

    public Float getSaldo() {
        return saldo;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCorrentista(Cliente Correntista) {
        this.Correntista = Correntista;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
  
    
     
     
    conta ()
    {
        this.agencia = null;
        this.numeroConta = null;
        this.nomeCorrentista = null;
        this.saldo = null;
        this.ativa = null;
    }

    void abrir(String nome, String ag, String numcont) {
        this.agencia = ag;
        numeroConta = numcont;
        ClienteCorrentista = nome;
        saldo = 0.0f;
        ativa = true;
    }

    Boolean fecharconta() {
        Boolean retorno;
        if (saldo == 0.0) {
            ativa = false;
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    Boolean deposito(float val) {
        if (ativa == true) {
            saldo = saldo + val;
            return true;
        } else {
            return false;
        }
    }

    Boolean saque(float saq) {
        if (saldo >= saq & ativa){
        saldo = saldo - saq;
        return true;
    }
        else
        {
            return false;
}
}
 Float retornarSaldo ()
 {
     return saldo;
 }
}