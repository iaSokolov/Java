package vtb.geekbreans.race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Race {
    public CountDownLatch start;

    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(int cars, Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.start = new CountDownLatch(cars);
    }
}
