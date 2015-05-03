
package caixaeletronico;

public class Cliente {
    
    private String nome;
    private String nomemae;
    private String nomepai;
    private String datnascimento;
    private String endereco;
    private String cpf;
    private boolean negativadoSPC;
    private boolean negativadoSERASA;

    public String getNome() {
        return nome;
    }

    public String getNomemae() {
        return nomemae;
    }

    public String getNomepai() {
        return nomepai;
    }

    public String getDatnascimento() {
        return datnascimento;
    }

    public String getEndereço() {
        return endereco;
    }

    public boolean isSPC() {
        return negativadoSPC;
    }

    public boolean isSERASA() {
        return negativadoSERASA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public void setDatnascimento(String datnascimento) {
        this.datnascimento = datnascimento;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereco;
    }

    public void setSPC(boolean SPC) {
        this.negativadoSPC = SPC;
    }

    public void setSERASA(boolean SERASA) {
        this.negativadoSERASA = SERASA;
    }
    
    public Boolean verificarCredito(String nome){
        {
            Boolean retorno;
            if(this.negativadoSPC == false && this.negativadoSERASA == false)
            {
                retorno = true;
            }
            else
            {
                retorno = false;
            }
       return retorno ;
       
                           
       
    } 
            
    
}
                