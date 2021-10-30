import java.util.Objects;

public class Costumer2 {

    private final Long id;
    private final String name;
    private final String phoneNumber;

    public Costumer2(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Costumer2)) return false;
        Costumer2 costumer2 = (Costumer2) o;
        return getId().equals(costumer2.getId()) && getName().equals(costumer2.getName()) && getPhoneNumber().equals(costumer2.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Costumer2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
