package exercises.Ex6;

public class PhoneNumberAlreadyExists extends Exception{

    public PhoneNumberAlreadyExists() {
        super();
    }

    public PhoneNumberAlreadyExists(String message) {
        super(message);
    }
}