package builder;

public class Person {

    private final String firstName;
    private final String lastName;
    private int age;
    private Gender gender;
    private String nickname;
    private String phoneNumber;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.nickname = builder.nickname;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {


        private String firstName;
        private String lastName;
        private int age;
        private Gender gender;
        private String nickname;
        private String phoneNumber;

        // mandatory fields are placed right here
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder gender(Gender value) {
            this.gender = value;
            return this;
        }

        public Builder nickname(String value) {
            this.nickname = value;
            return this;
        }

        public Builder phoneNumber(String value) {
            this.phoneNumber = value;
            return this;
        }

        public Person builder() {
            Person person = new Person(this);
            validation(person); // validate the object
            return person;
        }

        // carry out the validation before the actual objected is created
        private void validation(Person person) {

        }


    }


}
