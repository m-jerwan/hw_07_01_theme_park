public class Visitor {
    private int age;
    private int height;
    private String name;
    private int money;


    public Visitor(int age, int height, String name, int money) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
