import java.util.ArrayList;
import java.util.List;

public class Fase {
    private String nome;
    private List<Rodada> rodadas;

    Fase(String nome){
        this.nome = nome;
        this.rodadas = new ArrayList<>();
    }

    public void addRodada(Rodada rodada){
        this.rodadas.add(rodada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }
}
