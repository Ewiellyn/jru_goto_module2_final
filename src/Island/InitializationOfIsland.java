package Island;

import Animals.*;
import Animals.Herbivorus.*;
import Animals.Predators.*;

import java.util.concurrent.ThreadLocalRandom;

public class InitializationOfIsland {
    // field of island is 5x5
    public static Organism[][] island;

    public static void initStartPosition(Organism organism) {
        while (true) {
            int number = ThreadLocalRandom.current().nextInt(0, 25);
            int x = (int) Math.floor(number / 5);
            int y = number % 5;
            if (island[x][y] == null) {
                island[x][y] = organism;
                break;
            }
        }
    }
}
