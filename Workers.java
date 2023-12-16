public class Workers extends People {
    protected String dolshnost;
    Workers(String name, String surname, String dolshnost) {
        super(name, surname);
        this.dolshnost = dolshnost;
    }
    void print() {
        System.out.println(this.surname + " " + this.name + " " + this.dolshnost);
    }
}
