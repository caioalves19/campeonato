import java.time.LocalDate;

public class Time {
    private String nome;
    private LocalDate dataFundacao;
    private Estadio estadioPadrao;

    public Time(String nome, LocalDate dataFundacao, Estadio estadioPadrao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estadioPadrao = estadioPadrao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Estadio getEstadioPadrao() {
        return estadioPadrao;
    }

    public void setEstadioPadrao(Estadio estadioPadrao) {
        this.estadioPadrao = estadioPadrao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nData de Fundação: %s\nEstádio Padrão: %s",
                nome, dataFundacao, estadioPadrao != null ? estadioPadrao : "Não definido");
    }

}
