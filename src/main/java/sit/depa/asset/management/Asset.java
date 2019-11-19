package sit.depa.asset.management;

public class Asset implements Comparable<Asset> {
    
    private final int code;
    private final String name;

    public Asset(int code, String name) {
        this.name = name;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Asset{" + "code=" + code + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.code;
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
        return this.code == ((Asset) obj).code;
    }

    @Override
    public int compareTo(Asset as) {
        return this.code - as.code;
    }
}
