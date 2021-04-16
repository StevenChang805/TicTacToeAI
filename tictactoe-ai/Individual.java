import java.util.Arrays;
import java.util.Random;

public class Individual {
    private String name;
    private double chromosome[];
    private int fitness = 0;

    public Individual(String name, int boardX, int boardY, boolean random) {
        this.name = name;
        chromosome = new double[boardX * boardY];
        if (random) {
            randomizeGenes();
        }
    }

    public String getName() {
        return name;
    }

    public void randomizeGenes() {
        Random r = new Random();
        for (int i = 0; i < chromosome.length; i++) {
            chromosome[i] = r.nextDouble();
        }
    }

    public void setZero() {
        Arrays.fill(chromosome, 0);
    }

    public void setGenes(Individual p1, Individual p2, int crossover) {
        for (int i = 0; i < crossover; i++) {
            chromosome[i] = p1.getGene(i);
        }
        for (int i = crossover; i < chromosome.length; i++) {
            chromosome[i] = p2.getGene(i);
        }
    }

    public void mutation(double rate) {
        Random r = new Random();
        for (int i = 0; i < chromosome.length; i++) {
            if (r.nextDouble() <= rate) {
                chromosome[i] = 1 - chromosome[i];
            }
        }
    }

    public double getGene(int index) {
        return chromosome[index];
    }

    public void increaseFitness() {
        fitness++;
    }

    public int getFitness() {
        return fitness;
    }
}
