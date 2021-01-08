package vtb.geekbreans.race;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {



    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                Main.Semaphore.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
                Main.Semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " +
                        description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
