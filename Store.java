import java.util.ArrayList;

public class Store {
    protected ArrayList<People> peoples;


    Store() {
        this.peoples = new ArrayList<People>();
    }
    public void insertPeoples(People people) {
        peoples.add(people);
    }
    public void printPeople() {
        for(People people : peoples) {
            people.print();
        }
    }
}
