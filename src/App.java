public class App {
    public static void main(String[] args) throws Exception {
        Campeonato serieA = new Campeonato("Campeonato Brasileiro");

        serieA.setNome("Brasileirão");

        System.out.println(serieA.getNome());
    }
}
