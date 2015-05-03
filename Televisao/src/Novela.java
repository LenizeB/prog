public class Novela {

    private String titulo;
    private Integer periododuracao;
    private Integer pcapitulo;
    private Integer ucapitulo;
    private Double horario;
    private String autorn;
    private String emissora;
    private Double ibope;
    private Boolean violencia;
    private Boolean sexo;
    private Boolean drogas;

    Novela() {
        this.autorn = null;
        this.drogas = false;
        this.emissora = null;
        this.horario = 0d;
        this.ibope = 0d;
        this.pcapitulo = 0;
        this.periododuracao = 0;
        this.sexo = false;
        this.titulo = null;
        this.ucapitulo = 0;
        this.violencia = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPeriododuracao() {
        return periododuracao;
    }

    public void setPeriododuracao(Integer periododuracao) {
        this.periododuracao = periododuracao;
    }

    public Double getHorario() {
        return horario;
    }

    public void setHorario(Double horario) {
        this.horario = horario;
    }

    public String getAutorn() {
        return autorn;
    }

    public void setAutorn(String autorn) {
        this.autorn = autorn;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public Boolean getViolencia() {
        return violencia;
    }

    public void setViolencia(Boolean violencia) {
        this.violencia = violencia;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean getDrogas() {
        return drogas;
    }

    public void setDrogas(Boolean drogas) {
        this.drogas = drogas;
    }

    String novela() {
        String retorno;
        if (violencia == true && sexo == true && drogas == true) {
            retorno = "recomendado para maior de 18 anos";
        } else if (violencia == true && sexo == false && drogas == true) {
            retorno = "recomendado para maior de 16 anos";
        } else if (violencia == true && sexo == false && drogas == false) {
            retorno = "recomendado para maior de 14 anos";
        } else {
            retorno = "livre para todos os publicos";
        }
        return retorno;
    }

}
