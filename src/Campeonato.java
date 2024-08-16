import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private List<Divisao> divisoes;

    Campeonato (String nome){
        this.nome = nome;
        this.divisoes = new ArrayList<>();
    }

    public void addDivisao(Divisao divisao){
        this.divisoes.add(divisao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Divisao> getDivisoes() {
        return divisoes;
    }
}
