public class Viewers extends People {
    protected int age;
    Viewers(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
    }
    void print() {
        System.out.println(this.surname + " " + this.name + " " + this.age);
    }
}
