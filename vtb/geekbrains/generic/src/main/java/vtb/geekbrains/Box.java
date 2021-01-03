package vtb.geekbrains;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> list;

    public ArrayList<T> getList() {
        return list;
    }

    public Box() {
        this.list = new ArrayList<T>();
    }

    public float getWeight() {
        float weight;
        weight = 0;
        for (T fruit : this.list) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(box.getWeight() - this.getWeight()) < 0.0001;
    }

    public void intersperse(Box<T> box) {
        this.list.addAll(box.getList());
        box.getList().clear();
    }
}