import java.time.LocalDate;
import java.time.LocalTime;

public class Jogo {
    private Time timeMandante;
    private Time timeVisitante;
    private Estadio estadio;
    private LocalDate data;
    private LocalTime hora;
    private int placarMandante = 0;
    private int placarVisitante = 0;
    private StatusJogo status = StatusJogo.AGENDADO;

    public Jogo(Time timeMandante, Time timeVisitante) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
    }

    public enum StatusJogo {
        AGENDADO,
        EM_ANDAMENTO,
        PARALISADO,
        FINALIZADO,
        ADIADO
    }

    public Time getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public StatusJogo getStatus() {
        return status;
    }

    public void setStatus(StatusJogo status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
                "Jogo: %s vs %s\nEstádio: %s\nData: %s\nHora: %s\nPlacar: %d - %d\nStatus: %s",
                timeMandante, timeVisitante, estadio != null ? estadio : "Não definido",
                data != null ? data : "Não definida", hora != null ? hora : "Não definida",
                placarMandante, placarVisitante, status);
    }
}
