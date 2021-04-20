package sample;

public class Friend {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public Friend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String toString(){
        return name;
    }
}
