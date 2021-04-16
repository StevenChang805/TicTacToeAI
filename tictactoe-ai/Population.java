public class Population {
    private Individual population[];
    private final int sz;
    private final int boardX;
    private final int boardY;
    private int generation = 0;

    public Population(int size, int boardX, int boardY) {
        population = new Individual[size];
        sz = size;
        this.boardX = boardX;
        this.boardY = boardY;
        initializePopulation();
    }

    public void initializePopulation() {
        for (int i = 0; i < sz; i++) {
            population[i] = new Individual("Member"+i, boardX, boardY, true);
        }
    }

    public void fitness() {

    }

    public void nextGeneration() {
        generation++;

    }
}
