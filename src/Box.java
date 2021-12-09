import java.util.ArrayList;

public class Box<F extends Fruit> {
    private ArrayList<F> fruits = new ArrayList();

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0f;
        for (F f : fruits) {
            weight += f.getWeight();
        }
        return weight;
    }

    public int getCount() {
        return fruits.size();
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }

    public void shift(Box box) throws DifferentFruitType {
        if ( box.fruits.isEmpty() ) return;
        if ( !this.fruits.isEmpty() ){
            if ( box.fruits.get(0).getClass() != this.fruits.get(0).getClass() ) {
                throw new DifferentFruitType();
            }
        }
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
    }
}

