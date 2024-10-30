package lv.rvt;

public class App {

    public static void main(String[] args) {
        Room room = new Room();
        room.addPerson(new Person("Lea", 183));
        room.addPerson(new Person("Kenya", 182));
        room.addPerson(new Person("Auli", 186));
        room.addPerson(new Person("Nina", 172));
        room.addPerson(new Person("Terhi", 185));
        
        while (!room.isEmpty()) {
            System.out.println(room.takePerson());
        }
    }
}