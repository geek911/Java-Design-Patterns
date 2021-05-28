package builder;


/**
 * Builder patterns are mainly used when the object
 * to be created have too many fields and some sort of
 * organization is needed
 * NB : The object returned must be immutable
 */
public class BuilderExample {
    public static void main(String[] args) {

        /**
         * Mandatory fields are passed in the contractor
         * and optional fields are placed with a dot e.g .age(25)
         */
        Person.Builder builder = new Person.Builder("Moses", "Chawawa")
                .age(25)
                .gender(Gender.MALE)
                .nickname("GEEK911")
                .phoneNumber("73232803");

        Person person = builder.builder();

        System.out.printf("Fullname : %s %s\n", person.getFirstName(), person.getLastName());
    }
}
