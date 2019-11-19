package sit.depa.asset.management;

public class Company implements Comparable<Company> {

    private final int id;
    private final String name;

    public Company(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        return this.id == ((Company) obj).id;
    }

    @Override
    public int compareTo(Company c) {
        return this.id - c.id;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + '}';
    }

}
