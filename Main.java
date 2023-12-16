
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Workers worker = new Workers("Тимофей", "Тарасов", "Системыный администратор"); // экзампляр класса Workers, Workers является наследником класса People
        Workers worker1 = new Workers("Айрат", "Фахрутдинов", "PR-менеджер");
        Workers worker2 = new Workers("Амир", "Курмаев", "Продавец");

        Viewers viewer = new Viewers("Тимофей", "Тарасов", 43);
        Viewers viewer1 = new Viewers("Айрат", "Фахрутдинов", 52);
        Viewers viewer2 = new Viewers("Амир", "Курмаев", 14);

        store.insertPeoples(worker1);
        store.insertPeoples(worker);
        store.insertPeoples(worker2);
        store.insertPeoples(viewer2);
        store.insertPeoples(viewer);
        store.insertPeoples(viewer1);

        store.printPeople();
    }
}