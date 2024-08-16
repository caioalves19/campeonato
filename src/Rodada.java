import java.util.ArrayList;
import java.util.List;

public class Rodada {
    private int rodada;
    private List<Jogo> jogos;

    Rodada(int rodada){
        this.rodada = rodada;
        this.jogos = new ArrayList<>();
    }

    public void addJogo(Jogo jogo){
        this.jogos.add(jogo);
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
}
