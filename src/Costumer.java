import java.io.Serializable;

public record Costumer(Long id, String name, String phoneNumber) implements Serializable {

    public static int COUNT = 0;

    public void myMethod() {}
}
