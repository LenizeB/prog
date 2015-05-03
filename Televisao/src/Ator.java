public class Ator {

    private String nome;
    private Integer datan;
    private Integer quantidaden;
    private String email;
    private String nomeart;
    private Double salariomen;
    private Double cache;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    private Integer quantidadeevent;
    
    Ator() {
        this.bairro = null;
        this.cache = 0d;
        this.cidade = null;
        this.datan = 0;
        this.email = null;
        this.endereco = null;
        this.estado = null;
        this.nome = null;
        this.nomeart = null;
        this.quantidaden = 0;
        this.salariomen = 0d;
    }

    public Integer getQuantidadeevent() {
        return quantidadeevent;
    }

    public void setQuantidadeevent(Integer quantidadeevent) {
        this.quantidadeevent = quantidadeevent;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDatan() {
        return datan;
    }

    public void setDatan(Integer datan) {
        this.datan = datan;
    }

    public Integer getQuantidaden() {
        return quantidaden;
    }

    public void setQuantidaden(Integer quantidaden) {
        this.quantidaden = quantidaden;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public Double getSalariomen() {
        return salariomen;
    }

    public void setSalariomen(Double salariomen) {
        this.salariomen = salariomen;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    String status() {
        String retorno = null;
        if (quantidaden <= 3 && salariomen <= 5000) {
            retorno = "calouro";
        } else if (quantidaden <= 6) {
            retorno = "revelação";
        } else if (quantidaden <= 6 && salariomen >= 30000) {
            retorno = "joia";
        } else if (quantidaden <= 9 && salariomen <= 30000) {
            retorno = "elenco de apoio";
        } else if (salariomen > 30000 && salariomen < 100000) {
            retorno = "elenco principal";
        } else if (salariomen >= 100000) {
            retorno = "estrela";
        } else {
            retorno = "elenco regular";
        }
        return retorno;
    }

    Double ganhos(Integer quantidadeevent) {
        Double ganhos = (quantidadeevent * cache) + salariomen;

        return ganhos;
    }

}
