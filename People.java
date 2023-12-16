public abstract class People {
    protected String name;
    protected String surname;

    People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract void print();
}
