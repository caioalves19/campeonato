import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private String ano;
    private List<Fase> fases;

    Temporada(String ano){
        this.ano = ano;
        this.fases = new ArrayList<>();
    }

    public void addFase(Fase fase){
        this.fases.add(fase);
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public List<Fase> getFases() {
        return fases;
    }
}
