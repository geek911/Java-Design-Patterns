package factorymethod;

public class ComputerFactory {
    public static Computer newLaptop() {
        return new Laptop();
    }

    public static Computer newPersonalComputer() {
        return new PersonalComputer();
    }

    public static Computer nweSmartPhone() {
        return new SmartPhone();
    }
}
