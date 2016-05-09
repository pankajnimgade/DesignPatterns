package three.source.easy.rule.shop;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class Person {

    private String name;

    private int age;

    private boolean isAdult;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
