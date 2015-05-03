public class Emissora {

    private String nome = null;
    private String endereco = null;
    private Boolean tvaberta = false;
    private Boolean tvfechada = true;

    Emissora() {
        this.endereco = null;
        this.nome = null;
        this.tvaberta = false;
        this.tvfechada = true;
    }

    public Boolean getTvaberta() {
        return tvaberta;
    }

    public void setTvaberta(Boolean tvaberta) {
        this.tvaberta = tvaberta;
    }

    public Boolean getTvfechada() {
        return tvfechada;
    }

    public void setTvfechada(Boolean tvfechada) {
        this.tvfechada = tvfechada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
