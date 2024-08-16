import java.util.ArrayList;
import java.util.List;

public class Divisao {
    private String nome;
    private List<Temporada> temporadas;

    Divisao(String divisao){
        this.nome = divisao;
        this.temporadas = new ArrayList<>();
    }

    public void addTemporada(Temporada temporada){
        this.temporadas.add(temporada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String divisao) {
        this.nome = divisao;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }
}
