public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators = new GameCalculator[]{new ManGameCalculator(), new WomenGameCalculator(),new KidsGameCalculator() };
        for (GameCalculator gamecalc:gameCalculators){
            gamecalc.hesapla();
            gamecalc.gameOver();
        }
    }
}