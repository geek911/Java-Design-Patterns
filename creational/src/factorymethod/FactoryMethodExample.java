package factorymethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.newPersonalComputer();
    }
}
