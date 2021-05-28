package prototype;

/**
 * Usually refactored in
 * Don't always jump to refactor
 */
public class PrototypeExample {

    public static void main(String[] args) {
        Register register = new Register();
        Item item = register.createItem("tv");
        System.out.println(item.getName());
    }
}
