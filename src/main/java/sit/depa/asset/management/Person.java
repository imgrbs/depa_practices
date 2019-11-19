package sit.depa.asset.management;

public class Person implements Comparable<Person> {

    private final int id;
    private final String firstname;
    private final String lastname;

    public Person(int id, String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id == ((Person) obj).id;
    }

    @Override
    public int compareTo(Person p) {
        return this.id - p.id;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }

}
