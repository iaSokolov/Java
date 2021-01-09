package geekbreans.test.threading;

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
}