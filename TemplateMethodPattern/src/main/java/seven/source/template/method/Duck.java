package seven.source.template.method;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(Duck duck) {
        if (this.weight < duck.getWeight()) {
            return -1;
        } else if (this.weight == duck.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", \t Weight: " + weight;
    }
}
