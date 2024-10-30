package lv.rvt;
import java.util.*;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortestPerson() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);
        for (Person person: persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;

    }

    public Person takePerson() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = shortestPerson();
        persons.remove(shortest);
        return shortest;
    }

}
