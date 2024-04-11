package Animals.Herbivorus;

import Animals.Organism;
import Island.InitializationOfIsland;

public class Boar implements Organism, Runnable {
    public static final double weight = 400;
    public boolean isAlive = true;



    public void run() {
        InitializationOfIsland.initStartPosition(new Boar());

    }
}
