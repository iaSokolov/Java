package vtb.geekbreans;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr;
    static float[] arr1;
    static float[] arr2;

    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime;

        init();

        startTime = System.currentTimeMillis();
        calcDirect();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        init();

        startTime = System.currentTimeMillis();
        calcThread();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

    public static void init() {
        arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void calcDirect() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void calcThread() throws InterruptedException {
        arr1 = new float[HALF];
        arr2 = new float[HALF];

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t1 = new Thread(() -> calc1());
        t1.start();

        Thread t2 = new Thread(() -> calc2());
        t2.start();

        t1.join();
        t2.join();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
    }

    public static void calc1() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void calc2() {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }


    public class MainClass {
        public static final int CARS_COUNT = 4 ;
        public static void main (String[] args) {
            System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!" );
            Race race = new Race( new Road( 60 ), new Tunnel(), new Road( 40 ));
            Car[] cars = new Car[CARS_COUNT];
            for ( int i = 0 ; i < cars.length; i++) {
                cars[i] = new Car(race, 20 + ( int ) (Math.random() * 10 ));
            }
            for ( int i = 0 ; i < cars.length; i++) {
                new Thread(cars[i]).start();
            }
            System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!" );
            System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!" );
        }
    }
    public class Car implements Runnable {
        private static int CARS_COUNT;
        static {
            CARS_COUNT = 0 ;
        }

        private Race race;
        private int speed;
        private String name;
        public String getName () {
            return name;
        }
        public int getSpeed () {
            return speed;
        }
        public Car (Race race, int speed) {
            this .race = race;
            this .speed = speed;
            CARS_COUNT++;
            this .name = "Участник #" + CARS_COUNT;
        }
        @Override
        public void run () {
            try {
                System.out.println( this .name + " готовится" );
                Thread.sleep( 500 + ( int )(Math.random() * 800 ));
                System.out.println( this .name + " готов" );
            } catch (Exception e) {
                e.printStackTrace();
            }
            for ( int i = 0 ; i < race.getStages().size(); i++) {
                race.getStages().get(i).go( this );
            }
        }
    }
    public abstract class Stage {
        protected int length;
        protected String description;
        public String getDescription () {
            return description;
        }
        public abstract void go (Car c);
    }
    public class Road extends Stage {
        public Road ( int length) {
            this .length = length;
            this .description = "Дорога " + length + " метров" ;
        }
        @Override
        public void go (Car c) {
            try {
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000 );
                System.out.println(c.getName() + " закончил этап: " + description);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            

}
